package vseVid1Grn;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.Test;
import vseVid1Grn.pages.HomePage;

public class LoginTest extends BaseTest{

    @Test(description = "VV1G Login")
    @Description("Login to VV1G")

    public void login_VseVid1Grn() {
        new HomePage().goToLoginPage().login();




    }





}




