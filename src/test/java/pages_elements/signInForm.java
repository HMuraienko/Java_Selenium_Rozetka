package pages_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class signInForm extends BaseTest {
    public signInForm(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement signInFormHeader (){
        return driver.findElement(By.xpath("//div[@class = 'modal__header']"));
    }
    public WebElement signInFields (){
        return driver.findElement(By.xpath("//input[@id = 'phone']"));
    }
    public WebElement submitButton (){
        return driver.findElement(By.xpath("//button[@type = 'submit']"));
    }
    public WebElement closeButton(){
        return driver.findElement(By.xpath("//button[@class = 'modal__close ng-star-inserted']"));
    }

}
