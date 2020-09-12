package clothing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FGclothing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://faridagupta.com/");
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		driver.findElement(By.name("login[username]")).sendKeys("rajan@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//button[@id='send2']")).click();
		
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//span[contains(@class,'menu-title')][contains(text(),'Clothing')]")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//li[contains(@class,'active')]//div[contains(@class,'level1')]//div[contains(@class,'dropdown-menu-inner')]//div[contains(@class,'row')]//div[contains(@class,'col-sm-12 mega-col')]//div[contains(@class,'mega-col-inner')]//ul//span[contains(@class,'menu-title')][contains(text(),'Kurtas')]")).click();
		

	}

}
