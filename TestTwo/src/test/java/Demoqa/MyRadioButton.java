package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyRadioButton {

    /*
     * CheckBox ile ayni mantikta.
     * */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/radio-button");
        Driver.manage().window().maximize();

        String RadioButtonYesId = "yesRadio";
        WebElement RadioButtonYes = Driver.findElement(By.id(RadioButtonYesId));
        boolean IsEnabled = RadioButtonYes.isEnabled();

        String RadioButtonLabelYesFor = "label[for='yesRadio']";
        WebElement RadioButtonLabelYes = Driver.findElement(new By.ByCssSelector(RadioButtonLabelYesFor));

        if (IsEnabled) {
            try {
                RadioButtonYes.click();
                System.out.println("Try is triggered");
            } catch (Exception exception) {
                RadioButtonLabelYes.click();
                System.out.println("Catch is triggered");
            }
        }

        Boolean IsSelected = RadioButtonYes.isSelected();
        if(IsEnabled){
            System.out.println("RadioButtonYes is Selected");
        }

        // TIKLANDIKTAN SONRA CIKAN TEST YAZISINI GORMEK ICIN getText(); KULLANIYORUZ.

        WebElement RadioButtonYesGetText = Driver.findElement(By.className("mt-3"));
        System.out.println(RadioButtonYesGetText.getText());


        DisabledRadioButton();

    }

    private  static void  DisabledRadioButton(){
        WebDriver Driver = new ChromeDriver();
        String RadioButtonNoId = "noRadio";
        WebElement RadioButtonNo = Driver.findElement(By.id(RadioButtonNoId));
        boolean isEnabled = RadioButtonNo.isEnabled();
        if(isEnabled){
            System.out.println("RadioButton is Enabled");
        }else{
            System.out.println("RadiButton is Disabled");
        }
    }

}
