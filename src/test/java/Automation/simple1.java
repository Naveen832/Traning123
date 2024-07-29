package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new EdgeDriver();
		 String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/check-box/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver.get("https://soliterata.com/testing-tool-wep-page/elements/check-box/");
        
        driver.manage().window().maximize();
       
      driver.manage().deleteAllCookies();
        String extURL =  driver.getCurrentUrl();
        
        Assert.assertEquals(actURL, extURL);
        System.out.println("Validation successfull");
      // driver.findElement(By.xpath("//span[@class='elementor-button-content-wrapper']")).click();
       driver.findElement(By.linkText("Accept")).click();
      WebElement ele =  driver.findElement(By.xpath("//input[@id='myCheck']"));
      ele.click();
      if(ele.isSelected()) {
    	  System.out.println("Check box is selected");
      }else {
    	  System.out.println("Check box is not selected");
      }
     // WebElement ele1 = driver.findElement(By.xpath("//button[normalize-space()='Try it']"));
      WebElement ele1 = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
      ele1.click();
      String s = driver.findElement(By.xpath("//p[@id='demo']")).getText();
      System.out.println(s);
      
       
       
        
	}

}
