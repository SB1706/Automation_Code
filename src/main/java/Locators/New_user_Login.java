package Locators;

import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utility.Functions.print;
import static org.openqa.selenium.By.xpath;

public class New_user_Login {
    public static AndroidDriver driver;
    public New_user_Login(AndroidDriver driver) {
        LoginScreen.driver = driver;
    }
    RandomNumberGenerator new_login = new RandomNumberGenerator((AndroidDriver)driver);

    By phone_number_click =  By.xpath("//*[@content-desc ='PhoneNumberComponentClicked']");
    By allow_popup = By.xpath("//*[@text='Allow']");
    By loginText = By.xpath("//*[@text='Log in or Sign up']");
    By newUIPopup = By.xpath("//android.widget.ImageView[@content-desc='Cancel']");
    By oldUIPopup = By.xpath("//*[@text='NONE OF THE ABOVE']");
    By otpClick = By.xpath("//*[@text='Get OTP']");
    By myOtp = By.xpath("//*[@content-desc = 'OTPBoxTextInputValue']");
    By verify = By.xpath("//*[@text = 'Verify']");
    By inAppPopup = By.xpath("//*[@class='android.widget.ImageView']");
    By current_location_click = By.xpath("//android.widget.TextView[@text='Detect current location']");
    By location_allow = By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_foreground_only_button']");
    By confirm_location_button = By.xpath("//android.widget.TextView[@text='Confirm']");
    By new_user_welcome_popup = By.xpath("//android.widget.TextView[@text='Hi! You're almost there!']");
    By new_user_name = By.xpath("//android.widget.EditText[@text=' Enter your name']");
    By new_user_submit_button = By.xpath("//android.widget.TextView[@text='Submit']");
    By hamburger = xpath("//*[@class='com.horcrux.svg.SvgView']");




    // For Allow Popup Access Method
    public void allow_Button() {
        print("********Checking For Access Popup*********");
        try {
            Functions.driver.findElement(allow_popup).click();
            print("Allow Popup was Clicked");
        } catch (Exception popup_error) {
            print("Allow Popup Not Found");
        }
    }

    // For Checking backend API Response
    public void login_text(){
        String logintext = Functions.driver.findElement(loginText).getText();
        print("Text Available -> " + logintext);
        Functions.simpleWait(Constants.wait_3);
    }

    // When user click on the phone number component
    public void PhoneNumberComponent(){
        print("*************Checking For PhoneNumberComponent ******************");
        Functions.driver.findElement(phone_number_click).click();
        print("Phone_Component_click");
    }

    // For checking Auto Fill Number Popup
    public void Getting_Auto_Fill_Number_Popup(){
        print("*****************Check For Auto Fill Popup*********************");
        try {
            Functions.driver.findElement(newUIPopup).click();
            print("New Google UI Popup Clicked");
        }catch (Exception popupNotFound) {
            print("New Popup Not Found");
        }
        try {
            Functions.driver.findElement(oldUIPopup).click();
            print("Old UI Popup Clicked");
        }catch (Exception popupNotFound){
            print("Old popup Not Found");
        }
    }

    // When New user give Mobile number
    public void enterPhone(){
        Functions.simpleWait(Constants.wait_2);
        new_login.New_user_number();
        print("Mobile Number Filled Successfully");
        Functions.simpleWait(Constants.wait_3);
        Functions.driver.findElement(otpClick).click();
        print("Get_OTP_Click");
    }


    // When user give OTP
    public void OTP_entered(){
        print("**************Waiting For OTP***********************");
        Functions.simpleWait(Constants.wait_2);
        if (Functions.driver != null){
            // When user give OTP Number
            Functions.driver.findElement(myOtp).sendKeys("6389");
            print("OTP Provided Successfully");
        }else {
            // When OTP was Auto Filled
            print("OTP Was Auto Fill");
        }
        Functions.simpleWait(Constants.wait_2);
        Functions.driver.findElement(verify).click();
        print("User now on delivery location screen"); // User Successfully Entered OTIPY Application
        Functions.simpleWait(Constants.wait_2);

        print("******************Checking for Current_Location Button***********************");
        try{
            WebDriver appiumDriver = Functions.driver;
        WebDriverWait wait = new WebDriverWait((appiumDriver),Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(current_location_click));
        String current_location_button_click = element.getText(); // Getting the button text
        print(current_location_button_click + "\nUser was able to see current location");
        try{
            Functions.simpleWait(Constants.wait_3);
            Functions.driver.findElement(inAppPopup).click();
            print("The user was successfully click on the inAppPopup button");
        }catch (Exception e){
            print("The InAppPopup Not Found");
        }
        Functions.simpleWait(Constants.wait_6);
        Functions.driver.findElement((By) current_location_click).click();
        Functions.simpleWait(Constants.wait_2);
        print("The user was successfully click on the current location button");
        }catch (Exception e){
            print("The user not able to click on the current location button");
        }
        Functions.simpleWait(Constants.wait_2);
        try{
            Functions.driver.findElement(location_allow).click();
            print("The user was successfully click on the allow permission button");
        }catch (Exception e){
            print("The user not able to see the allow location button");
        }
        Functions.simpleWait(Constants.wait_2);
        try{
            Functions.simpleWait(Constants.wait_6);
            Functions.driver.findElement(confirm_location_button).click();
            print("The user was successfully clicked on the confirm location button");
            Functions.simpleWait(Constants.wait_3);
            print("\nThe now on Otipy Home Feed");
        }catch (Exception e){
            print("//////////////////***********Test_Case_Fail****************///////////////////////");
            print("The user not able to click on the confirm location button");
        }
    }
    // For check the welcome popup in which we ask the user name and BTL code
    public void new_user_popup() {
        try{
            Functions.simpleWait(Constants.wait_3);
            Functions.driver.findElement(inAppPopup).click();
            print("The user was successfully click on the inAppPopup button");
        }catch (Exception e){
            print("The InAppPopup Not Found");
        }
        try{
            Functions.simpleWait(Constants.wait_6);
            Functions.driver.findElement(new_user_name).sendKeys("AUTOMATED TEST USER"); // when user give our name
            print("The user successfully give his name");
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(new_user_submit_button).click();
            print("The user successfully click on the submit button");
            try{
                if (Functions.driver!=null ) {
                    Functions.simpleWait(Constants.wait_3);
                    Functions.driver.findElement(inAppPopup).click();
                    print("The user was successfully click on the inAppPopup button");
                }
            }catch (Exception e){
                print("The InAppPopup Not Found");
            }
            try{
                Functions.simpleWait(Constants.wait_5);
                Functions.driver.findElement(hamburger).click(); // Checking for new user name
                print("The user successfully click on the hamburger menu to validate the user's name");
            }catch (Exception e){
                print("//////////////////***********Test_Case_Fail****************///////////////////////");
                print("The user not able to click on the hamburger menu");
            }

        }catch (Exception e){
            print("//////////////////***********Test_Case_Fail****************///////////////////////");
            print("The user was not able to click on the new user popup submit button");
        }
    }
}
