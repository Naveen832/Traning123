package PracticeAutomation;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "./user.dir");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Dimension d= new Dimension(10000,500);
		driver.manage().window().setSize(d);
		Point p = new Point(200,200);
		driver.manage().window().setPosition(p);
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed(String name);
    	driver.close();
	}

}
