package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MyWindowTab {

    /*
    * => Tarayicida kac tane sekme var onları listede tut ve ekranda sayisini goster
    * List<String> WindowTab = new ArrayList<>(Driver.getWindowHandles());
    System.out.println(WindowTab.size());
     */
    /*
    * İstedigim sekmeye gecis yapmak istersem de kullanirim bunu
     * => 2. Sekmeye gecis yap ve o sekmenin URL 'sini al
     * Driver.switchTo().window(WindowTab.get(1));
     * System.out.println(Driver.getCurrentUrl());
     */
    /*
    * => Sekmeyi Kapat
    * Driver.close();
    */

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/browser-windows");

        String NewTabButtonId = "tabButton";
        WebElement NewTabButton = Driver.findElement(By.id(NewTabButtonId));
        NewTabButton.click();

        List<String> WindowTab = new ArrayList<>(Driver.getWindowHandles());
        System.out.println("Toplam Sekme Sayisi :" + WindowTab.size());

        Driver.switchTo().window(WindowTab.get(1));

        System.out.println("Mevcut Sekme URLsi : " + Driver.getCurrentUrl());

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Driver.close();

    }
}
