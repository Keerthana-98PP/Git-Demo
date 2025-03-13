package firstSeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class RadiButtonAndFielEnablement {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")){
		
		System.out.println("Return Date Enabled");
		Assert.assertTrue(true);
		
	}
	else
	{
		Assert.assertTrue(false);
	}
	
	
	}

}
