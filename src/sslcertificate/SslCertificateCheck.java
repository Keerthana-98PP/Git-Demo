package sslcertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCertificateCheck {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
		
		
	}

}
