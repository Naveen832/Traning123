package PracticeAutomation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiffBrowersa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String browser =sc.nextLine();
		WebDriver driver = null;
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "/.user.dir");
			driver = new ChromeDriver();
		}
		else
		if(browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.edge.driver", "/.user.dir");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("invalid browser");
			
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
