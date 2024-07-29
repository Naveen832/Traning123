package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new EdgeDriver();
		// String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.manage().window().maximize();
      
       
       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
       Alert a = driver.switchTo().alert();
       a.accept();
       WebElement s = driver.findElement(By.xpath("//p[@id='result']"));
       String x = s.getText();
       System.out.println(x);
       
       driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
       Alert a1 = driver.switchTo().alert();
       a1.accept();
	}

}
