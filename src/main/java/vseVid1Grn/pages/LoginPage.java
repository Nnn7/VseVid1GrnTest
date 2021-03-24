package vseVid1Grn.pages;

import vseVid1Grn.elements.Anchor;
import vseVid1Grn.elements.Button;
import vseVid1Grn.elements.Field;
import vseVid1Grn.locators.LoginPageLocators;

public class LoginPage extends BasePage{

    private Field loginField;
    private Field passwordField;
    private Button enterButton;
    private String TESTER_EMAIL = System.getenv("TESTER_EMAIL");
    private String TESTER_PASSWORD = System.getenv("TESTER_PASSWORD");

    public LoginPage(){
        init();
    }
    
    public HomeLoginedPage login (){
        loginField.sendKeys(TESTER_EMAIL);
        passwordField.sendKeys(TESTER_PASSWORD);
        enterButton.click();
        return new HomeLoginedPage();
    }


    public void init() {
        loginField = new Field(LoginPageLocators.LOGIN_FIELD);
        passwordField = new Field(LoginPageLocators.PASSWORD_FIELD);
        enterButton = new Button(LoginPageLocators.ENTER_BUTTON);

    }


}
