package day_01_intro_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_WindowMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //get the link "https://sdettest.eurotechstudy.eu"
        driver.get("https://sdettest.eurotechstudy.eu");

        //make the browser window full
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        //get the title and print it
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //add a wait
        Thread.sleep(5000);

        //close the browser
        driver.quit();
    }
}
