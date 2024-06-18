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
//public class MobileCapability {
//    public static AndroidDriver App;
//    DesiredCapabilities caps;
//
//    static void print (String val)
//    {
//        System.out.println(val);
//    }
//    static void sleep (int val) throws InterruptedException
//    {
//        Thread.sleep(val);
//    }
//    static void in_app_popup (AndroidDriver App)
//    {
//        App.findElementByXPath("//*[@class='android.widget.ImageView']").click();
//    }
//    static void Consumer_Number (AndroidDriver App)
//    {
//        App.findElementByXPath("//*[@text='Phone number']").sendKeys("6398124448");
//    }
//    static void Consumer_app_OTP (AndroidDriver App)
//    {
//        App.findElementByXPath("//*[@content-desc = 'OTPBoxTextInputValue']").sendKeys("4130");
//    }
//    static void header_back_button (AndroidDriver App){
//        App.findElementByAccessibilityId("HeaderBackPressLabel").click();
//    }
//    static void old_number_popup(AndroidDriver App){
//        App.findElementByXPath("//*[@text='NONE OF THE ABOVE']").click();
//    }
//    static void new_number_popup(AndroidDriver App){
//        App.findElementByXPath("//android.widget.ImageView[@content-desc='Cancel']").click();
//    }
//    @Test
//    public void Mobile_Launch() throws MalformedURLException, InterruptedException {
//        caps = new DesiredCapabilities();
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "2C191FDH20027V");
//        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.otipy.otipy.MainActivity");
//        caps.setCapability(MobileCapabilityType.APP_PACKAGE,"com.otipy.otipy");
//        caps.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "ACCEPT");
//
//        URL url = new URL("http://localhost:4723/wd/hub");
//        App = new AndroidDriver(url, caps);
//        print("All Mobile Capability Successfully Run");
//        sleep(3000);
//    }
//    @Test
//    public void App_Launch() throws InterruptedException, MalformedURLException {
////        App.findElementByXPath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']").click();
////        print("------------------------------------------------------------------------------------");
//        try {
//            App.findElementByXPath("//*[@text='Allow']").click();
//            print("Pop_found");
//        } catch (Exception popup_error) {
//            print("Popup not fund");
//        }
//
//        sleep(2000);
//        String login_Text = App.findElementByXPath("//*[@text='Log in or Sign up']").getText();
//        print("Text Available -> " + login_Text);
//        sleep(3000);
//
//        App.findElementByXPath("//*[@content-desc = 'PhoneNumberComponentClicked']").click();
//        print("Phone_Component_click");
//        sleep(1000);
//        try{
//            new_number_popup(App);
//            print("New UI Phone Number Popup Cross Button Clicked");
//        }catch (Exception popupNotFound){
//            print("New Popup Not Found");
//        }
//        try {
//            old_number_popup(App);
//            print("Old UI Phone Number Popup Allow Button Clicked");
//        }catch (Exception popupNotFound){
//            print("Old popup Not Found");
//        }
//        sleep(2000);
//        Consumer_Number(App);
//        print("Consumer_Number_Entered");
//        sleep(3000);
//        App.findElementByXPath("//*[@text='Get OTP']").click();
//        print("Get_OTP_Click");
//        try {
//            Consumer_app_OTP(App);
//            print("Provide OTP");
//        } catch (Exception ignored) {
//            print("OTP Was Auto Fill");
//        }
//        sleep(2000);
//        App.findElementByXPath("//*[@text = 'Verify']").click();
//        print("Welcome To The Home Feed");
//        sleep(10000);
//        try {
//            in_app_popup(App);
//            print("In App Popup Clicked");
//        } catch (ElementNotVisibleException popup_not_found) {
//            print("In app popup not found");
//        }
//        sleep(1000);
//        try {
//            App.findElementByXPath("//*[@text='Allow']").click();
//            print("Pop_found");
//        } catch (Exception popup_error) {
//            print("Popup not fund");
//        }
//        sleep(3000);
//        Payment_Deeplink mObject = new Payment_Deeplink();
//        try {
//            mObject.Deeplink();
//        } catch (MalformedURLException deeplink_not_found) {
//            throw new RuntimeException();
//        }
//        sleep(1000);
//        header_back_button(App);
//        print("Back Button Click");
//        sleep(2000);
//
//        CashWallet_Deeplink m1Object = new CashWallet_Deeplink();
//        try {
//            m1Object.CashDeeplink();
//        } catch (MalformedURLException CashDeeplink_not_found) {
//            throw new RuntimeException();
//        }
//        sleep(1000);
//        header_back_button(App);
//        print("Back Button Click");
//        sleep(2000);
//
//        Refer_Deeplink m2Object = new Refer_Deeplink();
//        try {
//            m2Object.Refer_screen_deeplink();
//        } catch (MalformedURLException DeeplinkNotFound) {
//            throw new RuntimeException();
//        }
//        sleep(2000);
//        App.findElementByXPath("//*[@class='com.horcrux.svg.t']").click();  // Back button For Refer Screen
//        print("Back Button Click");
//        sleep(2000);
//
//        Subscription_Deeplink m3Object = new Subscription_Deeplink();
//        try {
//            m3Object.subscription_deeplink();
//        } catch (MalformedURLException DeeplinkNotFound) {
//            throw new RuntimeException();
//        }
//        sleep(2000);
//        header_back_button(App);
//        print("Back Button Click");
//        sleep(2000);
//
//        Banner_Deeplink m4Object = new Banner_Deeplink();
//        try {
//            m4Object.banner_screen_deeplink();
//        } catch (MalformedURLException DeeplinkNotFound) {
//            throw new RuntimeException();
//        }
//        App.findElementByXPath("//*[@class='com.horcrux.svg.t']").click();  // Back Button For Banner Screen
//        print("Back Button Click");
//        sleep(2000);
//
//        MiniFeed_Deeplink m5Object = new MiniFeed_Deeplink();
//        try {
//            m5Object.MiniFeedScreen();
//        }catch (MalformedURLException DeeplinkNotFound){
//            throw new RuntimeException();
//        }
//        App.findElementByXPath("//*[@class='com.horcrux.svg.t']").click(); // Back Button For MiniFeed Screen
//        print("Back Button Click");
//        sleep(2000);
//
//        Sub_Cat_Vegetable m6Object = new Sub_Cat_Vegetable();
//        try {
//            m6Object.SubCatVegetableScreen();
//        }catch (MalformedURLException DeeplinkNotFound){
//            throw new RuntimeException();
//        }
//        App.findElementByXPath("//*[@class='com.horcrux.svg.SvgView']").click(); // Back Button For SubCat Screen
//        print("Back Button Click");
//        sleep(2000);
//
//        Category_Deeplink m7Object = new Category_Deeplink();
//        try{
//            m7Object.CategoryScreen();
//        }catch (MalformedURLException DeeplinkNotFound){
//            throw new RuntimeException();
//        }
//        App.findElementByXPath("//*[@class='com.horcrux.svg.t']").click(); // Back Button For Category Screen
//        print("Buck Button Click");
//        sleep(2000);
//
//    }
//
//
//}
