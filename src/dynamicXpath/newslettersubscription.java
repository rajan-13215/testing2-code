package dynamicXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newslettersubscription {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.xpath("//div[@class='block_content']//a[contains(text(),'Newsletter')]")).click();
		driver.findElement(By.xpath("//input[@id='customerName']")).sendKeys("Rajan Kumar");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9045002529");
		driver.findElement(By.xpath("//input[@class='form-control'][@id='newsletterEmail']")).sendKeys("rajan1@faridagupta.com");
		driver.findElement(By.xpath("//button[@id='news_sub']")).click();
		
		if (driver.findElement(By.xpath("//span[contains(text(),\"You're registered with us already. Keep an eye out for the updates!\")]")).isDisplayed()) 
          {
        	  
        	  System.out.println("test passed");
			
		} else {
			
			System.out.println("test failed");

		}
	}

}
