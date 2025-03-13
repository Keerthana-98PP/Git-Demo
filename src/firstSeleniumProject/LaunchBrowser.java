package firstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		//System.setProperty("webDriver.gecko.driver", "C:\\Users\\hp\\Documents\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		 System.setProperty("webDriver.edge.driver", "C:\\Users\\hp\\Documents\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		 driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
