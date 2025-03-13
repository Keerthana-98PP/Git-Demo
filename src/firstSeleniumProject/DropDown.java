package firstSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       WebElement currencyDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select currency=new Select(currencyDropdown);
        currency.selectByContainsVisibleText("INR");
        currency.selectByIndex(1);
        currency.selectByValue("AED");
        Thread.sleep(1000);
        driver.findElement(By.className("adult-infant-child")).click();
        Thread.sleep(1000);
        int i=1;
        while(i<4) {
        driver.findElement(By.id("hrefIncAdt")).click();     
        i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
	}
	

}
