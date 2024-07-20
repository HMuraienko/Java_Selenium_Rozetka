package pages_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class Headers extends BaseTest {
    public Headers(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement hamburgerMenu() {
        return driver.findElement(By.xpath("//rz-mobile-user-menu[@class = 'header-menu']"));

    }

    public WebElement homeButton() {
        return driver.findElement(By.xpath("//img[@alt = 'Rozetka Logo']"));

    }

    public WebElement homeButtonHelpCenter() {
        return driver.findElement(By.xpath("//div[@class = 'd-flex justify-content-between align-items-center header-row']"));

    }

    public WebElement catalogueButton() {
        return driver.findElement(By.xpath("//button[@class = 'button button--medium button--with-icon menu__toggle']"));

    }

    public WebElement searchField() {
        return driver.findElement(By.xpath("//input[@name='search']"));

    }

    public WebElement searchByVoiceButton() {
        return driver.findElement(By.xpath("//button[@class = 'search-form__microphone ng-star-inserted']"));

    }

    public WebElement searchButton() {
        return driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']"));

    }

    public WebElement changeLanguageButton() {
        return driver.findElement(By.xpath("//button[@class = 'button button--link sub-lg lang__button']"));

    }

    public WebElement changeLanguageButtonToRu() {
        return driver.findElement(By.xpath("//button[@class = 'button button_color_white button_size_medium dropdown-css__control lang__menu-control js-rename-wishlist-title']"));

    }

    public WebElement signInButton() {
        return driver.findElement(By.xpath("//li[@class = 'header-actions__item header-actions__item--user']"));

    }

    public WebElement cartButton() {
        return driver.findElement(By.xpath("//button [@class = 'header-cart__button']"));

    }


}
