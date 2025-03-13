package ecommerceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
