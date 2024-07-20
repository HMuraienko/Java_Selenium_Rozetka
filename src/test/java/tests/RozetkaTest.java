package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages_elements.Headers;
import pages_elements.sideMenu;
import pages_elements.signInForm;


import static org.testng.AssertJUnit.assertEquals;


public class RozetkaTest extends BaseTest {
    @Test
    public void testHelpCenterNavigationAndComebackToHomeScreen() {
        Headers headers = new Headers(driver);
        sideMenu sidemenu = new sideMenu(driver);
        wait.until(ExpectedConditions.visibilityOf(headers.hamburgerMenu()));
        wait.until(ExpectedConditions.elementToBeClickable(headers.hamburgerMenu())).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(sidemenu.topBar()));
        wait.until(ExpectedConditions.elementToBeClickable(sidemenu.helpCenter())).click();
        wait.until(ExpectedConditions.elementToBeClickable(headers.homeButtonHelpCenter())).click();
    }
    
    @Test
    public void testSearchFunctionality() {
        Headers headers = new Headers(driver);
        String inputTextToSearchField = "MacBook Air M1";
        headers.searchField().sendKeys(inputTextToSearchField);
        String enteredText = headers.searchField().getAttribute("value");
        assertEquals("Text in the search field should match the input text", inputTextToSearchField, enteredText);
        headers.searchButton().click();
    }

    @Test
    public void SignInTest(){
        Headers headers = new Headers(driver);
        signInForm signin = new signInForm(driver);
        headers.signInButton().click();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(signin.signInFormHeader()));
        signin.signInFields().sendKeys("0985514068");
        wait.until(ExpectedConditions.visibilityOf(signin.signInFields()));
        signin.submitButton().click();
        signin.closeButton().click();
    }
    @Test
    public void checkAbilityToChangeLanguageFromUaToRu(){
        Headers headers = new Headers(driver);
        headers.changeLanguageButton().click();
        headers.changeLanguageButtonToRu().click();
    }



}
