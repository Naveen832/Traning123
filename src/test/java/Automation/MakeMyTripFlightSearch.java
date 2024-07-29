 package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripFlightSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();
	      //  System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to MakeMyTrip website
	        driver.get("https://www.makemytrip.com/");
	        driver.manage().window().maximize();

	        // Click on the flights tab
	        WebElement flightsTab = driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[1]"));
	        flightsTab.click();
	        System.out.println("successfully clicked fligjts tab");

	        // Enter source city
	        WebElement sourceCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
	        sourceCity.sendKeys("hyderabad");

	        // Select the first suggestion from the autocomplete dropdown
	        WebElement firstSuggestion = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
	        firstSuggestion.click();

	        // Enter destination city
	        WebElement destinationCity = driver.findElement(By.id("toCity"));
	        destinationCity.sendKeys("bangalore");

	        // Select the first suggestion from the autocomplete dropdown
	        WebElement firstDestinationSuggestion = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
	        firstDestinationSuggestion.click();

	        // Click on the search button
	        WebElement searchButton = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBlack widgetSearchBtn ']"));
	        searchButton.click();

	        // Wait for search results to load
	        try {
	            Thread.sleep(5000); // Adjust the wait time as needed
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Get all flight elements
	        List<WebElement> flights = driver.findElements(By.xpath("//div[@class='splitVw-footer-right ']"));

	        // Initialize variables for lowest price and corresponding flight name
	        int lowestPrice = Integer.MAX_VALUE;
	        String lowestPriceFlight = "";

	        // Loop through each flight to get the name and price
	        for (WebElement flight : flights) {
	            // Get flight name
	            String flightName = flight.findElement(By.xpath("./div/div/div/div[2]/div/div/div/div/span")).getText();
	            // Get flight price
	            String priceText = flight.findElement(By.xpath("./div/div/div/div[3]/p")).getText();
	            // Extract price value (assuming it's in the format "Rs. XXXX")
	            int price = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
	            // Check if this is the lowest price so far
	            if (price < lowestPrice) {
	                lowestPrice = price;
	                lowestPriceFlight = flightName;
	            }
	        }

	        // Print the lowest price and corresponding flight name
	        System.out.println("Lowest Price: Rs. " + lowestPrice);
	        System.out.println("Flight Name: " + lowestPriceFlight);

	        // Close the browser
	        driver.quit();
	}

}
