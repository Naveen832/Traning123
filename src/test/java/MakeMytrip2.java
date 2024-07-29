import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class MakeMytrip2 {
	public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
		


		        // Set the path to the chromedriver executable
		        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();

		        try {
		            // Navigate to MakeMyTrip trains page
		            driver.get("https://www.makemytrip.com/railways/");

		            
		         // Select the "Trains" tab (you may need to adjust this based on the current UI)
		            driver.findElement(By.xpath("//li[@class='menu_Trains']")).click();
		            // Find the from station input and enter the value
		            driver.manage().window().maximize();
		            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		            
		            WebElement fromStationInput = driver.findElement(By.xpath("//span[text()='From']"));
		            ////input[@id='fromCity']
		            fromStationInput.click();
		            driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("New Delhi");

		            // Find the to station input and enter the value
		            WebElement toStationInput = driver.findElement(By.id("toCity"));
		            toStationInput.click();
		            driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("hyderabad");
		            
		            driver.findElement(By.xpath("//span[normalize-space()='Hyderabad - All Stations']")).click();

		            // Find the search button and click it
		            WebElement searchButton = driver.findElement(By.xpath("//a[normalize-space()='Search']"));
		            searchButton.click();

		            // Wait for the results to load
		            Thread.sleep(5000); // Consider using WebDriverWait for a more robust solution

		            List<WebElement> trainElements = driver.findElements(By.xpath("//div[@class='train-name']"));
		            // Print out the train information
		            for (WebElement train : trainElements) {
		                System.out.println(train.getText());
		            }
		            // Find all train elements
//		            List<WebElement> trains = driver.findElements(By.cssSelector(".train-info"));
//
//		            // Print train details
//		            for (WebElement train : trains) {
//		                String trainName = train.findElement(By.cssSelector(".train-name")).getText();
//		                String departureTime = train.findElement(By.cssSelector(".departure-time")).getText();
//		                String arrivalTime = train.findElement(By.cssSelector(".arrival-time")).getText();
//		                String duration = train.findElement(By.cssSelector(".duration")).getText();
//		                String price = train.findElement(By.cssSelector(".price")).getText();
//
//		                System.out.println("Train: " + trainName);
//		                System.out.println("Departure: " + departureTime);
//		                System.out.println("Arrival: " + arrivalTime);
//		                System.out.println("Duration: " + duration);
//		                System.out.println("Price: " + price);
//		                System.out.println("---------------------------");
//		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
		}
