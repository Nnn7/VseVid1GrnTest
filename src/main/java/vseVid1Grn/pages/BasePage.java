package vseVid1Grn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import vseVid1Grn.tools.BrowserWrapperSingleton;

public abstract class BasePage {
    public BrowserWrapperSingleton driverS;
//    public WebDriverWait wait;

    public BasePage (){
        driverS = BrowserWrapperSingleton.getInstance();
       // driverS = new BrowserWrapperSingleton.DriverWrapper();

    }





}
