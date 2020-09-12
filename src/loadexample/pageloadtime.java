package loadexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageloadtime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.faridagupta.com/");
	
		
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//span[contains(@class,'menu-title')][contains(text(),'New Arrivals')]")).click();
//		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//span[contains(@class,'menu-title')][contains(text(),'BLOG')]")).click();
		
	}

}
