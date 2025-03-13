package miscelleanousprojects;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class MultipleBrokenLinks {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links= driver.findElements(By.xpath("//table/tbody/tr/td/ul/li/a"));
		SoftAssert a=new SoftAssert();
		for(WebElement link:links) {
			
			String url=link.getDomAttribute("href");
			System.out.println(url);
			URI uri= new URI(url);
			HttpURLConnection conn=(HttpURLConnection) uri.toURL().openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int responsecode=conn.getResponseCode();
			System.out.println(responsecode);
			a.assertEquals(responsecode>=400, true, "The link with Text "+link.getText()+" is broken with code" +responsecode);
			
		}
       a.assertAll();
	}

}
