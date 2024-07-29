package Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new EdgeDriver();
		// String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//	System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
       WebDriverManager.chromedriver().setup();
       driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
       driver.manage().window().maximize();
       WebElement d1=driver.findElement(By.xpath("//span[text()='Draggable 1']")); //drag - 1
       WebElement d2=driver.findElement(By.xpath("//span[text()='Draggable 2']")); //drag - 2
       WebElement DES = driver.findElement(By.id("mydropzone"));
       Actions act = new Actions(driver);
       act.dragAndDrop(d2, DES).perform();
       act.dragAndDrop(d1, DES).perform();
       
       
       //demo-2
      WebElement source = driver.findElement(By.id("draggable"));
		WebElement Destination = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, 150, 50).build().perform();
       
       //implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//explicit
		WebElement ele = driver.findElement(By.id("singleClick"));
		System.out.println(ele.getText());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));//explicit wait
				wait.until(ExpectedConditions.elementToBeClickable(ele));
       
	}

}
