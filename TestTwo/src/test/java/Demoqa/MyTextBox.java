package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTextBox {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://demoqa.com/text-box");
        WebElement TxtboxFullName = Driver.findElement(By.id("userName"));
        TxtboxFullName.sendKeys("Tayfun");

        WebElement TxtboxEmail = Driver.findElement(By.id("userEmail"));
        TxtboxEmail.sendKeys("tayfun@firtina.com");

        WebElement TxtboxCurrentAddress = Driver.findElement(By.id("currentAddress"));
        TxtboxCurrentAddress.sendKeys("Mevcut Adres");

        WebElement TxtboxPermanentAddress = Driver.findElement(By.id("permanentAddress"));
        TxtboxPermanentAddress.sendKeys("Kalıcı Adres");

        WebElement TxtboxSubmitButton = Driver.findElement(By.id("submit"));
        TxtboxSubmitButton.click();

        //--------------------------------------------------------------------------------------------
        // xpath ile web elementindeki text'i bulma
        WebElement TxtboxFullNameResult = Driver.findElement(By.xpath("//div/p[@id='name']"));
        String name = TxtboxFullNameResult.getText();
        System.out.println(name);
    }
}
