package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.SeleniumCdpConnection;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  =  new ChromeDriver();
		String url = "https://www.makemytrip.com/";
		
		driver.get(url);
		
		boolean logo=driver.findElement(By.xpath("//img[@alt='Make My Trip']")).isDisplayed();
		System.out.println(logo);
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//p[@class='widgetTitle flexOne']"));
		String s=e.getAttribute("class");
		System.out.println(s);
		driver.close();
		
	}

}
