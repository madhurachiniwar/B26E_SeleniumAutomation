package day_04_basic_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class T02_ByName {
    public static void main(String[] args) throws InterruptedException {
        /**
         * open the chrome browser
         * go to "https://demowebshop.tricentis.com"
         * locate the input box of "Sign up for our newsletter:"
         * enter the email "javasdet@gmail.com"
         * click on the subscribr button
         * VERIFY that subscription succeeded with the message
         * "Thank you for signing up! A verification email has been sent . We appriciate your interest."
         * close the driver
         * NewsletterEmail
         */

        //creat chrome browser
        WebDriver driver = getDriver("chrome");

        // go to "https://demowebshop.tricentis.com"
        driver.get("https://demowebshop.tricentis.com");
        Thread.sleep(2000);

        //locate the input box of "Sign up for our newsletter:"
        WebElement subscriptionNewsLetter = driver.findElement(By.name("NewsletterEmail"));
        subscriptionNewsLetter.sendKeys("javasdet@gmail.com");

        //click on the subscribr button
        driver.findElement(By.id("newsletter-subscribe-button")).click();
        Thread.sleep(2000);

        String actualResult = driver.findElement(By.id("newsletter-result-block")).getText();
        String expectedResult = "Thank you for signing up! A verification email has been sent. We appreciate your interest.";

        if(actualResult.equals(expectedResult)){
            System.out.println("Subscription Test : PASSED");
        } else {
            System.out.println("Subscription Test : FAILED");
        }

        //close the browser
        driver.close();
    }
}
