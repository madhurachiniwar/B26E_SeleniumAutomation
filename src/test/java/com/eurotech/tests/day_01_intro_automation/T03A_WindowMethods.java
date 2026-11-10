package day_01_intro_automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T03A_WindowMethods {
        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            //get the link "https://sdettest.eurotechstudy.eu"
            driver.get("https://sdettest.eurotechstudy.eu");

            //get the position of the browser window
            System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());

            //set the position of the browser window
            driver.manage().window().setPosition(new Point(500,350));

            //move the window to right of display
            driver.manage().window().setPosition(new Point(960,0));
            driver.manage().window().maximize();

            //get display dimentions

            int height = driver.manage().window().getSize().height;
            int width = driver.manage().window().getSize().width;

            System.out.println("height = "+ height);
            System.out.println("width = "+ width);

            System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

            driver.manage().window().setSize(new Dimension(393,852));


            //get the position of the browser window
            System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());


            //get the title and print it
            System.out.println("driver.getTitle() = " + driver.getTitle());

            //add a wait
            Thread.sleep(5000);

            //close the browser
            driver.quit();
        }
    }
