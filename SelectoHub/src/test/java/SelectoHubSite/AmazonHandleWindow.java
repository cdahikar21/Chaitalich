package SelectoHubSite;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHandleWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("w");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[text()='ashing machine']")).click();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[@class=\"s-image\"])[2]")).click();
		
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator it = handle.iterator();
		
		String  parentId = (String) it.next();
		
		String  childId = (String) it.next();
		
		driver.switchTo().window(childId);
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
		
		
		
		WebElement cancel = driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]"));
		
		j.executeScript("arguments[0].click();", cancel);
		
		
		
	}

}
