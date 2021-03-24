package vseVid1Grn.pages;
import vseVid1Grn.elements.Anchor;
import vseVid1Grn.locators.HeaderLocators;

public class HomePage extends BasePage{

    private Anchor loginAnchor;

    public HomePage(){
        init();
    }

    public LoginPage goToLoginPage(){
        loginAnchor.click();
        return new LoginPage();
    }

    public void init() {
        loginAnchor = new Anchor(HeaderLocators.LOGIN_BUTTON);

    }

}
