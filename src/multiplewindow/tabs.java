package multiplewindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabs {

	public static void main(String[] args) throws Exception {
		
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
		
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav megamenu')]//span[contains(@class,'menu-title')][contains(text(),'New Arrivals')]")).click();
		
		String maintab = driver.getWindowHandle();
		System.out.println("main widnow name or id is "+maintab);
		
		driver.findElement(By.xpath("//a[contains(text(),'Nusrat Jahan Sahira Lace Kurta')]")).click();
		
		Set<String> childtab =  driver.getWindowHandles();
		
		int totaltab = childtab.size();
		System.out.println(totaltab);
		
		for (String childtab1 : childtab) {
			
			if (!maintab.equalsIgnoreCase(childtab1)) {
				
				driver.switchTo().window(childtab1);
				driver.findElement(By.xpath("//label[contains(text(),'XS')]")).click();
				driver.findElement(By.xpath("//div[@class='add-cart 2']//button[@class='btn button btn-cart']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
				driver.findElement(By.xpath("//div[@class='totals col-xs-12 col-lg-12 col-md-12 col-sm-12']//button[@class='button btn-proceed-checkout btn-checkout']")).click();
				driver.findElement(By.xpath("//div[4]//label[1]")).click();
				driver.findElement(By.xpath("//input[@id='fb_p_method_cashondelivery']")).click();
				driver.findElement(By.xpath("//button[@id='payment_id']")).click();
				driver.findElement(By.xpath("//button[@id='place_order']")).click();
				Thread.sleep(9000);
				
			}
			
			driver.switchTo().window(maintab);
			driver.findElement(By.xpath("//a[@class='logo']//img"));
			
		}
		

	}

}
