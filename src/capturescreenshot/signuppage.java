package capturescreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class signuppage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.faridagupta.com/");
		childclass.takingscreenshot(driver, "shot4");
		
		driver.findElement(By.xpath("//button[@class='close']//span//img")).click();
		childclass.takingscreenshot(driver, "shot5");
		
		driver.findElement(By.xpath("//div[@class='login links pull-right']//a//span//*[local-name()='svg']")).click();
		childclass.takingscreenshot(driver, "shot6");
		
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		childclass.takingscreenshot(driver, "shot7");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7700771011");
		TakesScreenshot shot3 =(TakesScreenshot)driver;
		File Source3 = shot3.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Source3, new File("D:\\selenium_screenshot\\shot8"));
		
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("dhjhjfddnnd6464jdf@qwwqwqwq.com");
		TakesScreenshot shot2 =(TakesScreenshot)driver;
		File source2 =shot2.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source2, new File("D:\\selenium_screenshot\\shot9"));
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Rajan@123");
		TakesScreenshot shot1 = (TakesScreenshot)driver;
		File source1 =shot1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source1, new File("D:\\selenium_screenshot\\shot10")); 
		
		driver.findElement(By.xpath("//input[@id='register-btn']")).click();
		TakesScreenshot shot =(TakesScreenshot)driver;
		File source  = shot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("D:\\selenium_screenshot\\shot11"));
		
		Thread.sleep(5000);
		driver.quit();

	}

}
