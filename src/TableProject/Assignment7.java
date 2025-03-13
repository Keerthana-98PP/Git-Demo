package TableProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,521)");
		
		System.out.println(" Rows"+driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println("Colums:"+ driver.findElements(By.cssSelector(".table-display tr:nth-child(1) th")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());

}
}