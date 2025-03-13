package ecommerceProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);

		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentid);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());

	}

}
