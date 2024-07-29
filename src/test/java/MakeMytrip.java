import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip {

	
	public static void main(String[] args) throws InterruptedException  {
	
	WebDriver driver = new ChromeDriver();

//    try {
        // Open MakeMyTrip website
        driver.get("https://www.makemytrip.com/");
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

        // Select the "Trains" tab (you may need to adjust this based on the current UI)
        driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains inactive']")).click();
      //span[@class='chNavIcon appendBottom2 chSprite chTrains']

        // Wait for the trains tab to load (consider using explicit waits)
         // Use WebDriverWait for better handling
        driver.manage().window().maximize();
        // Enter "Hyderabad" as the source
        Thread.sleep(3000);
       //WebElement source1 = driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
       // WebElement source1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        
            // Find the element using the locator
        WebElement source1 = driver.findElement(By.xpath("//span[text()='From']"));    
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //div[@class='autoSuggestPlugin hsw_autocomplePopup']/div/input
        source1.click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");
        
       // driver.findElement(By.xpath("//div[@class='makeFlex column flexOne'])[1]")).click();
    
    
        //div[@class='makeFlex column flexOne'])[1]

        // Enter "Vijayawada" as the destination
        WebElement destination = driver.findElement(By.id("toCity"));
        destination.click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Vijayawada");
        
        
        driver.findElement(By.xpath("//span[contains(text(),'Vijayawada')]")).click();

        // Click the "Search" button
        driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();

        // Wait for search results to load
        Thread.sleep(5000); // Use WebDriverWait for better handling

        // Find all train elements using XPath
       // List<WebElement> trainElements = driver.findElements(By.xpath("//div[@class='train-list']"));
      //div[@class='train-name']
        List<WebElement> trainElements = driver.findElements(By.xpath("//div[@class='train-name']"));
        // Print out the train information
        for (WebElement train : trainElements) {
            System.out.println(train.getText());
        }
    
        driver.quit();
    }
	}

    


