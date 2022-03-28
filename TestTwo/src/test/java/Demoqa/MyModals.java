package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyModals {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/modal-dialogs");

        WebElement SmallModal = Driver.findElement(By.id("showSmallModal"));
        SmallModal.click();

        WebElement SmallModalText = Driver.findElement(By.cssSelector("div.modal-body"));
        System.out.println(SmallModalText.getText());

        WebElement CloseSmallButton = Driver.findElement(By.id("closeSmallModal"));
        CloseSmallButton.click();
    }
}
