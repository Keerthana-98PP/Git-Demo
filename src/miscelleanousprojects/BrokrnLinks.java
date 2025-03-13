package miscelleanousprojects;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokrnLinks {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
       String url= driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
       URI uri=new URI(url);
        HttpURLConnection conn=(HttpURLConnection) uri.toURL().openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
        
        int responseCode =conn.getResponseCode();
        System.out.println(responseCode);
       
	}

}
 