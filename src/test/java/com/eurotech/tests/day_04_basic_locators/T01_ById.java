package day_04_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class T01_ById {
    public static void main(String[] args) throws InterruptedException {
        /**
         * open the browser
         * go to "https://demoqa.com/login"
         * locate the Username label and password label by using id locator
         * get the label text and print it
         * expected labels "UserName" and "Password"
         * VERIFY that expected labels equal to actual labels
         * close the driver
         */

        //creat chrome browser
        WebDriver driver = getDriver("chrome");

        // go to "https://demoqa.com/login"
        driver.get("https://demoqa.com/login");
        Thread.sleep(2000);

        //locate the Username label and password label by using id locator
        String usernameLabel = driver.findElement(By.id("userName-label")).getText();
        //String usernameLabel = driver.findElement(By.cssSelector("userName-label")).getText();
        String passwordLabel =  driver.findElement(By.id("password-label")).getText();
        System.out.println("usernameLabel = " + usernameLabel);
        System.out.println("passwordLabel = " + passwordLabel);

        String expectedUserNameLabel = "UserName :";
        String expectedPasswordLabel = "Password :";

        if(usernameLabel.equals(expectedUserNameLabel)){
            System.out.println("Username Label Text Test : PASSED");
        } else {
            System.out.println("Username Label Text Test : FAILED");
        }

        if(passwordLabel.equals(expectedPasswordLabel)){
            System.out.println("Password Label Text Test : PASSED");
        } else {
            System.out.println("Password Label Text Test : FAILED");
        }

       //close the browser
       driver.close();

        /**
         * ID Summary
         * - IDs are unique, but !!! html does not check it, so any dev can make mistake, so we are testers :)
         *          WE SHOULD CHECK IF ID IS UNIQUE, before use it (CTRL-F and type #id, and see 1 of 1)
         * - let check if ids are static or dynamic. IF IT IS DYNAMIC, USE ANOTHER LOCATOR
         *          id = ac543b24-bc64-492d-8a1f-a15bab824f09
         *          id = a7b68d32-d430-4103-90d9-be6a41253816
         */

    }
}
