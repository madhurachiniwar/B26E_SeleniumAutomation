package day_01_intro_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_OpenBrowser {
    public static void main(String[] args) {
        // creat a webdriver -> chrome, firefox, edge...
        WebDriver driver =new ChromeDriver(); //polymorphism

        //navigate to a url
        driver.get("https://sdettest.eurotechstudy.eu");

        //get the title
        System.out.println("driver.getTitle() = " + driver.getTitle());

    }
}
