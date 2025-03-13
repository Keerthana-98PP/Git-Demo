package ecommerceProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("checkBoxOption2")).click();
		String option= driver.findElement(By.cssSelector("label[for='benz']")).getText();
	
		
		 WebElement dropDown=driver.findElement(By.id("dropdown-class-example"));
		 Select select=new Select(dropDown);
		 select.selectByVisibleText(option);
		 
		 driver.findElement(By.id("name")).sendKeys(option);
		 driver.findElement(By.id("alertbtn")).click();
		String alertText= driver.switchTo().alert().getText();
		if(alertText.contains(option)) {
			
			System.out.println("Alert message success");
		}
		else
			System.out.println("Something went Wrong");
		
	}

}
