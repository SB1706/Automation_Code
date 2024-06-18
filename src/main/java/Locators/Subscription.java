package Locators;

import Utility.Functions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

import static Utility.Functions.print;
import Utility.Constants;
import org.openqa.selenium.By;

public class Subscription {
    public static AndroidDriver driver;

    By hamburger = By.xpath("//*[@class='com.horcrux.svg.SvgView']");

    public Subscription(AndroidDriver driver) {
    }

    public void subscriptionScreen(AndroidDriver driver) {
        Subscription.driver = driver;
    }

    public void Click_On_Hamburger() {
        print("******************Checking For Hamburger Bar************************");
        Functions.driver.findElement(hamburger).click();
        Functions.simpleWait(Constants.wait_3);
        print("Hamburger Clicked Successfully");


    }
}


