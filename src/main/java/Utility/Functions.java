package Utility;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileBy;


public class Functions {
    public static AndroidDriver driver;
    static DesiredCapabilities caps;
    public Functions(AndroidDriver driver) {
    }

    public static void MyCapabilities() throws MalformedURLException {
        // **************These_Are_Mobile_Capabilities************
        System.out.println("**************Loading_Mobile_Capabilities************");
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("version", "12.0");
        caps.setCapability("deviceName", "RZ8R22R8HMT");
        caps.setCapability("appPackage", "com.otipy.otipy");
        caps.setCapability("appActivity", "com.otipy.otipy.MainActivity");
        caps.setCapability("adbExecTimeout", 60000); // Increase the timeout to 60 seconds
        caps.setCapability("newCommandTimeout", 300);
        System.out.println("These_Are_MyMobileCapabilities  --> " +caps);

        // ******To_Connect_With_Appium_Server
        URL url = new URL("http://localhost:4723/wd/hub");
        System.out.println("Appium_Server_URL  --> " + url);
        driver = new AndroidDriver(url, caps);
        System.out.println("Otipy_Application_Launch_Successfully");

    }

    // *******To_Provide_Wait************
    public static void simpleWait(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void print (String val)
    {
        System.out.println(val);
    }



public static void scrollToElement(AppiumDriver driver) {
    for (int i = 0; i < 5; i++) { // max 5 scrolls
        try {
            WebElement element = driver.findElement(MobileBy.xpath("//*[@id=\"btnTapElement\"]"));
            if (element.isDisplayed()) return;
        } catch (Exception e) {
            scroll(driver);
        }
    }
    System.out.println("Element with text ' not found.");
}

    public static void scroll (AppiumDriver driver){
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = (int) (dimension.height * 0.8);
        int endY = (int) (dimension.height * 0.2);

        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }


}