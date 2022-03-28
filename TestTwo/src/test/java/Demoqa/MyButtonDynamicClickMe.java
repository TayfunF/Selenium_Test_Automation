package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyButtonDynamicClickMe {

    /*
    * Sayfa Kaynagini Goruntule => Ctrl + F => //div/button[contains(text(), 'Click Me')]
    * Sayfa Kaynagini Goruntule => Ctrl + F => //div/button[starts-with(text(), 'Click Me')]
    * Sayfa Kaynagini Goruntule => Ctrl + F => //div[last()]/button
    * */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/buttons");
        Driver.manage().window().maximize();

        String ClickMeXPath = "//div/button[starts-with(text(), 'Click Me')]";
        WebElement ClickMe = Driver.findElement(By.xpath(ClickMeXPath));
        ClickMe.click();
    }
}
