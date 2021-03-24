package vseVid1Grn.elements;

import vseVid1Grn.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Anchor extends BaseElement{

    public Anchor(BaseLocator locator) { super(locator); }

    public Anchor(WebElement element, BaseLocator locator) { super(element, locator); }

    public Anchor(WebElement element) { super(element); }

    public void click(){
        this.element.click();
    }



}
