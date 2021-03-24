package vseVid1Grn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import vseVid1Grn.tools.BrowserWrapperSingleton;


public class BaseTest {



    @BeforeClass
    public void setUpClass(){
        BrowserWrapperSingleton.getInstance().goToURL("https://vsevid1grn.com.ua//");
        BrowserWrapperSingleton.getInstance().maxWindow();

    }

//    @AfterClass
//    public void tearDownClass(){
//        BrowserWrapperSingleton.getInstance().closeDriver();
//    }

}
