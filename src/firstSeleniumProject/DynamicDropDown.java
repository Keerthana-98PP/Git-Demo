package firstSeleniumProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	 static WebDriver driver; public static void main(String[] args) throws InterruptedException {   
		 System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
             
		WebDriver driver =new ChromeDriver();     
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");      
		     
		      
		
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();     
		 driver.findElement(By.cssSelector("a[value='DEL']")).click();      
		 
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();   
		 driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		 
		 //another way driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click(); parent child relation ship
	 }
}
