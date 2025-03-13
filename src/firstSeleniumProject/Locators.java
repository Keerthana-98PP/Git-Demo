package firstSeleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
System.setProperty("webDriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://rahulshettyacademy.com/locatorspractice/");

driver.findElement(By.id("inputUsername")).sendKeys("keerthana");
driver.findElement(By.name("inputPassword")).sendKeys("Password123");
driver.findElement(By.className("signInBtn")).click();
String errorMessage=driver.findElement(By.cssSelector("p.error")).getText();
System.out.println(errorMessage);
driver.findElement(By.linkText("Forgot your password?")).click();

try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Keerthana");
driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("keerthana@gmail.com");
driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9947614809");
driver.findElement(By.cssSelector("input[placeholder='Name']")).clear();
driver.findElement(By.xpath("//form/div/button[2]")).click();
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
driver.findElement(By.id("inputUsername")).sendKeys("rahul");
driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.name("chkboxTwo")).click();
driver.findElement(By.xpath("//button[@type='submit']")).click();
}

	
}
