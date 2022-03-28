package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAlert2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/alerts");

        Driver.findElement(By.id("timerAlertButton")).click();

        WebDriverWait Wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
        Wait.until(ExpectedConditions.alertIsPresent());

        Driver.switchTo().alert().accept();

    }
}
