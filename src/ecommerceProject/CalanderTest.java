package ecommerceProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalanderTest {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String month="5";
		String day="12";
		String year="2027";
		String[] expecteddate= {month,day,year};
		 
		driver.findElement(By.className("react-date-picker")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
		
	 List<WebElement> date= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__inputut"));
	 for(int i=0;i<date.size();i++) {
		 
		 System.out.println(date.get(i).getDomAttribute("value"));

	
		Assert.assertEquals(date.get(i).getDomAttribute("value"), expecteddate[i]);
	 }
	 
	 driver.close();
	}

}
