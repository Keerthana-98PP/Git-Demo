package ecommerceProject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckOut {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		String[] purchaseItem= {"Cucumber","Tomato","Potato"};
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		addItems(driver,purchaseItem);
		checkout(driver);

	}
	public static  void addItems(WebDriver driver,String[] purchaseItem) {
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {

			String[] productName = products.get(i).getText().split("-");
			String formatedProductName=productName[0].trim();
			List<String> purchaseList=Arrays.asList(purchaseItem);
			
			if (purchaseList.contains(formatedProductName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==purchaseItem.length) {
				break;
				}
			}
		}
	}
	public static void checkout(WebDriver driver) throws InterruptedException {
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
		driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		 WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		String msg= driver.findElement(By.className("promoInfo")).getText();
		Assert.assertEquals(msg,"Code applied ..!");
		System.out.println(msg);
		driver.findElement(By.xpath("//div/button[text()='Place Order']")).click();
			
		}
		}
	


