package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    public WebDriver driver;
    public WebDriverWait wait;

    static void monthAndYear(WebDriver driver,String month,String year){
        while (true) {
            String m = driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
            String y = driver.findElement(By.cssSelector("span.ui-datepicker-year")).getText();
            if (month.equals(m) && year.equals(y)) {
                break;
            }
            WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
            nextButton.click();
        }
    }

    static void daySelect(WebDriver driver,String day){
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td/a"));
        for (WebElement i : allDates) {
            if (i.getText().equals(day)) {
                i.click();
                break;
            }
        }
    }

    public static void main(String[] args) {

        String fullDate = "05/04/2026";
        String month = "December";
        String day = "31";
        String year = "2027";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Method 1: Directly sending keys to date picker
        WebElement datePicker = driver.findElement(By.cssSelector("input#datepicker"));
        //datePicker.sendKeys(fullDate);
        datePicker.click();

        //WebElement nextClick=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        monthAndYear(driver,month,year);
        daySelect(driver,day);
    }
}
