package vseVid1Grn.elements;

import vseVid1Grn.elements.BaseElement;
import vseVid1Grn.locators.BaseLocator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends BaseElement {

    public Button(BaseLocator locator) {
        super(locator);
    }

    public Button(WebElement element, BaseLocator locator) {
        super(element, locator);
    }

    public Button(WebElement element) {
        super(element);
    }

    public void click(){
        this.element.click();
    }

}
