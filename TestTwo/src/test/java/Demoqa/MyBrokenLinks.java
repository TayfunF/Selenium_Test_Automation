package Demoqa;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.sql.SQLOutput;

public class MyBrokenLinks {

    /*
    * Bu kutuphaneyi pom.xml 'e koyduktan sonra alttaki islemleri yapabilirim
    *
    *<!-- https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient -->
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.13</version>
        </dependency>
    */
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/broken");

        CloseableHttpClient Client = HttpClientBuilder.create().build();
        HttpGet Request = new HttpGet("https://demoqa.com");
        HttpResponse Response = Client.execute(Request);
        int StatusCode = Response.getStatusLine().getStatusCode();
        System.out.println("Ok : " + StatusCode);

        CloseableHttpClient Client2 = HttpClientBuilder.create().build();
        HttpGet Request2 = new HttpGet("http://the-internet.herokuapp.com/status_codes/500");
        HttpResponse Response2 = Client2.execute(Request2);
        int StatusCode2 = Response2.getStatusLine().getStatusCode();
        System.out.println("Internal Server Error : " + StatusCode2);
    }
}
