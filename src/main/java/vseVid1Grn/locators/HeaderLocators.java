package vseVid1Grn.locators;

import org.openqa.selenium.By;

public enum HeaderLocators implements BaseLocator {

    LOGIN_BUTTON(By.cssSelector(".fm.for_login .login")),
    LOGOUT_BUTTON(By.cssSelector(".fm.for_login .login")), //Not a mistake

    ITEMS_1(By.cssSelector("[href*='/ihrashky-dytiachi/']")),
    ITEMS_2(By.cssSelector("[href*='/ghihiiena-ta-dohliad/']")),
    ITEMS_3(By.cssSelector("[href*='/kosmetyka/']")),
    ITEMS_4(By.cssSelector("[href*='/mobilni-aksesuary/']")),
    ITEMS_5(By.cssSelector("[href*='/kukhnia/']")),
    ITEMS_6(By.cssSelector("[href*='/posud/']")),
    ITEMS_7(By.cssSelector("[href*='/ghospodarski-tovary/']")),
    ITEMS_8(By.cssSelector("[href*='/pobutova-khimiia/']")),
    ITEMS_9(By.cssSelector("[href*='/kantstovary/']")),
    ITEMS_10(By.cssSelector("[href*='/dekor-ta-suveniry/']")),
    ITEMS_11(By.cssSelector("[href*='/odiah/']")),
    ITEMS_12(By.cssSelector("[href*='/bizhuteriia-ta-aksesuary-dlia-volossia/']")),
    ITEMS_13(By.cssSelector("[href*='/tovary-dlia-sviata/']")),
    ITEMS_14(By.cssSelector("[href*='/tekstyl/']")),
    ITEMS_15(By.cssSelector("[href*='/zootovary/']")),
    ITEMS_16(By.cssSelector("[href*='/ghalantereia/']")),

    ;



    private By path;
    HeaderLocators(By path){this.path = path;}

    @Override
    public By getPath() {return path;}

}
