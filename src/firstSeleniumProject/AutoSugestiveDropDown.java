package firstSeleniumProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		System.out.println(options);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}
	}

}
