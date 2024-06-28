package Utility;


import com.beust.ah.A;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.List;
import java.util.Properties;


public class Functions {
    public static AndroidDriver driver;
    static DesiredCapabilities caps;
    public  Functions(AndroidDriver driver) {
    }

    public static void MyCapabilities() throws MalformedURLException {
        // **************These_Are_Mobile_Capabilities************
        System.out.println("**************Loading_Mobile_Capabilities************");
        caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("version", "12.0");
        caps.setCapability("deviceName", "2C191FDH20027V");
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



public static void scrollToElement(AppiumDriver driver, String scroll_elelment) {
    for (int i = 0; i < 100; i++) { // max 5 scrolls
        try {

            WebElement element = Functions.driver.findElement(MobileBy.xpath(scroll_elelment));
            if (element!=null && element.isDisplayed())
            {
                print(scroll_elelment + "This Element Found");
                print("Stop Scrolling");
                return;
            }

        } catch (Exception e) {
              scroll(driver );
              print("KeepOn Scrolling because element was not found");
        }
    }
        print("Element with text ' not found.");
    }

    public static void scroll (AppiumDriver driver){
        Dimension dimension = Functions.driver.manage().window().getSize();
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


    public static void E_mail_Daily_subscription(){
        // Recipient's email ID needs to be mentioned.
//        String to = "sarthak.bansal@crofarm.com";
        String[] to = {
                "sarthak.bansal@crofarm.com",
                "deepak.ahlawat@crofarm.com",
                "sourav.jain@crofarm.com"
        };

        // Sender's email ID needs to be mentioned
        String from = "reporting@crofarm.com";
        final String username = "apikey";  // your Gmail username
        final String password = "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";// your Gmail password
        String host = "smtp.sendgrid.net";
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            for (String recipient : to) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            }
            String UserName = "Sarthak";
            // Set Subject: header field
            message.setSubject("Subscription Confirmation");
            // Now set the actual message
            String emailContent = "Dear " + UserName + ",\n\nThank you for subscribing to our Daily plan on Otipy!\nYou have successfully subscribed to receive daily deliveries from us.";
            message.setContent(emailContent, "text/plain; charset=UTF-8");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (AuthenticationFailedException e) {
            System.err.println("Authentication failed: " + e.getMessage());
            e.printStackTrace();
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}


