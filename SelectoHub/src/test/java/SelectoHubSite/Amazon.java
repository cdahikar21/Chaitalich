package SelectoHubSite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		
		driver.findElement(By.xpath("(//*[text()='Best Sellers'])[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@alt=\"Boldfit Shoe Bag for Travel & Storage Travel Organizer for Women & Men Travel Accessories Shoe Organizer Shoe Bags Pouches Tr\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		driver.findElement(By.xpath("//*[@data-csa-c-content-id=\"sw-gtc_CONTENT\"]")).click();
		
		WebElement qnt = driver.findElement(By.xpath("//*[@data-csa-interaction-events=\"click\"]"));
		 
		qnt.click();
		
		driver.findElement(By.xpath("//*[text()=3]")).click();
		
		
		
	}
		
		
		
		
		
		
		
		
	

}
