package ecommerceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement source= driver.findElement(By.id("draggable"));
		 WebElement target=driver.findElement(By.id("droppable"));
		 
		Actions action=new Actions(driver);
		
	    action.dragAndDrop(source, target).build().perform();
	    
	    driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//a[text()='Accept']")).click();
		 

	}

}
