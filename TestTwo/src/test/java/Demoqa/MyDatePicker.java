package Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyDatePicker {

    /*
    * DropdownList vs olursa Select Kullanimi Burda
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://demoqa.com/date-picker");

        String SelectDateId = "datePickerMonthYearInput";
        WebElement SelectDate = Driver.findElement(By.id("datePickerMonthYearInput"));
        SelectDate.click();

        WebElement SelectDateMonth = Driver.findElement(By.className("react-datepicker__month-select"));

        Select SelectForMonth = new Select(SelectDateMonth);
        SelectForMonth.selectByVisibleText("November");

        WebElement SelectDateYear = Driver.findElement(By.className("react-datepicker__year-select"));
        Select SelectForYear = new Select(SelectDateYear);
        SelectForYear.selectByValue("1995");

        List<WebElement> DaysElement = Driver.findElements(By.cssSelector("div.react-datepicker__day"));

        for (WebElement Item : DaysElement) {

            String Text = Item.getText();

            if (Text.equals("22")) {
                Item.click();
                break;
            }
        }
    }
}
