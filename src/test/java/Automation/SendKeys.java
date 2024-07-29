package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		// String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver.get("https://www.google.com/");
       driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Naveen");

	}

}
