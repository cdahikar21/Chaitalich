package SelectoHubSite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TextFields {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//*[@title=\"Email\"]")).sendKeys("chitradhk@gmail.com");
		
		driver.findElement(By.xpath("//*[@title=\"Password\"]")).sendKeys("password123@");
		
		Thread.sleep(500);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		WebElement compony = driver.findElement(By.xpath("(//*[@class=\"form-control\"])[1]"));
		js.executeScript("arguments[0].value='TCS';", compony);
		
		driver.findElement(By.xpath("(//*[@name=\"mobile number\"])[1]")).sendKeys("8793417688");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@value=\"Submit\"]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@iconid=\"editon\"]")).click();
		
		WebElement FName = driver.findElement(By.xpath("//*[@placeholder=\"First Enter name\"]"));
		js.executeScript("arguments[0].value='Chaitali';", FName);
		Thread.sleep(2000);
		
		WebElement LName = driver.findElement(By.xpath("//*[@placeholder=\"Enter Last name\"]"));
		
		js.executeScript("arguments[0].value='Dahikar';", LName);
		
		Thread.sleep(2000);
		
		WebElement CheckHerButtn = driver.findElement(By.xpath("//*[text()='Checkout here']"));
		Actions a = new Actions(driver);
	    a.moveToElement(CheckHerButtn).perform();
	    
	    WebElement CarDropdown = driver.findElement(By.xpath("//*[@name=\"cars\"]"));
	    Select s = new Select(CarDropdown);
	    s.selectByVisibleText("Audi");
	    
	    Thread.sleep(2000);
	    
	    WebElement CrushTextBox = driver.findElement(By.xpath("//*[@title=\"Enter your first crush name\"]"));
        js.executeScript("window.scrollBy(0,750)", "");
        
        //User Table
       List<WebElement> UserTable = driver.findElements(By.xpath("//*[@name='chkSelectRow[]']"));
       
       for(WebElement UT : UserTable)
       {
    	   UT.click();
       }
       
       js.executeScript("window.scrollBy(0,1000)", "");
       
        WebElement Quant = driver.findElement(By.xpath("//*[@name=\"tablepress-1_length\"]"));
         Select sb = new Select(Quant);
         sb.selectByVisibleText("50");
         
         driver.findElement(By.xpath("(//*[@type=\"search\"])[2]")).sendKeys("India");
         
//         js.executeScript("window.scrollBy(0,1200)", "");
         
          List<WebElement> windowi = driver.findElements(By.xpath("//*[@id=\"tablepress-1\"]/descendant::input[@type='checkbox']"));
		   
          for(WebElement window : windowi)
          {
        	  Thread.sleep(500);
        	  js.executeScript("arguments[0].click", window);
          }
	}

}
