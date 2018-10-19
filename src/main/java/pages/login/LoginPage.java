package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    private WebDriver driver;
    private By username = By.id("username");
    private By password = By.id("password");
    private By login = By.id("submit");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage fillUsername(String username){
        driver.findElement(this.username).sendKeys(username);
        return new LoginPage(driver);
    }

    public LoginPage fillPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return new LoginPage(driver);
    }

    public LoginPage clickLogin(){
        driver.findElement(this.login).click();
        return new LoginPage(driver);
    }
}
