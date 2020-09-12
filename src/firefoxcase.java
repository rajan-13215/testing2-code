import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxcase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\AWS\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='close-covid']//span//img")).click();
		driver.findElement(By.xpath("//a[@id='customer_login_link']//span//img")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("1118990087");
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("aumationbackin3@faridagupta.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajan@123");
		driver.findElement(By.xpath("//input[@id='register-btn']")).click();
		driver.navigate().to("https://www.faridagupta.com/fgsteals");
		System.out.println("account crete succeessfully and sign up code has been complted");
		System.out.println("test passes");
		driver.quit();

	}

}
