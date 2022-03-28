package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyButtonsDoubleClickMe {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/buttons");
        Driver.manage().window().maximize();

        String DoubleClickMeId = "doubleClickBtn";
        WebElement DoubleClickMe = Driver.findElement(By.id(DoubleClickMeId));

        Actions Action = new Actions(Driver);
        Action.doubleClick(DoubleClickMe).perform();
    }
}
