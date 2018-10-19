package flows.login;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.login.LoginPage;

public class LoginFlow {

    private WebDriver driver;

    public LoginFlow(WebDriver driver){
        this.driver = driver;
    }

    public <T> T login(User user, Class<T> expectedPage){
        LoginPage login = new LoginPage(driver);
        login.fillUsername(user.getUsername());
        login.fillPassword(user.getPassword());
        login.clickLogin();
        return PageFactory.initElements(driver, expectedPage);
    }
}
