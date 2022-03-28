package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class MyDownload {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/upload-download");
        //Driver.manage().window().maximize();

        String DownloadButtonId = "downloadButton";
        WebElement DownloadButton = Driver.findElement(By.id(DownloadButtonId));
        DownloadButton.click();

        String FilePath = "D://HDD İndirilenler";
        String FileName = "sampleFile.jpeg";
        Thread.sleep(2000);
        boolean IsFileDownloaded = IsFileDownloaded(FilePath, FileName);
        System.out.println(IsFileDownloaded);
    }

    public static boolean IsFileDownloaded(String FilePath, String FileName) {
        File File = new File(FilePath);
        File[] FilesArray = File.listFiles();

        for (int i = 0; i < FilesArray.length; i++) {
            if (FilesArray[i].getName().equals(FileName)) {
                FilesArray[i].delete();
                return true;
            }
        }
        return false;
    }
}
