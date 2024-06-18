//package Search_Feed_Scroll;
//
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.ElementNotVisibleException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import javax.lang.model.element.Element;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import static java.awt.SystemColor.text;
//
//public class Feed {
//    public static AndroidDriver App;
//
//    static void login(DesiredCapabilities caps) {
//        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
//        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "2C191FDH20027V");
//        caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.otipy.otipy.MainActivity");
//        caps.setCapability(MobileCapabilityType.APP_PACKAGE, "com.otipy.otipy");
//        caps.setCapability(MobileCapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "ACCEPT");
//    }
//    static void sleep (int val) throws InterruptedException
//    {
//        Thread.sleep(val);
//    }
//    static void print (String val)
//    {
//        System.out.println(val);
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
//    static void old_number_popup(AndroidDriver App){
//        App.findElementByXPath("//*[@text='NONE OF THE ABOVE']").click();
//    }
//    static void new_number_popup(AndroidDriver App){
//        App.findElementByXPath("//android.widget.ImageView[@content-desc='Cancel']").click();
//    }
//
//    @Test
//    public void scrollToText() throws MalformedURLException, InterruptedException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        login(caps);
//        URL url = new URL("http://localhost:4723/wd/hub");
//        App = new AndroidDriver(url, caps);
//
//        print("All Mobile Capability Successfully Run");
//        sleep(3000);
//        try {
//            App.findElementByXPath("//*[@text='Allow']").click();
//            print("Pop_found");
//        }catch (Exception popup_error){
//            print("Popup not fund");
//        }
//
//        WebDriver appiumDriver = App;
//        WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath("//*[@text='Log in or Sign up']")));
//        String loginText = appiumDriver.findElement(By.xpath("//*[@text='Log in or Sign up']")).getText();
//        print("Text Available -> " + loginText);
//
//        sleep(3000);
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
//
//        String searchText = "desired_text";
//        int attempts = 0;
//        try {
//            App.scrollTo(searchText);
//        }catch (Exception textNotFound) {
//            int maxAttempts = 2;
//            while (attempts < maxAttempts) {
//                if (App.findElements(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + searchText + "\")")).size() == 0) {
//                    System.out.println("Element with text '" + searchText + "' not found.");
//                    break;
//                }
//                attempts ++;
//            }
//            sleep(2000);
//            App.findElementByXPath("//*[@class='com.horcrux.svg.t']").click();
//            print("Back to Home Feed");
//        }
//    }
//}