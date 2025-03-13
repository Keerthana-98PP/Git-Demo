package firstSeleniumProject;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class CheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		 
		int count=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		Assert.assertEquals(count, 6);
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
     System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
     
     
     
	}
	
	
	

}
