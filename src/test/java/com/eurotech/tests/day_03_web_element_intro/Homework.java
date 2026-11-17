package day_03_web_element_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.eurotech.utilities.WebDriverFactory.getDriver;

public class Homework {

    public static void main(String[] args) throws InterruptedException {
    /** HOMEWORK
     * Open chrome browser
     * navigate to https://www.amazon.com/
     * write "Java" to the search bar
     * click search button
     * get result for text
     * verify that the text contains "Java"
     */
        // open chrome browser
        WebDriver driver = getDriver("chrome");

        // Navigate to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //
        driver.findElement(By.cssSelector("button[alt=\"Continue shopping\"]")).click();
        Thread.sleep(2000);

        // write "Java" to the search bar
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java");

        //click search button
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(2000);

        // get result for text
        WebElement resultSearchBox = driver.findElement(By.cssSelector("span[data-component-type=\"s-search-results\"]"));
        String actualResultText = resultSearchBox.getText();
        System.out.println("actualResultText = " + actualResultText);

        // Verify that the text contains "Java"
        if (actualResultText.contains("Java")) {
            System.out.println("TEST PASSED: Result contains 'Java'");
        } else {
            System.out.println("TEST FAILED: Result does not contain 'Java'");
        }

        // Close the browser
        driver.quit();
    }
}
