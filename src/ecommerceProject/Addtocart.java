package ecommerceProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String productName = products.get(i).getText();
			if (productName.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}

		}

	}

}
