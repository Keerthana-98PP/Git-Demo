package firstSeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\hp>C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).click();
	
		
		
		
		
		
	}

}
