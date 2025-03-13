package ecommerceProject;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverOver {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Actions action=new Actions(driver);
		//Hover over
		action.moveToElement(driver.findElement(By.id("nav-link-amazonprime"))).build().perform();
		
		//Right Click
		action.contextClick(driver.findElement(By.id("nav-link-amazonprime"))).build().perform();
		
		//Enter in searchbox
		WebElement movemouse1=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));				  
		action.moveToElement(movemouse1).build().perform();		  
		action.click();
		
		;

	}

}
