package PracticeAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName1 = "today1";
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://stock.adobe.com/in/search?k=monkey&asset_id=1974128");
		 EventFiringWebDriver e=new EventFiringWebDriver(driver);
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File srcfile=e.getScreenshotAs(OutputType.FILE);
		 File destfile=new File("C:\\Users\\NVISWANA\\eclipse-workspace1\\Trainig\\SCREENSHOTS\\" + fileName1 + ".jpg");
		 FileUtils.copyFile(srcfile,destfile);
	}
}


