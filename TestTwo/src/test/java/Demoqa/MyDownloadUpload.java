package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDownloadUpload {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/upload-download");

        String UploadFileId = "uploadFile";
        WebElement UploadFile = Driver.findElement(By.id(UploadFileId));
        UploadFile.sendKeys("D://HDD İndirilenler/user.png");
    }
}
