package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccordian {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/accordian");

        WebElement FirstCard = Driver.findElement(By.xpath("//div[@class='card'][1]/div[2]"));
        String ClassName = FirstCard.getAttribute("class");
        System.out.println(ClassName);

        Driver.findElement(By.id("section1Heading")).click();
        ClassName = FirstCard.getAttribute("class");
        System.out.println(ClassName);

    }
}
