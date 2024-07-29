package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new EdgeDriver();
		// String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver.get("https://soliterata.com/testing-tool-wep-page/elements/buttons/");
       driver.findElement(By.linkText("Accept")).click();
       
       driver.manage().window().maximize();
       
       JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(3000);
		WebElement Ele = driver.findElement(By.xpath("//button[@text()='Click me']"));
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Ele));
		Ele.click();
		
	
		
		//DoubleClick
		WebElement elment1 = driver.findElement(By.xpath("//button[text()='Double-click me']"));
		//WebElement element =  driver.findElement(By.xpath("//button[@ondblclick='myFunction2()']"));
		
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		ac.doubleClick(elment1).perform();
		
		String s =driver.findElement(By.partialLinkText("Welcome to soliteraTA tool d")).getText();
		System.out.println(s);
		
		//rightclick
		WebElement rightclik = driver.findElement(By.xpath("//button[contains(text(),'Right-Click Me')]"));
	     ac.contextClick(rightclik).perform();
	       driver.switchTo().alert().accept();
       
      
	}

}
