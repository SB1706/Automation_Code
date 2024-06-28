package Locators;

import Utility.Functions;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import static Utility.Functions.print;
import static org.openqa.selenium.By.xpath;
import Utility.Constants;
import io.opentelemetry.sdk.trace.internal.data.ExceptionEventData;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ConcurrentModificationException;
import java.util.SimpleTimeZone;


public class Subscription {
    public static AndroidDriver driver;

    By hamburger = xpath("//*[@class='com.horcrux.svg.SvgView']");
    By mySubscription = xpath("//android.widget.TextView[@text='My Subscription']");
    By SubAvailProducts = xpath("//android.widget.TextView[@text='Available products for subscription']");
//    By subscribe_button = xpath("//android.widget.TextView[@text='Happy Nature Certified A2 Desi Cow Milk (Gable Top)' or (@text='Subscribe')]");
    By subscribe = xpath("//android.widget.TextView[@text='Subscribe']");
    By daily = xpath("//android.widget.TextView[@text='Daily']");
    By alternate = xpath("//android.widget.TextView[@text='Alternate Days']");
    By custom = xpath("//android.widget.TextView[@text='Custom']");
    By SubsAddButton = xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]" +
            "/android.view.ViewGroup[4]/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.k/com.horcrux.svg.t");

    By SubsSubtractButton = xpath("//android.widget.ScrollView/android.view.ViewGroup/" +
            "android.view.ViewGroup[3]/android.view.ViewGroup[4]/android.view.ViewGroup[1]");

    By dailyStartDate = xpath("//android.widget.TextView[@text='Select start date']");
    By D_calendar = xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]" +
            "/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.ImageView");

    By rightArrow = xpath("//android.view.ViewGroup[@resource-id='undefined.header.rightArrow']");
    By leftArrow = xpath("//android.view.ViewGroup[@resource-id='undefined.header.leftArrow']");
    By confirm = xpath("//android.widget.TextView[@text='CONFIRM']");
    By cancel = xpath("//android.widget.TextView[@text='CANCEL']");
    By activate_Sub = xpath("//android.widget.TextView[@text='Activate Subscription']");
    By activate_success = xpath("//android.widget.TextView[@text='Subscription Activated Successfully']");
    By Subs_screen_preference = xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/" +
            "android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
    By DND = xpath("//android.widget.TextView[@text='Do not disturb']");
    By RingBell = xpath("//android.widget.TextView[@text='Ring the doorbell / Phone']");
    By preference_save = xpath("//android.widget.TextView[@text='Save']");
    By continue_shopping = xpath("//android.widget.TextView[@text='Continue shopping']");
    By see_my_subs = xpath("//android.widget.TextView[@text='See my subscriptions']");
    By your_subs = xpath("//android.widget.TextView[@text=' Your subscriptions']");
    By planTypeD = xpath("//android.widget.TextView[@text='Daily ']");
    By planTypeA = xpath("//android.widget.TextView[@text='Alternate Days ']");
    By planTypeC = xpath("//android.widget.TextView[@text='Custom ']");
    By planTypeC_i_button = xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]" +
            "/android.view.ViewGroup[2]/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView");
    By custom_plan_popup = xpath("//android.widget.TextView[@text='Custom Plan']");
    By delivery_day = xpath("//android.widget.TextView[@text='Delivery Day']");
    By quantity = xpath("//android.widget.TextView[@text='Quantity']");  // check quantity text on popup
    By custom_popup_close_button = xpath("//*[@class='com.horcrux.svg.b']");
    By subs_delete_button = xpath("//android.widget.TextView[@text='DELETE']");
    By subs_modify_button = xpath("//android.widget.TextView[@text='MODIFY']");
    By subs_mark_holiday = xpath("//android.widget.TextView[@text='MARK HOLIDAY']");
    By popup_delete_subs_heading = xpath("//android.widget.TextView[@text='Delete Subscription?']");
    By delete_button_popup = xpath("//android.view.ViewGroup[@content-desc='DeleteSubscriptionCickedLabel']"); // delete button in delete popup
    By order_placed_already = xpath("//android.widget.TextView[@text='Order Placed Already!']");
    By cancel_order = xpath("//android.widget.TextView[@text='CANCEL ORDER']"); // cancel order button in order already placed
    By do_not_cancel = xpath("//android.view.ViewGroup[@content-desc='PauseCickedLabel']"); // Don't cancel button in order already placed
    By cross_button_on_OPA = xpath("//*[@class='com.horcrux.svg.b']"); // Cross button on OPA popup
    By mark_holiday_popup = xpath("//android.widget.TextView[@text='MARK HOLIDAY']");
    By mark_holiday = xpath("//android.view.ViewGroup[@content-desc='PauseCickedLabel']");  // Under delete button popup
    By back_buton_mark_holiday = xpath("//android.view.ViewGroup[@content-desc='HeaderBackPressLabel']/" +
            "com.horcrux.svg.SvgView/com.horcrux.svg.k/com.horcrux.svg.t");
    By modify_screen = xpath("//android.widget.TextView[@text='Modify Subscription']");
    By back_button_modify_screen = xpath("//android.view.ViewGroup[@content-desc='HeaderBackPressLabel']/" +
            "com.horcrux.svg.SvgView/com.horcrux.svg.k/com.horcrux.svg.t");
    By update_subscription_button = xpath("//android.widget.TextView[@text='Update Subscription']");
    By cancel_button_MH = xpath("//android.widget.TextView[@text='CANCEL']"); // cancel button on mark holiday screen
    By pause_button = xpath("//android.widget.TextView[@text='Pause']");
    By quick_inc_quant = xpath("//android.widget.ScrollView/android.view.ViewGroup/" +
            "android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup[3]/" +
            "android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.k/com.horcrux.svg.t"); //xpath for quick inc quantity
    By quick_dec_quant = xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/" +
            "android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/" +
            "android.view.ViewGroup[3]/android.view.ViewGroup[1]/com.horcrux.svg.SvgView");  // xpath for quick dec quant.
    By pause_cross_button = xpath("//*[@class='com.horcrux.svg.b']"); // xpath for close popup when user click on the quick pause button
    By pause_subs_continue_button = xpath("//android.widget.TextView[@text='CONTINUE']");
    By resume_subs = xpath("//*[@text='Resume']");





    public Subscription(AndroidDriver driver) {
    }

    public void subscriptionScreen(AndroidDriver driver) {
        Subscription.driver = driver;
    }

    // When user click on the hamburger to see the MySubscription
    public void Click_On_Hamburger() {
        print("******************Checking For Hamburger Bar************************");
        try{
            // When User Click On The Hamburger Menu Bar
            Functions.driver.findElement(hamburger).click();
            Functions.simpleWait(Constants.wait_3);
            print("Hamburger Clicked Successfully");
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the hamburger option");

        }

    }

    // When user click on the My Subscription Field to take subscription
    public void MySubscription(){
        print("**************Checking For My Subscription Field************************");
        try{
            String MySub = Functions.driver.findElement(mySubscription).getText(); // Checking For My Subscription
            print(MySub + " ----- The user was able to see the My Subscription");
            Functions.simpleWait(Constants.wait_2);
            print("User click on the My Subscription Field");
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(mySubscription).click();   // When User Click On The My Subscription
            print("User is on My Subscription Screen");
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not able to see My subscription in hamburger & Don't able to click");
        }

    }

    // When user click on the 1st element on My subscription screen
    public void SubscribeButton() {
        print("***********checking For Available Subscription Product*****************");
        try {
            String AvailProduct = Functions.driver.findElement(SubAvailProducts).getText();   // Checking for Available Subs. products
            print(AvailProduct + " ------ The user was able to see the Subscription available products");
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not able to see the Subscription available products");
        }

        // When user click on the Subscribe button from My subscription Screen
        print("***************checking for Subscribe Button *****************************");
//        try {
//
//                Functions.driver.findElement(subscribe_button).click();
//                print("User is on PDP screen to take subscription"); // Take Subscription from PDP screen
//
//                Functions.driver.findElement(subscribe).click();
//                print("User is on Subscribe screen to take subscription"); // Take Subscription from subscribe screen
//
//        } catch (Exception e) {
//            print("********//////////////////Test Case Fail////////////////***********");
//            print("The user not able to click on Subscribe button on My subscription Screen");
//        }

        Functions.simpleWait(Constants.wait_5); // Perform Wait function

        // To check the Subscribe button
        try {
            Functions.driver.findElement(subscribe).click();
            print("The user was able to click on the subscribe button from PDP screen");
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("The subscribe button already click on My Subscription Screen");
        }
    }

    public void SubscriptionDaily(){

        // When user See the DAILY subscription Tab
        print("******************Checking the subscription plan type on subscribe screen ***************************");
        try {
            String D = Functions.driver.findElement(daily).getText();  // Get the Daily subscription field name
            print(D + " ---- User Click On The Daily Days Subscription Tab");
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not ale to see the DAILY subscription tab");
        }

        // When user click on the Alternate's Day Tab
        try {
            String A = Functions.driver.findElement(alternate).getText(); // Get the alternate subscription field name
            print(A + " ---- User Click On The Alternate Days Subscription Tab");
            Functions.driver.findElement(alternate).click();
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not able to click on the Alternate Days Plan");
        }

        // When user click on the Custom Day's Tab
        try {
            String C = Functions.driver.findElement(custom).getText(); // Get the custom subscription field name
            print(C + " ---- User Click On The Custom Days Subscription Tab");
            Functions.driver.findElement(custom).click();
            Functions.simpleWait(Constants.wait_3);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not able to click on the Custom Days Tab");
        }

        try {
            Functions.driver.findElement(daily).click(); // User come to the daily subscription days plan
            print("User Click On The Daily Subscription Tab");
            Functions.simpleWait(Constants.wait_3);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the Daily Subscription Tab");
        }

        // When user inc. the subscription product quant
        try {
            Functions.driver.findElement(SubsAddButton).click(); // When user click on the Add button on subscribe screen
            print("User inc. the subscription product quant");
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the Subs ADD Button");
        }

        // When user dec. the subscription product quant
        try {
            Functions.driver.findElement(SubsSubtractButton).click(); // When user click on the subtract button on subscribe screen
            print("User dec. the subscription product quant");
            Functions.simpleWait(Constants.wait_3);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the Subs Subtract Button");
        }

        // When user click on the Daily subscription calendar
        try {
            String SD = Functions.driver.findElement(dailyStartDate).getText();
            print(SD + " ----- User click on the Daily subscription calendar tab");

            Functions.driver.findElement(D_calendar).click(); // When user click on the daily calendar tab
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the Daily Calendar");
        }

        // When user click on the right arrow button in calendar
        try {
            Functions.driver.findElement(rightArrow).click(); // when user click on the right arrow button
            print("Right arrow click on the select start date popup");
            Functions.simpleWait(Constants.wait_1);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The User not able to click on the right arrow button");
        }

        // When user click on the left arrow button in calendar
        try {
            Functions.driver.findElement(leftArrow).click(); // When user click on the left arrow button
            print("Left arrow click on the select start date popup");
            Functions.simpleWait(Constants.wait_1);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the Left arrow button");
        }

        // when user see the confirm & cancel button in calendar
        try {
            String CONFIRM = Functions.driver.findElement(confirm).getText();  // CONFIRM button
            print(CONFIRM + " ----- User was able to see the CONFIRM button on this Popup");

            String CANCEL = Functions.driver.findElement(cancel).getText(); // CANCEL button
            print(CANCEL + " ----- User was able to see the CANCEL button on this Popup");

            Functions.driver.findElement(cancel).click(); // When user click on the cancel button
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the cancel button in daily calendar tab");
        }

        // When user click on the Activate subscription button
        try {
            Functions.driver.findElement(activate_Sub).click(); // When user click on the active subscription button
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the activate Subscription");
        }
        Functions.simpleWait(Constants.wait_3);
//        try{
//            Functions.E_mail_Daily_subscription();
//        }catch (Exception e){
//            print("********//////////////////Test Case Fail////////////////***********");
//            print("The E-mail Functionality doesn't work");
//        }

        // When User is on Subscription Success Screen
        try {
            Functions.simpleWait(Constants.wait_5);
            String success = Functions.driver.findElement(activate_success).getText(); // When user click on the activate subs button
            print(success + " ----- User is on Subscription Success Screen");
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to see the subscription Success screen");
        }


        //When user click on the delivery preference on subscription success screen
        print("****************** Checking for Delivery preference option on subs. success screen ******************");
        try {
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(Subs_screen_preference).click();
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the Delivery preference tab");
        }

        // When user to see the preference options
        try {
            Functions.simpleWait(Constants.wait_2);
            String dnd = Functions.driver.findElement(DND).getText();
            print(dnd + " ------- User was able to see the DND option in preference popup");
            String bell = Functions.driver.findElement(RingBell).getText();
            print(bell + " ------ User was able to see the ring the bell option in preference popup");
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to see the delivery preference's option");
        }


        // When user perform the action to select the delivery preference
        try {
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(RingBell).click();
            Functions.driver.findElement(DND).click();
            Functions.driver.findElement(RingBell).click();
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to perform the action to select the delivery preferences");
        }

        Functions.simpleWait(Constants.wait_2);

        // When user click on the save button on delivery preference button
        try {
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(preference_save).click();
            Functions.simpleWait(Constants.wait_2);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the preference save button");
        }
        Functions.simpleWait(Constants.wait_3);

        // When user to see the continue and See My subscription
        try {
            Functions.simpleWait(Constants.wait_2);
            String c = Functions.driver.findElement(continue_shopping).getText();
            print(c + " ----- user was able to see the continue shopping button on subscription success screen");
            String m = Functions.driver.findElement(see_my_subs).getText();
            print(m + " ----- user was able to see the see my subscription button on subscription success screen");

        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user don't able to see the continue & See My Subscription Button");
        }
        Functions.simpleWait(Constants.wait_3);
        // When user click on the See My Subscription Button
        print("***********************Checking for My subscription button**************************");
        try {
            Functions.simpleWait(Constants.wait_2);
            Functions.driver.findElement(see_my_subs).click();
            Functions.simpleWait(Constants.wait_3);
            print("The uer was successfully clicked on the See My Subscription Button");
            print("Now user is on My Subscription Screen");
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the see my subscription button");
        }

        // For checking user was able to see yor subscription or not
        print("******************Checking for our Subscription from My subscription screen******************************");
        try{
           String my_sbs = Functions.driver.findElement(your_subs).getText();
           print(my_sbs + " ---- The user was able to see Our Subscription");
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The User Was Not Able To See Our Subscription Data On My Subscription Screen");
        }

        Functions.simpleWait(Constants.wait_5);

        // When user check Our Subscription Plan Type
        print("*********************Checking the subscription Plan***********************************");
        try{
            try{
                String daily  = Functions.driver.findElement(planTypeD).getText();
                print(daily + " ******* User was able to see the daily plan type");
            }catch (Exception e){
                print("The user doesn't take Daily subscription plan");
            }
            try{
                String alternate  = Functions.driver.findElement(planTypeA).getText();
                print(alternate + " ******* User was able to see the alternate plan type");
            }catch (Exception e){
                print("The user doesn't take Alternate subscription plan");
            }
            try{
                String custom  = Functions.driver.findElement(planTypeC).getText();  // Checking plan type for custom
                print(custom + " ******* User was able to see the daily plan type");
                try{
                    Functions.driver.findElement(planTypeC_i_button).click(); // When user click on the (i) button on custom plan on My subscription screen
                    print("now user was able to see the custom popup");
                    Functions.simpleWait(Constants.wait_1);
                    String plan_text = Functions.driver.findElement(custom_plan_popup).getText();  // Checking Popup heading
                    print(plan_text + " ------ User is on custom plan popup, when user click on the i button on my subscription");
                    String delivery_day_text = Functions.driver.findElement(delivery_day).getText(); // Checking for delivery day text
                    print(delivery_day_text + " ------- User was able to see delivery day text on popup");
                    String quantity_text = Functions.driver.findElement(quantity).getText();  // Checking for Quantity text
                    print(quantity_text + " ------ User was able to see the the quantity text on popup");
                    Functions.driver.findElement(custom_popup_close_button).click(); // when user click on the cross icon on custom popup
                }catch (Exception e){
                    print("********//////////////////Test Case Fail////////////////***********");
                    print("The User doesn't click on the Custom plan i button comes on: \n My subscription Screen");
                }
            }catch (Exception e){
                print("The user doesn't take Custom subscription plan");
            }
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user do not able to see the subscription plan type");
        }

        Functions.simpleWait(Constants.wait_2);
        print("**********************Checking for delete button on Yor Subscription section*************************");
        try{
            String deleteButton = Functions.driver.findElement(subs_delete_button).getText(); // The user was able to see the see delete button
            print(deleteButton);
            Functions.driver.findElement(subs_delete_button).click();
            print("The user was able to see the delete button\nThe user was able to click on the delete button");
            Functions.simpleWait(Constants.wait_1);
            try {
               String popup_delete_subs_heading_text = Functions.driver.findElement(popup_delete_subs_heading).getText(); // Checking for popup heading
               print(popup_delete_subs_heading_text + "\nThe user was able to see the Delete popup Heading");

               String delete_button_text = Functions.driver.findElement(delete_button_popup).getText(); // Checking for delete button
               print(delete_button_text + "\nThe user was able to see the delete button in Delete Subscription? popup");

               String mark_holiday_button_text = Functions.driver.findElement(mark_holiday_popup).getText(); // Checking for mark holiday button
               print(mark_holiday_button_text + "\n The user was able to see the Mark Holiday button in Delete Subscription? popup");
               Functions.simpleWait(Constants.wait_3);
               // When user click on the delete button in Delete Subscription? popup
                Functions.driver.findElement(delete_button_popup).click();
                print("The user click on the delete button comes in Delete Subscription? popup");
                Functions.simpleWait(Constants.wait_1);

               // Now user is on Order Placed Already Popup
                String  order_placed_already_text = Functions.driver.findElement(order_placed_already).getText(); // Checking for popup heading
                print(order_placed_already_text + " \n ----The user was able to see the popup heading");

                // Now Checking for Button Text
                String cancel_order_button_text = Functions.driver.findElement(cancel_order).getText();
                print(cancel_order_button_text + " \n ---- The user was able to see the cancel order button");
                Functions.simpleWait(Constants.wait_1);
                String do_not_cancel_button_text =Functions.driver.findElement(do_not_cancel).getText();
                print(do_not_cancel_button_text + " \n ---- The user was able to see the do not cancel button");
                Functions.simpleWait(Constants.wait_1);
                Functions.driver.findElement(cross_button_on_OPA).click(); // Check for cross button on OPA popup
                print("The user was successfully click on the cross button on order placed already");
                Functions.simpleWait(Constants.wait_5);
                Functions.driver.findElement(subs_delete_button).click(); // Delete button form my subscription screen
                print("The user again click on the delete button to check mark holiday button");
                Functions.simpleWait(Constants.wait_5);
                Functions.driver.findElement(mark_holiday).click(); // When user click on the mark holiday button
                print("The user is on Mark Holiday screen");
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(back_buton_mark_holiday).click();
            }catch (Exception e){
                print("********//////////////////Test Case Fail////////////////***********");
                print("The user not able to click on the delete button on My Subscription screen");
            }
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to see the delete button \n Don't able to click on the delete button");
        }
        Functions.simpleWait(Constants.wait_2);
        try{
           String modifyButton =  Functions.driver.findElement(subs_modify_button).getText();
           print(modifyButton + " \n The user was able to see the Modify button on My subscription Screen");
           try{
               Functions.driver.findElement(subs_modify_button).click(); // when user click on the modify button
               print("The user successfully click on the modify subs. button comes on My subscription screen");
               Functions.simpleWait(Constants.wait_5);
               String ModifySubsHeading = Functions.driver.findElement(modify_screen).getText();
               print(ModifySubsHeading + "\nThe user was able to see the Modify screen heading");
               Functions.simpleWait(Constants.wait_2);
               // checking for other subscription type
               Functions.driver.findElement(alternate).click(); // When user click on the alternate subs plan
               Functions.simpleWait(Constants.wait_2);
               Functions.driver.findElement(custom).click(); // When user click on the custom subs plan
               Functions.simpleWait(Constants.wait_2);
               Functions.driver.findElement(daily).click(); // when user click on the Daily subs. plan
               Functions.simpleWait(Constants.wait_2);
               Functions.driver.findElement(back_button_modify_screen).click(); // When user click on the back button on Modify Subs Screen
               Functions.simpleWait(Constants.wait_2);
           }catch (Exception e){
               print("********//////////////////Test Case Fail////////////////***********");
               print("The user don't able to click on the modify subscription button on My subscription screen");
           }
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not able to see the Modify button on My subscription screen");
        }

        // When user click on the Mark holiday button
        try{
            String mark_holiday_button_text = Functions.driver.findElement(subs_mark_holiday).getText();
            print(mark_holiday_button_text +"\nThe user was able to see the Mark Holiday Button text on My subscription screen");
            try {
                Functions.simpleWait(Constants.wait_3);
                Functions.driver.findElement(subs_mark_holiday).click(); // when user click on the mark holiday button
                print("The User now on Mark Holiday screen");
                Functions.simpleWait(Constants.wait_2);
                Functions.driver.findElement(cancel_button_MH).click(); // when user click on the cancel button comes in Mark holiday screen
            }catch (Exception e){
                print("********//////////////////Test Case Fail////////////////***********");
                print("The user not able to click on the Mark Holiday button on My subscription screen");
            }
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user was not able to see the mark holiday button text on my subscription screen");
        }
        Functions.simpleWait(Constants.wait_2);
    }
    // When user click on the inc. subs quantity button from quick selection
    public void quick_selection_inc_or_dec_button(String xpath, int times) {
        try {
            WebDriver appiumDriver = Functions.driver;
            WebDriverWait wait = new WebDriverWait((appiumDriver), Duration.ofSeconds(10));
            print("*********Now User increase the Subscription product Quantity*************************");

            // Loop for to click on the add (+) button on quick selection
            for (int i = 0; i < times; i++) {
                try {
                    WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(quick_inc_quant));
                    button.click();
                    print("Clicked the button " + (i + 1) + " times"); // print the value, how many tme user was click on the (+) button
                    // Add a short wait between clicks if necessary
                    Functions.simpleWait(Constants.wait_5); // Sleep for 500 milliseconds
                } catch (Exception e) {
                    print("Failed to click the button: " + e.getMessage());
                    break;
                }
            }
            Functions.simpleWait(Constants.wait_5);
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("Thee user Not able to inc. the subscription product quantity from quick selection");
        }
        try {
            WebDriver appiumDriver = Functions.driver;
            WebDriverWait wait = new WebDriverWait((appiumDriver), Duration.ofSeconds(10));
            print("*********Now User decrease the Subscription product Quantity*************************");

            // Loop for to click on the add (-) button on quick selection
            for (int i = 0; i < times; i++) {
                try {
                    WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(quick_dec_quant));
                    button.click();
                    print("Clicked the button " + (i + 1) + " times"); // print the value, how many tme user was click on the (-) button
                    // Add a short wait between clicks if necessary
                    Functions.simpleWait(Constants.wait_5); // Sleep for 500 milliseconds
                } catch (Exception e) {
                    print("Failed to click the button: " + e.getMessage());
                    break;
                }
            }
        } catch (Exception e) {
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user Not able to dec. the subscription product quantity from quick selection");
        }
        try{
            print("The user was able to see the the pack Quantity can't be zero! popup");
            Functions.driver.findElement(pause_cross_button).click();
            print("The user successfully click on the popup cross button");
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The was not able to see the pack quantity can't be zero! popup");
        }
        Functions.simpleWait(Constants.wait_2);
        try{
            // For when user click on the pause subs. button from quick selection
            Functions.driver.findElement(pause_button).click(); // When user pause the subscription
            print("The user successfully click on the pause subscription button from quick selection");
            Functions.simpleWait(Constants.wait_2);
            try{
                // For when user click on the continue button to pause the subscription from quick selection
                Functions.driver.findElement(pause_subs_continue_button).click();
                print("The user successfully pause the ---- SUBSCRIPTION ORDER");
            }catch (Exception e){
                print("********//////////////////Test Case Fail////////////////***********");
                print("The user not able to click on the continue button to pause the subscription from quick selection");
            }

        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the pause subscription button from quick selection");
        }
        Functions.simpleWait(Constants.wait_6);
        try {
            Functions.driver.findElement(resume_subs).click();
            print("The user successfully click on the resume subscription button from quick selection");
        }catch (Exception e){
            print("********//////////////////Test Case Fail////////////////***********");
            print("The user not able to click on the resume subscription button from quick selection");
        }

    }

}



