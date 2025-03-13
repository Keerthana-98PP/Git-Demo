package miscelleanousprojects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsAndCookies {

	public static void main(String[] args) {
		System.setProperty("webDriver.gecko.driver", "C:\\Users\\hp\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
        
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed(null);
		
		driver.get("https://www.google.com/");
	}

}
