package firstSeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Rahul");
		driver.findElement(By.name("email")).sendKeys("contact@rahulshettyaccademy.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahul@123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//select/option[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.name("bday")).sendKeys("25-12-1998");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.className("alert-success")).getText());

	}

}
