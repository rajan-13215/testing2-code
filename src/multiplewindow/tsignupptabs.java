package multiplewindow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsignupptabs {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://faridagupta.com/");
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.id("not-logged-in-icon")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9911000098");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("automationback@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//input[@id='register-btn']")).click();
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav megamenu']//span[@class='menu-title'][contains(text(),'Fg Steals')]")).click();
		
		String firsttab = driver.getWindowHandle();
		System.out.println("id of tab is "+firsttab);
		
		driver.findElement(By.xpath("//a[contains(text(),'Gulzar Dilnaz Straight Farsi')]")).click();
		
		Set<String> secondtab= driver.getWindowHandles();
		
		int number = secondtab.size();
		System.out.println(number);
		
		for (String childtab : secondtab) {
			
			if (!firsttab.equalsIgnoreCase(childtab)) {
				
				driver.switchTo().window(childtab);
				driver.findElement(By.xpath("//label[contains(text(),'XS')]")).click();
				driver.findElement(By.xpath("//span[@class='add-up add-action fa fa-plus pull-right']")).click();
				driver.findElement(By.xpath("//div[@class='add-cart 9']//button[@class='btn button btn-cart']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Go to Cart')]")).click();
				driver.findElement(By.xpath("//div[@class='totals col-xs-12 col-lg-12 col-md-12 col-sm-12']//button[@class='button btn-proceed-checkout btn-checkout']")).click();
				
			}
			driver.switchTo().window(firsttab);
			driver.findElement(By.xpath("//a[@class='logo']//img")).click();
			
		}
		

	}

}
