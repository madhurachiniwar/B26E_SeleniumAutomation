package day_03_web_element_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class T04_GetAttribute_Practice {
    public static void main(String[] args) throws InterruptedException {
        /**
         * -Task-
         * open chrome browser
         * go to "https://demoqa.com/login"
         * get text value of "username"
         * get placeholder value of username
         * get text value of "password"
         * get placeholder value of password
         * enter the username as "Test"
         * enter the password as "password"
         * click on login button
         * Verify that "Invalid username or password!" message is displayed on the page
         */
        //open chrome browser
        WebDriver driver = getDriver("chrome");

        // go to "https://demoqa.com/login"
        driver.get("https://demoqa.com/login");

        // get text value of "username"
        String usernameText = driver.findElement(By.id("userName-label")).getText();
        System.out.println("usernameText = " + usernameText);

        // get placeholder value of username
        String placeholderUsername = driver.findElement(By.id("userName")).getAttribute("placeholder");
        System.out.println("placeholderUsername = " + placeholderUsername);

        // get text value of "password"
        String passwordText = driver.findElement(By.id("password-label")).getText();
        System.out.println("passwordText = " + passwordText);

        // get placeholder value of password
        String placeholderPassword = driver.findElement(By.id("password")).getAttribute("placeholder");
        System.out.println("placeholderPassword = " + placeholderPassword);

        // enter the username as "Test"
        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("Test");

        // enter the password as "password"
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test.!123");

        // click on login button
        WebElement loginButton = driver.findElement(By.id("login"));

        // Verify that "Invalid username or password!" message is displayed on the page
        String actualWarningMessage= driver.findElement(By.id("name")).getText();
        String expectedWarningMessage = "Invalid username or password!";
        Thread.sleep(2000);


        //close the browser
        driver.close();

    }

}
