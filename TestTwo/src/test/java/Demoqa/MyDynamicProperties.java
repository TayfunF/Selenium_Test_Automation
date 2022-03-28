package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;

public class MyDynamicProperties {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/dynamic-properties");
        Driver.manage().window().maximize();

        //----------Text Dynamic Id With XPath----------
        String TextDynamicXPath = "//div/p";
        WebElement TextDynamic = Driver.findElement(By.xpath(TextDynamicXPath));
        System.out.println(TextDynamic.getText());

        //----------Button Dynamic Id With WebDriverWait----------
        String EnableAfterFiveSecondsButtonId = "enableAfter";
        WebElement EnableAfterFiveSecondsButton = Driver.findElement(By.id(EnableAfterFiveSecondsButtonId));
        WebDriverWait Wait = new WebDriverWait(Driver, Duration.ofSeconds(5));
        Wait.until(ExpectedConditions.elementToBeClickable(EnableAfterFiveSecondsButton));
        EnableAfterFiveSecondsButton.click();

        //----------Color Change Button Dynamic Class----------
        String ChangeColorButtonId = "colorChange";
        WebElement ChangeColorButton = Driver.findElement(By.id(ChangeColorButtonId));
        String ClassName = ChangeColorButton.getAttribute("class");
        System.out.println("Before Change :" + ClassName);

        WebDriverWait Wait2 = new WebDriverWait(Driver, Duration.ofSeconds(5));
        Wait2.until(ExpectedConditions.attributeToBe(ChangeColorButton,ClassName,"mt-4 text-danger btn btn-primary"));
        ClassName = ChangeColorButton.getAttribute("class");
        System.out.println("After Change :" + ClassName);

        //----------Visible Button ----------
        WebDriverWait Wait3 = new WebDriverWait(Driver,Duration.ofSeconds(5));
        Wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.id("visibleAfter")));
        WebElement VisibleButton = Driver.findElement(By.id("visibleAfter"));
        VisibleButton.click();
    }
}
