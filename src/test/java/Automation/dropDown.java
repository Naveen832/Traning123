package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver= new ChromeDriver();
		// String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
       Select sc = new Select(driver.findElement(By.xpath("//div[@class='single_tab_div']/p/select")));
//       sc.selectByIndex(1);
//       sc.selectByValue("AFG");
//       sc.selectByVisibleText("Albania");
       
       List<WebElement> options = sc.getOptions();
       System.out.println("size is: "+options.size());
       for (WebElement w : options) {
    	   System.out.println(w.getText());
    	   
    	   if(w.getText().equals("India")) {
    		  w.click();
    	   }
		
	}
       
       
	}

}
