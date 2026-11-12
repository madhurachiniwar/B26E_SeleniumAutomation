package day_03_web_element_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class T01_VerifyURLIsNotChanged {
    public static void main(String[] args) throws InterruptedException {


        /**
         * go to "https://demoqa.com/login"
         * click on login button
         * Verify that url is not changed (https://demoqa/login)
         */

        //open chrome browser
        WebDriver driver = getDriver("chrome");

        //go to go to "https://demoqa.com/login"
        driver.get("https://demoqa.com/login");
        Thread.sleep(4000);

        //store the expected url
        String expectedURL = driver.getCurrentUrl();
        System.out.println("expectedURL = " + expectedURL);

        //click on login button
        //id = "login"
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(4000);

        //store the actual url
        String actualURL= driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        //compare whether url is changed
        if(actualURL.equals(expectedURL)) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }

        //close the driver
        driver.close();
    }
}
