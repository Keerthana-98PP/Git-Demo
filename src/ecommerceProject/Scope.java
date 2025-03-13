package ecommerceProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1.get number of all the links present in the page
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.get number of links present at the footer section 
		
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3.get  1st column
		
		WebElement columndriver= footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4.open links in different tabs and get the title of each page
		
	    for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
	    	
	    	String openNewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(openNewTab);
	    	Thread.sleep(10000);
	    }
	    
	    Set<String> windows=driver.getWindowHandles();
	     Iterator<String> it=windows.iterator();
	     while(it.hasNext()) {
	    	 
	    	 driver.switchTo().window(it.next());
	    	 System.out.println(driver.getTitle());
	     }

	}

}
