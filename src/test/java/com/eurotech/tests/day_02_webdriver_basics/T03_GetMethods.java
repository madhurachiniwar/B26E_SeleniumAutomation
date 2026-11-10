package day_02_webdriver_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03_GetMethods {
    public static void main(String[] args) throws InterruptedException {
        //set up a chrome browser
        //navigate to https://www.sdettest.eurotechstudy.eu
        //get Title
        //verify that title contains Eurotech
        //get url
        //verify that url contains Eurotech
        //get page source
        //verify that page source contains Eurotech

        String checkText = "eurotech";

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //navigate to https://www.sdettest.eurotechstudy.eu
        driver.get("https://www.sdettest.eurotechstudy.eu");
        Thread.sleep(3000);

        //get Title
        String title = driver.getTitle();
        System.out.println("Title = " + title);

        // verify that title contains eurotech
        if(title.toLowerCase().contains(checkText)){
            System.out.println("Title Test PASSED....");
        } else {
            System.out.println("Title Test FAILED....");
        }

        //verify that title contains Eurotech

        //get url
        String url = driver.getCurrentUrl();

        // verify that url contains eurotech
        if(title.toLowerCase().contains(checkText)){
            System.out.println("URL Test PASSED....");
        } else {
            System.out.println("URL Test FAILED....");
        }

        //verify that url contains Eurotech

        //get page source
        String pageSource= driver.getPageSource();
        //verify that page source contains Eurotech
        // verify that title contains eurotech
        if(title.toLowerCase().contains(checkText)){
            System.out.println("Page Source Test PASSED....");
        } else {
            System.out.println("Page Source Test FAILED....");
        }

        driver.close();
    }
}
