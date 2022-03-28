package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyFrames {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/frames");

        Driver.switchTo().frame("frame1");

        WebElement Heading = Driver.findElement(By.id("sampleHeading"));
        String HeadingText = Heading.getText();
        System.out.println(HeadingText);

        Driver.switchTo().parentFrame();

        List<WebElement> ElementList = Driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String ElemenListText = ElementList.get(0).getText();
        System.out.println(ElemenListText);

    }
}
