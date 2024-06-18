//package Deeplinks;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.junit.Test;
//import org.openqa.selenium.ElementNotVisibleException;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//
//
//public class login {
//    static void sleep (int val) throws InterruptedException
//    {
//        Thread.sleep(val);
//    }
//    static void print (String val)
//    {
//        System.out.println(val);
//    }
//    static void in_app_popup (AndroidDriver driver)
//    {
//        driver.findElementByXPath("//*[@class='android.widget.ImageView']").click();
//    }
//    static void Consumer_Number (AndroidDriver driver)
//    {
//        driver.findElementByXPath("//*[@text='Phone number']").sendKeys("6398124448");
//    }
//    static void Consumer_app_OTP (AndroidDriver driver)
//    {
//        driver.findElementByXPath("//*[@content-desc = 'OTPBoxTextInputValue']").sendKeys("4130");
//    }
//
//    static void login(DesiredCapabilities caps)
//    {
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "2C191FDH20027V");
//        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.otipy.otipy.MainActivity");
//        caps.setCapability(MobileCapabilityType.APP_PACKAGE,"com.otipy.otipy");
//        caps.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "ACCEPT");
//    }
//    static void clickDeeplink1(AndroidDriver driver, String deeplink)
//    {
//        driver.get(deeplink);
//        print("Deeplink clicked");
//    }
//    static void header_back_button (AndroidDriver driver){
//        driver.findElementByAccessibilityId("HeaderBackPressLabel").click();
//    }
//
//
//    @Test
//    public void main() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        login(caps);
//        URL url = new URL("http://localhost:4723/wd/hub");
//        AndroidDriver driver = new AndroidDriver(url, caps);
//
//        print("All Mobile Capability Successfully Run");
//        sleep(3000);
//        try {
//            driver.findElementByXPath("//*[@text='Allow']").click();
//            print("Pop_found");
//        }catch (Exception popup_error){
//            print("Popup not fund");
//        }
//        sleep(1000);
//        driver.findElementByXPath("//*[@content-desc = 'PhoneNumberComponentClicked']").click();
//        print("Phone_Component_click");
//        sleep(1000);
//        driver.findElementByXPath("//*[@text='NONE OF THE ABOVE']").click();
//        print("None_Text_Click");
//        sleep(2000);
//        Consumer_Number(driver);
//        print("Consumer_Number_Entered");
//        sleep(1000);
//        driver.findElementByXPath("//*[@text='Get OTP']").click();
//        print("Get_OTP_Click");
//        try{
//            Consumer_app_OTP(driver);
//            print("Provide OTP");
//        }catch (Exception ignored){
//            print("OTP Was Auto Fill");
//        }
//        sleep(2000);
//        driver.findElementByXPath("//*[@text = 'Verify']").click();
//        print("Welcome To The Home Feed");
//        sleep(10000);
//        try {
//            in_app_popup(driver);
//            print("In App Popup Clicked");
//        }catch (ElementNotVisibleException popup_not_found){
//            print("In app popup not found");
//        }
//        sleep(1000);
//        try {
//            driver.findElementByXPath("//*[@text='Allow']").click();
//            print("Pop_found");
//        }catch (Exception popup_error){
//            print("Popup not fund");
//        }
//        sleep(2000);
//
//        String[] listOfDeeplinks = new String[]{"https://otipy.app.link/BuMHFzeeQCb",
//                "https://otipy.app.link/uiLbOQieQCb","https://otipy.app.link/jx81n83dQCb"
//                };
//
//        for (int i=0; i<listOfDeeplinks.length; i++){
//            print(listOfDeeplinks[i]);
//            clickDeeplink1(driver,listOfDeeplinks[i]);
//            sleep(5000);
//            try {
//                header_back_button(driver);
//                print("Back Button clicked");
//            }catch (Exception back_button_not_found){
//                print("back_button_not_found");
//            }
//
//
//
//            }
//        }
//    }
