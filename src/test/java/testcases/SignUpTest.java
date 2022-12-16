package testcases;

import base.DriverSetup;
import base.PageDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page_object_model.Signup;

import java.util.Scanner;

public class SignUpTest extends DriverSetup {

    @Test
    public void registration() throws InterruptedException {
        Signup signup = new Signup();
        signup.signupButton.click();
        Thread.sleep(2000);
        signup.register.click();
        signup.phoneno.sendKeys("01684204269+1");
        Thread.sleep(2000);
        Actions a=new Actions(PageDriver.getCurrentDriver());
        a.dragAndDropBy(signup.otpslider, 1000,0).build().perform();
        Scanner scanner = new Scanner(System.in);
       String code= scanner.nextLine();
        signup.otpcode.sendKeys(code);

    }
}
