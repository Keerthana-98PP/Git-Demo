package firstSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndSpaceJetAutomation {

	public static void main(String[] args) throws InterruptedException {
		//Launch application
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Select Round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
			
			System.out.println("Return Date Enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//Select Origin and Destination location
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();     
		 driver.findElement(By.cssSelector("a[value='DEL']")).click();      
		 
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();   
		 driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		 
		 //Select date
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		 
		 //Select passengers 
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
		 
         //Select currency
	        WebElement currencyDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	        Select currency=new Select(currencyDropdown);
	        currency.selectByContainsVisibleText("INR");
	        currency.selectByIndex(1);
	        currency.selectByValue("AED");
	        
	        
	        
	      //Select Passenger type
	        int count1=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	   		System.out.println(count1);
	   		Assert.assertEquals(count1, 6);
	   		
	   		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	   		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	     System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
	     
	     
	     //Click on submit or search 
	     
	     driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	     }

}
