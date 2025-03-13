package firstSeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected(),true);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected(),false);
		//To find number of check boxes 
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
