//package Deeplinks;
//
//import org.junit.Test;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class Banner_Deeplink {
//    static void print(String val) {
//        System.out.println(val);
//    }
//
//    static void sleep(int val) throws InterruptedException {
//        Thread.sleep(val);
//    }
//
//    @Test
//    public void banner_screen_deeplink() throws MalformedURLException, InterruptedException {
//        URL url = new URL("http://localhost:4723/wd/hub");
//        MobileCapability.App.get("https://otipy.app.link/bIezcktmzIb");
//        print("Banner_Screen_Clicked" + " https://otipy.app.link/bIezcktmzIb");
//        sleep(2000);
//    }
//}