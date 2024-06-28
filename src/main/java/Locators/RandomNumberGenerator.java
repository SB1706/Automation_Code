package Locators;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Utility.Constants;
import Utility.Functions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import static Utility.Functions.print;

public class RandomNumberGenerator {
    private AndroidDriver driver;
    private static final String FIXED_PART = "58723";
    By myNewNumber = By.xpath("//*[@text='Phone number']");

    // Constructor to initialize the driver
    public RandomNumberGenerator(AndroidDriver driver) {
        this.driver = driver;
    }

    // Method to generate a new user number and use it for login
    public void New_user_number() {
        // Generate a single random 10-digit number
        String loginNumber = generateRandom10DigitNumber(FIXED_PART);

        // Print the selected login number
        print("Selected number for login: " + loginNumber);
        Functions.driver.findElement(myNewNumber).sendKeys(loginNumber);
        Functions.simpleWait(Constants.wait_3);
    }

    // Method to generate a single random 10-digit number with fixed initial part
    public static String generateRandom10DigitNumber(String fixedPart) {
        if (fixedPart.length() != 5) {
            throw new IllegalArgumentException("Fixed part must be exactly 5 digits.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder number = new StringBuilder(fixedPart);

        for (int i = 0; i < 5; i++) {
            number.append(random.nextInt(10));
        }

        return number.toString();

    }
}
