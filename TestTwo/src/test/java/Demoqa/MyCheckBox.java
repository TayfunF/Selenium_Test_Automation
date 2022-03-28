package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCheckBox {

    //WebElementte ki herhangibir attributenin degerini String olarak alabiliyoruz.
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get("https://demoqa.com/checkbox");

        //Css Selector ile bulma
        String HomeCheckBoxCssSelector = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement HomeCheckBox = Driver.findElement(new By.ByCssSelector(HomeCheckBoxCssSelector));
        HomeCheckBox.click();
        HomeCheckBox = Driver.findElement(new By.ByCssSelector(HomeCheckBoxCssSelector));

        //WebElementte ki herhangibir attributenin degerini String olarak alabiliyoruz.
        String HomeCheckBoxClassName = HomeCheckBox.getAttribute("class");

        if(HomeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked");
        }
        else{
            System.out.println("Checkbox is unchecked");
        }
    }
}
