package vseVid1Grn.locators;

import org.openqa.selenium.By;

public enum LoginPageLocators implements BaseLocator {

    LOGIN_FIELD(By.cssSelector("#login_email")),
    PASSWORD_FIELD(By.cssSelector("#login_password")),
    ENTER_BUTTON(By.cssSelector("#login_send")),
    ;

    private By path;
    LoginPageLocators(By path){
        this.path = path;
    }

    @Override
    public By getPath() {
        return path;
    }
}
