package technoStudy1.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilitesClass {
    public static WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
    public static void quitDriver(int time){   // here was problem thats name of the metod we calling from chld class here was different
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
//WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.get("https://www.saucedemo.com/");




//public static void quitDriver(int time){
//        try {
//            Thread.sleep(time*1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        driver.quit();
//    }