package day_03_web_element_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class T02_VerifyURLIsChanged {
    public static void main(String[] args) throws InterruptedException {
        /**
         * -Task-
         * Open Chrome browser
         * go to "https://demoqa.com/login"
         * enter "test" into the username box
         * enter "Test.!123" into the passworde box
         * click on the login button
         * Verify that url is changed as "https://demoqa.com/profile" (expected)
         */
        //Open Chrome browser
        WebDriver driver = getDriver("chrome");

        //go to "https://demoqa.com/login"
        driver.get("https://demoqa.com/login");
        Thread.sleep(4000);

        //enter "test" into the username box
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("test");
        Thread.sleep(4000);

        //enter "Test.!123" into the passworde box
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test.!123");
        Thread.sleep(4000);

        //click on the login button
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(4000);


        // Verify that url is changed as "https://demoqa.com/profile" (expected)
        String expectedURL = "https://demoqa.com/profile";
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);

        if(actualURL.equals(expectedURL)) {
            System.out.println("PASSED");
        }
        else {
            System.out.println("FAILED");
        }

        //close the browser
        driver.close();
    }
}
