package Demoqa;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class MyBrokenImages {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/broken");
        //Driver.manage().window().maximize();

        String BrokenImageXPath = "//div/img[2]";
        WebElement BrokenImage = Driver.findElement(By.xpath(BrokenImageXPath));
        String BrokenImageURL = BrokenImage.getAttribute("src");
        System.out.println(BrokenImageURL);

        CloseableHttpClient Client = HttpClientBuilder.create().build();
        HttpGet Request = new HttpGet(BrokenImageURL);
        HttpResponse Response = Client.execute(Request);
        int StatusCode = Response.getStatusLine().getStatusCode();
        System.out.println(StatusCode);


    }
}
