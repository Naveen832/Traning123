package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMutlipleCheckBoxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver= new EdgeDriver();
		 //String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/check-box/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver.get("https://www.sparkstone.co.nz/sampleapp/101/app.php");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[@id='enterinsurantdata']")).click();
       List<WebElement> list = driver.findElements(By.xpath("(//p[@class='group'])[3]/label"));
       for (WebElement l : list) {
    	   if(!(l.isSelected())) {
    		   l.click();
    	   }
		
	}
       
	}

}
