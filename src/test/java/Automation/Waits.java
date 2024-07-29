package Automation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Implicit Wait
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://somedomain/url_that_delays_loading");
		WebElement myDynamicElement = driver.findElement(By.id("myDynamicElement"));
		//pageLoadTimeout
		//As the name suggests, pageLoadTimeout command waits for the page to load completely for a specified number of seconds. The default value is 0 and a negative value means infinite wait.
	 driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		//setScriptTimeour
		//The setScriptTimeout command waits for the asydnchronous parts of the web page to finish loading for a specified number of seconds.
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(20));
	}

}
