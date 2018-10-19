import factories.BrowserFactory;
import fixtures.user.UserFixture;
import flows.login.LoginFlow;
import menu.MainMenu;
import models.User;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Exx {

    private WebDriver driver;
    private LoginFlow loginFlow;
    private static User DEFAULT_USER = UserFixture.DEFAULT_USER();

    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C://Selenium/Chromedriver/chromedriver.exe");
        driver = BrowserFactory.openBrowser(BrowserFactory.Browser.CHROME);
        driver.get("http://10.3.11.2:8083");
    }

    @Test(priority = 0)
    public void login(){
        loginFlow = new LoginFlow(driver);
        loginFlow.login(DEFAULT_USER, MainMenu.class);
        Assert.assertTrue(driver.getCurrentUrl().endsWith("main.jsp"));
    }

    @Test(priority = 1)
    public void goMainscreen(){
        MainMenu mainMenu = new MainMenu(driver);
        mainMenu.goMasterdata();
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
