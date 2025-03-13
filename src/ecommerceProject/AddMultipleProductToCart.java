package ecommerceProject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleProductToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] purchaseItem= {"Cucumber","Tomato","Potato"};
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		addItems(driver,purchaseItem);
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
        

	}


