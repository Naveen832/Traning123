package HYR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestApplicationProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://www.seleniumhq.org");
		
		//URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL - "+currentUrl);
		
		//Title
		String title = driver.getTitle();
		System.out.println("Title - "+title);
		
		//HTML Page Source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.quit();
	
	}

}
