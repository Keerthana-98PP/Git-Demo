package seleniumLatestFeatures;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
public class RelativeLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement textBoxName=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(textBoxName)).getText());
		
		textBoxName.click();
		 driver.findElement(By.name("email")).click();
		 
		 System.out.println(driver.findElement(with(By.tagName("div")).below(textBoxName)).getText());
		 JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
		 
		 WebElement student =driver.findElement(By.xpath("//label[text()='Student']"));
		 System.out.println(student.getText());

		 driver.findElement(with(By.tagName("input")).toLeftOf(student)).click();
		 
		WebElement checkbox=driver.findElement(By.className("form-check-input"));
		 System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(checkbox)).getText());
		
	}

}
