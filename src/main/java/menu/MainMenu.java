package menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenu {

    private WebDriver driver;
    private By masterdata = By.id("MENU11");


    public MainMenu(WebDriver driver){
        this.driver = driver;
    }

    public void goMasterdata(){
        driver.findElement(this.masterdata).click();
    }
}
