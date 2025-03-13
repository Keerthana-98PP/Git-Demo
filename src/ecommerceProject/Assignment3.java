package ecommerceProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		signin(driver);

		addToCart(driver);
	}

	public static void signin(WebDriver driver) {

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[Value='user']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//select/option[@value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

	}

	public static void addToCart(WebDriver driver) {

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> products = driver.findElements(By.cssSelector("button.btn-info"));
		for (WebElement product : products) {

			product.click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
