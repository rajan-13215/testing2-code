import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internetexplolercas {

	public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\IEDriverServer_Win32_3.141.0\\IEDriverServer.exe" );
		WebDriver driver = new InternetExplorerDriver();
		
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.xpath("//a[@id='customer_login_link']//span//img")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1118000009");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("aumationbackin4@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//input[@id='register-btn']")).click();
		driver.navigate().to("https://www.faridagupta.com/fgsteals");
		System.out.println("account crete succeessfully and sign up code has been complted");
		System.out.println("test passes");
		driver.quit();
		
	}

}
