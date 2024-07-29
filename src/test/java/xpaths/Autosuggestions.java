package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try {
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement em = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		em.sendKeys("Coferge sala");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','Coferge sala')", em);

		
		//WebDriverWait wait = (WebDriverWait)driver;
		
		
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		System.out.println(list.size());
		
		for(WebElement list1: list) {
			System.out.println(list1.getText());
			
			if(list1.equals("coferge salary")) {
				list1.click();
				Thread.sleep(4000);
			}
			
//	Thread.sleep(4000);
		}
	}
	finally {
		driver.quit();
	}

	}
}
