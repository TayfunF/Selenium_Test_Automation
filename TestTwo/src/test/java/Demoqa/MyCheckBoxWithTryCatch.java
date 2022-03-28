package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCheckBoxWithTryCatch {

    /*
     * Checkbox 'ta ilk olarak .isEnabled() ile tiklanabilir bir ifade oldugunu belirtiriyoruz
     * Checked ve Unchecked olayi oldugu icin isEnabled oncesi ve sonrasi icin WebElement olusturuyoruz.
     * if ile tiklandimi kontrol ediyoruz
     * if icine Try-Catch Metodu koyuyoruz. (CheckBox yaninda ki labele vs ye tiklanabilir diye kontrol icin)
     * Checkbox 'in secilip secilmedigini anlamak icinde isSelected() kullaniyoruz.
     * */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/automation-practice-form");
        Driver.manage().window().maximize();

        String HobbiesSportsCheckboxId = "hobbies-checkbox-1";
        WebElement HobbiesSportsCheckbox = Driver.findElement(By.id(HobbiesSportsCheckboxId));
        boolean IsEnabled = HobbiesSportsCheckbox.isEnabled();
        //System.out.println(IsEnabled);
        String HobbiesSportsLabelFor = "label[for='hobbies-checkbox-1']";
        WebElement HobbiesSportsLabel = Driver.findElement(new By.ByCssSelector(HobbiesSportsLabelFor));

        if (IsEnabled) {
            try {
                HobbiesSportsCheckbox.click();
                System.out.println("Sports Checkbox Clicked");
            } catch (Exception exception) {
                HobbiesSportsLabel.click();
                System.out.println("Sports Label Clicked");
            }
        }
    }
}
