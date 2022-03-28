package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAlerts {

    /*
    * => Acilan Alert penceresideki onay butonuna basmak icin
    * Driver.switchTo().alert().accept();
    */

    /*
     * => Acilan Alert penceresideki reddet butonuna basmak icin
     * Driver.switchTo().alert().dismiss();
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/alerts");

        String AlertButtonId ="alertButton";
        WebElement AlertButton = Driver.findElement(By.id(AlertButtonId));
        AlertButton.click();

        try {
            Thread.sleep(2500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Driver.switchTo().alert().accept();
    }

}
