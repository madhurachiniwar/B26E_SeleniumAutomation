package day_02_webdriver_basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        //set up a firefox driver
        //navigate to https://sdettest.eurotechstudy.eu/
        //navigate to https://testrelic.com
        //navigate back
        //navigate forward
        //refresh the page
        //then close the driver

        //set up a chrome browser
        WebDriver driver = new ChromeDriver();
        // WebDriver driverirefox = new Firefoxdriver();

        driver.manage().window().setPosition(new Point(960,0));
        driver.manage().window().maximize();

        driver.navigate().to("https://sdettest.eurotechstudy.eu/");
        Thread.sleep(5000);

        driver.navigate().to("https://testrelic.com");
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();

    }
}
