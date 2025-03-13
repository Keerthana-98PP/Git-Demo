package seleniumLatestFeatures;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingMultipleWindws {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
	String	parentHandle=it.next();
		
	String	childHandle=it.next();
	
	driver.switchTo().window(childHandle);
	
	driver.get("https://rahulshettyacademy.com/");
	String text=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/core-java']")).get(1).getText();
	 driver.close();
	driver.switchTo().window(parentHandle);
	
	WebElement name=driver.findElement(By.name("name"));
	name.sendKeys(text);
	File src= name.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\screenshot1.png"));
	System.out.println(name.getRect().getHeight());
		System.out.println(name.getRect().getWidth());
	
      

	}

}
