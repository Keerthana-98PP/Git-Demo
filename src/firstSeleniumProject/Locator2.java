package firstSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String name="rahul";
		String password=getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys(password);
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String logInMsg=driver.findElement(By.tagName("p")).getText();
		System.out.println(logInMsg);
		Assert.assertEquals(logInMsg,"You are successfully logged in.");
		String helloMsg=driver.findElement(By.xpath("//div/h2")).getText();
		System.out.println(helloMsg);
		Assert.assertEquals(helloMsg,"Hello "+name+",");
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();// or we can use"//*[text()='Log Out']"

	}
	public static String getPassword(WebDriver driver) {
		String password;
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
	
		String msg=driver.findElement(By.cssSelector("form p")).getText();
		String[] password1=msg.split("'");
	
		String[] password2=password1[1].split("'");
		
		 password=password2[0];
		
		return password;
	}

}
