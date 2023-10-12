package SelectoHubSite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.page.Page.GetAppIdResponse;

public class AmazonWseries {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();;
		
		List<WebElement> hamburger = driver.findElements(By.xpath("//*[@class=\"hmenu hmenu-visible\"]"));
		
		
		
		System.out.println(hamburger.size());
		
		for(WebElement hm : hamburger)
		{
			System.out.println(hm.getText());
			
			
		}
		
		driver.findElement(By.xpath("//*[@class=\"nav-sprite hmenu-close-icon\"]")).click();
		
		System.out.println();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("wash");
		
		List<WebElement> wSeries = driver.findElements(By.xpath("//*[@class=\"left-pane-results-container\"]"));
		
		for(WebElement wb : wSeries)
		{
			String Text = wb.getText();
			System.out.println(Text);
		}
		
	}

}
