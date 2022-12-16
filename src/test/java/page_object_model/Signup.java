package page_object_model;

import base.PageDriver;
import com.codeborne.selenide.commands.FindByXpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonMethods;

public class Signup extends CommonMethods {
    public Signup() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    public WebElement signupButton;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement register;

    @FindBy(xpath = "//input[@placeholder='Please enter your phone number']")
    public WebElement phoneno;

    @FindBy(xpath = "//span[@id='nc_2_n1z']")
    public WebElement otpslider;

    @FindBy(xpath = "//input[@placeholder='SMS Verification Code']")
    public WebElement otpcode;

    @FindBy(xpath = "//input[@placeholder='Minimum 6 characters with a number and a letter']")
    public WebElement password;

    @FindBy(xpath = "//span[contains(text(),'Month')]")
    public WebElement domonth;

    @FindBy(xpath = "//span[@id='day']//i[@class='next-icon next-icon-arrow-down next-icon-medium next-select-arrow']")
    public WebElement doday;

    @FindBy(xpath = "//span[contains(text(),'Year')]")
    public WebElement doyear;

    @FindBy(xpath = "//span[@id='gender']//span[@class='next-select-inner']")
    public WebElement gender;

    @FindBy(xpath = "//input[@placeholder='Enter your first and last name']")
    public WebElement fullname;

    @FindBy(xpath = "//button[normalize-space()='SIGN UP']")
    public WebElement signup;

    public void slide(){
        scrollInsideElement("#nc_1_n1t",0,500);
    }
}
