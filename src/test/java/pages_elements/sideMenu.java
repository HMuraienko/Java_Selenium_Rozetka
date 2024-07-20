package pages_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class sideMenu extends BaseTest {
    public sideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement topBar() {
        return driver.findElement(By.xpath("//div[@class = 'side-menu__header ng-star-inserted']"));

    }
    public WebElement helpCenter(){
        return driver.findElement(By.xpath("//a[@class = 'button button--medium side-menu__button ng-star-inserted']"));
    }
    public WebElement reminderPopUpCloseButton(){
        return driver.findElement(By.xpath("//button[@class = 'close']"));
    }
}
