package vseVid1Grn.locators;

import org.openqa.selenium.By;

public enum MainPageLocators implements BaseLocator {
    ;

    private By path;
    MainPageLocators(By path){this.path = path;}

    @Override
    public By getPath() {return path;}
}
