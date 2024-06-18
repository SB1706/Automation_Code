//package MiniFeed_And_PDP;
//
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.junit.Test;
//import org.openqa.selenium.*;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.NoSuchElementException;
//
//public class Mini_Feed {
//    public static AndroidDriver App;
//
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
//    static boolean scrollToText(AndroidDriver App, String text) {
//        try {
//            App.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
//                    ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
//            return true; // Element found
//        } catch (NoSuchElementException e) {
//            return false; // Element not found
//        }
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
//        } catch (Exception popup_error) {
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
//
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
//        // Mini Feed Deeplink
//        App.get("https://otipy.app.link/aFqI7e0MoJb");
//        print("Welcome To The Mini Feed");
//        sleep(2000);
//        // Mini Feed Scroll
//        String searchText = "XYZ---XYZ";
//        try {
//            App.scrollTo(searchText);
//        }catch (Exception textNotFound) {
//            if (App.findElements(MobileBy.AndroidUIAutomator("new UiSelector().text(\"" + searchText + "\")")).size() == 0)
//            {
//                System.out.println("Element with text '" + searchText + "' not found.");
//            }
//        sleep(2000);
//        App.findElementByXPath("//*[@text='See More']").click();
//        sleep(2000);
//        App.findElementByXPath("//*[@class='android.view.ViewGroup']").click(); // PDP Click
//        sleep(2000);
//        App.findElementByXPath("//*[@text='View more details']").click();
//        sleep(2000);
//
//        String targetText = "View less details";
//
//            if (scrollToText(App, targetText)) {
//                // Element found using scrollTo method
//                // Perform actions for this case
//                print("Element found using scrollTo method");
//            } else {
//                // Element not found using scrollTo method
//                // Perform actions for element not found case
//               print("Element not found using scrollTo method");
//            }
//            sleep(2000);
//
//        }
//        }
//    }
//
