package vseVid1Grn.elements;

import vseVid1Grn.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Field extends BaseElement{

    public Field(BaseLocator locator) {
        super(locator);
    }

    public Field(WebElement element, BaseLocator locator) {
        super(element, locator);
    }

    public Field(WebElement element) {
        super(element);
    }

    public void click(){
        this.element.click();
    }

    public void sendKeys(String text){
        this.element.sendKeys(text);
    }
}
