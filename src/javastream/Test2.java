package javastream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void table() {
		// To check if table content become in sorted order on clicking veg/fruit name
		// column header
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> orginalList = list.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> sortedList = orginalList.stream().sorted().collect(Collectors.toList());

		Assert.assertEquals(orginalList, sortedList);

	}

	@Test

	public void findPrice() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> price = list.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPriceOfVeg(s))
				.collect(Collectors.toList());
		price.forEach(p -> System.out.println(p));

	}

	private static String getPriceOfVeg(WebElement s) {

		String p = s.findElement(By.xpath("following-sibling::td[1]")).getText();

		return p;
	}

	@Test
	public void pagination() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<String> price1;
		do {
			List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));

			price1 = list.stream().filter(s -> s.getText().contains("Beans")).map(s -> getPriceOfVeg(s))
					.collect(Collectors.toList());
			price1.forEach(p -> System.out.println(p));

			if (price1.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price1.size() < 1);
	}
@Test
public void filter() {
	WebDriver driver = new ChromeDriver();

	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	driver.findElement(By.id("search-field")).sendKeys("Rice");
	List <WebElement> searchlist= driver.findElements(By.xpath("//tr/td[1]"));
	List<WebElement> filtered=searchlist.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	
	Assert.assertEquals(searchlist.size(), filtered.size());
}
}
