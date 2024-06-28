package MainTest;
import Locators.New_user_Login;
import Locators.RandomNumberGenerator;
import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.android.AndroidDriver;
import Locators.LoginScreen;
import static Utility.Functions.print;
import java.net.MalformedURLException;

public class AppTest_NewLogin {
    public static Functions functionCall;
    public static AndroidDriver driver;
    public AppTest_NewLogin(AndroidDriver driver) {
        AppTest_Login.driver = driver;
    }

    public static void main(String[] args) throws MalformedURLException {
        functionCall = new Functions((AndroidDriver) driver);
        RandomNumberGenerator new_login = new RandomNumberGenerator((AndroidDriver)driver);
        New_user_Login newUserloginscreen = new New_user_Login((AndroidDriver) driver);


        Functions.MyCapabilities(); // These are my Mobile Capabilities
        Functions.simpleWait(Constants.wait_5);

        newUserloginscreen.allow_Button();  // When User Clicked On The Allow Button
        Functions.simpleWait(Constants.wait_1);

        newUserloginscreen.login_text();    // For Getting Backend API Response
        Functions.simpleWait(Constants.wait_1);

        newUserloginscreen.PhoneNumberComponent();  // When User Click On The Enter Phone Number
        Functions.simpleWait(Constants.wait_2);

        newUserloginscreen.Getting_Auto_Fill_Number_Popup(); // When User Getting Auto Fill Number Popup
        Functions.simpleWait(Constants.wait_2);

        newUserloginscreen.enterPhone(); // When user give Mobile Number

        newUserloginscreen.OTP_entered();  // When User Give OTP  Number
        Functions.simpleWait(Constants.wait_3);

        newUserloginscreen.new_user_popup(); // To Validate the new user welcome popup on home screen


    }
}
