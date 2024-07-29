package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
static WebDriver driver;
	
	public static void takecreenshot(String fileName) throws IOException {
		//create a file with takescreenshot interface and get the screenshot as File
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//we use copyfile method to store the file in the given path
	FileUtils.copyFile(file, new File("C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\SCREENSHOTS\\" +fileName+".jpg"));
	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		driver = new ChromeDriver();
		// String actURL  ="https://soliterata.com/testing-tool-wep-page/elements/buttons/";
		//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe");
	//System.setProperty("WebDriver.edge.driver", "C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\msedgedriver.exe");
    //  WebDriverManager.chromedriver().setup();
       driver.get("https://stock.adobe.com/in/search?k=monkey&asset_id=1974128");
       driver.manage().window().maximize();
       takecreenshot("Image");
       
       
		
		
		
	}

}

