package vseVid1Grn.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import vseVid1Grn.locators.BaseLocator;
import vseVid1Grn.tools.BrowserWrapperSingleton;

public abstract class BaseElement {
    protected By path;
    protected WebElement element;
    protected BrowserWrapperSingleton driver;

    public BaseElement(BaseLocator locator){
        this.driver = BrowserWrapperSingleton.getInstance();
        this.path = locator.getPath();
        this.element = driver.findElement(path);
    }

    public BaseElement(WebElement element, BaseLocator locator){
        this.path = locator.getPath();
        this.element = element.findElement(path);
    }

    public BaseElement(WebElement element){
        this.element = element;
    }



    public String getText() { return (this.element.getText()); }


}
