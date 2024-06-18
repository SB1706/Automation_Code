package MainTest;

import Locators.LoginScreen;
import Locators.Subscription;
import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class AppTest_Subscription {
    public static Functions functionCall;
    public static AndroidDriver driver;

    public AppTest_Subscription(AndroidDriver driver){
        AppTest_Subscription.driver =  driver;
    }

    public static void main(String[] args) throws MalformedURLException {
        functionCall = new Functions((AndroidDriver) driver);
        LoginScreen loginScreen = new LoginScreen((AndroidDriver) driver);

        Subscription subscriptionScreen = new Subscription(driver);

        Functions.MyCapabilities(); // These are my Mobile Capabilities
        Functions.simpleWait(Constants.wait_5);
        loginScreen.allow_Button();  // When User Clicked On The Allow Button
        Functions.simpleWait(Constants.wait_1);

        loginScreen.login_text();    // For Getting Backend API Response
        Functions.simpleWait(Constants.wait_1);

        loginScreen.PhoneNumberComponent();  // When User Click On The Enter Phone Number
        Functions.simpleWait(Constants.wait_2);

        loginScreen.Getting_Auto_Fill_Number_Popup(); // When User Getting Auto Fill Number Popup
        Functions.simpleWait(Constants.wait_2);

        loginScreen.enterPhone(); // When user give Mobile Number

        loginScreen.OTP_entered();  // When User Give OTP  Number
        Functions.simpleWait(Constants.wait_3);

        loginScreen.In_App_popup(); // Check If in_app popup comes

        subscriptionScreen.Click_On_Hamburger(); // When user click on the hamburger


    }
}
