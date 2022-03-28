package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAlert4 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/alerts");

        Driver.findElement(By.id("promtButton")).click();

        Driver.switchTo().alert().sendKeys("Tayfun");
        Driver.switchTo().alert().accept();



    }
}
