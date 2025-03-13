package firstSeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Calander {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click(); 
		driver.findElement(By.xpath("//div/ul/li/a[@value='BLR']")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	}

}
