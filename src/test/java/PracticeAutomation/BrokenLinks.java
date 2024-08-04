package PracticeAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			
			//by using  href attribtes we can get urlof requeired link
			WebElement ele = list.get(i);
			String url = ele.getAttribute("href");
			URL u = new URL(url);
			//creating using url object
			HttpURLConnection hp = (HttpURLConnection)u.openConnection();
			
			Thread.sleep(2000);
			
			hp.connect();
			 int rescode = hp.getResponseCode();
			 if(rescode>=400) {
				 System.out.println(url + " "+" is broken link");
			 }else {
				 System.out.println(url + " "+" is not broken or vliad link");
			 }
			
			
			
			
			}
		driver.close();
	}
	

}
