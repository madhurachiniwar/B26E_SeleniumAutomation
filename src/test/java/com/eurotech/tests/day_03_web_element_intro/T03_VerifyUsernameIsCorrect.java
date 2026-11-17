package day_03_web_element_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class T03_VerifyUsernameIsCorrect {
    public static void main(String[] args) throws InterruptedException {
        /**
         * - TASK -
         * open chrome browser
         * go to "https://demoqa.com/login"
         * enter "test" into the username box
         * VERIFY that "test" is displayed in the username box
         * enter "Test.!123" into the password box
         * click on login button
         * VERIFY that username is "test"
         */

        // open chrome browser
        WebDriver driver = getDriver("chrome");

        // go to "https://demoqa.com/login"
        driver.get("https://demoqa.com/login");

        // enter "test" into the username box
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("test");

        // VERIFY that "test" is displayed in the username box
        String actualUsername = username.getAttribute("value");
        String expectedUsername = "test";
        System.out.println("actualUsername = " + actualUsername);

        if(actualUsername.equals(expectedUsername)){
            System.out.println("Displayed username test : PASSED");
        } else {
            System.out.println("Displayed username test : FAILED");
        }

        // enter "Test.!123" into the password box
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test.!123");

        // click on login button
        WebElement loginButton = driver.findElement(By.id("login"));
        // driver.findElement(By.id("login")).click();
        loginButton.click();
        Thread.sleep(3000);

        // VERIFY that username is "test"
        WebElement loggedUserName = driver.findElement(By.id("userName-value"));
        String actualLoggedUsername = loggedUserName.getText();
        String expectedLoggedUsername = "test";
        if(actualLoggedUsername.equals(expectedLoggedUsername)){
            System.out.println("Logged username test : PASSED");
        } else {
            System.out.println("Logged username test : FAILED");
        }

        // close the driver
        driver.close();

    }
}
