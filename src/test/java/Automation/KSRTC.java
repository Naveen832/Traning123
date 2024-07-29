package Automation;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("WebDriver.Edge.driver", "C:\\Users\\BEMANASA\\eclipse-workspace\\TollGE\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		//Clicking on Signin
		driver.findElement(By.xpath("(//div[@class='header-top-menu']//div)[4]/ul[1]/li[1]/a")).click();
		//Username
		driver.findElement(By.id("userName")).sendKeys("bethi.manasa@capgemini.com");
		//password
		driver.findElement(By.id("password")).sendKeys("manasa@1159");
		//Checkbox
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('TermsConditions').click();");
		//Login
		driver.findElement(By.id("submitBtn")).click();
		//clicking mitra
		driver.findElement(By.xpath("//div[@class='main-frs']/ul/li[2]/a/p")).click();
		String parent_Win = driver.getWindowHandle();            

		Iterator<String> i = s.iterator<String>();
		while(i.hasNext()) {
			String Child_Win = i.next();
			if(!(parent_Win.equals(Child_Win))) {
				driver.switchTo().window(Child_Win);
			}
		}
		driver.findElement(By.xpath("(//div[@class='container']//div)[2]/a")).click();
		//clicking Image Gallery
		driver.findElement(By.xpath("//a[@title='Image Gallery']/span")).click();
		Thread.sleep(20000);
		driver.quit();

	}

}
