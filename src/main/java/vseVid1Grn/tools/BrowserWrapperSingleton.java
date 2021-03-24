package vseVid1Grn.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWrapperSingleton {

        private static BrowserWrapperSingleton instance;
        private WebDriver driver;
        private BrowserWrapperSingleton() {
            String webDriverPath = System.getenv("chromeWebDriver");
            System.setProperty("webdriver.chrome.driver",webDriverPath);
            driver = new ChromeDriver();
        }

        public static BrowserWrapperSingleton getInstance() {
            if (instance == null) {
                instance = new BrowserWrapperSingleton();
            }
            return instance;
        }
        public void goToURL(String url){
            driver.get(url);
        }

        public String getURL(){
            return driver.getCurrentUrl();
        }

        public void refreshPage(){
            driver.navigate().refresh();
        }

        public WebElement findElement(By locator) {
            return driver.findElement(locator);
        }

        public void closeDriver() {
            driver.quit();
        }

        public void maxWindow() { driver.manage().window().maximize(); }

}

