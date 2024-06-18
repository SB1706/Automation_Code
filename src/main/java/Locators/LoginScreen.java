package Locators;


import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import static Utility.Functions.print;

public class LoginScreen {
    public static AndroidDriver driver;

    // These Are My Xpath's
    By phone_number_click =  By.xpath("//*[@content-desc ='PhoneNumberComponentClicked']");
    By allow_popup = By.xpath("//*[@text='Allow']");
    By loginText = By.xpath("//*[@text='Log in or Sign up']");
    By newUIPopup = By.xpath("//android.widget.ImageView[@content-desc='Cancel']");
    By oldUIPopup = By.xpath("//*[@text='NONE OF THE ABOVE']");
    By myNumber = By.xpath("//*[@text='Phone number']");
    By otpClick = By.xpath("//*[@text='Get OTP']");
    By myOtp = By.xpath("//*[@content-desc = 'OTPBoxTextInputValue']");
    By verify = By.xpath("//*[@text = 'Verify']");
    By inAppPopup = By.xpath("//*[@class='android.widget.ImageView']");


    public LoginScreen(AndroidDriver driver) {
        LoginScreen.driver = driver;
    }


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

  // When Give Mobile Number
    public void enterPhone(){
        print("************Waiting For Mobile Number*************");
        Functions.driver.findElement(myNumber).sendKeys("7533882395");
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
            Functions.driver.findElement(myOtp).sendKeys("4130");
            print("OTP Provided Successfully");
        }else {
            // When OTP was Auto Filled
            print("OTP Was Auto Fill");
        }
        Functions.driver.findElement(verify).click();
        print("Welcome To The Home Feed"); // User Successfully Entered OTIPY Application
    }

    // Checking For In-App Popup
    public void In_App_popup(){
        print("*************Checking for In_App Popup**************");
        Functions.simpleWait(Constants.wait_1);

        if (Functions.driver != null){
            Functions.driver.findElement(inAppPopup).click();
            print("In_App Popup Clicked");
        }else{
        print("In app popup not found");}
    try {
        Functions.driver.findElement(allow_popup).click();
        print("Allow Popup was Clicked");
    } catch (Exception popup_error) {
        print("Allow Popup Not Found");
        }

    }


}




