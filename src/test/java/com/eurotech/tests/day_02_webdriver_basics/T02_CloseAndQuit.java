package day_02_webdriver_basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setPosition(new Point(960,0));
        driver.manage().window().maximize();

        driver.get("https://sdettest.eurotechstudy.eu");
        Thread.sleep(2000);

        // save the original tab as firstTab
        String firstTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);

        driver.get("https://testrelic.com");
        Thread.sleep(2000);

        driver.navigate().to("https://google.com/");
        Thread.sleep(2000);

        //close the second tab
        driver.close();
        Thread.sleep(2000);

        //close the original window
        driver.switchTo().window(firstTab);

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Thread.sleep(2000);


        // closing the active tab, not close the browser but if you have only 1 tab, it closes the browser
        //driver.close();

        //quit(), close all the tabs and close the browser and delete the driver object
        driver.quit();

    }
}
