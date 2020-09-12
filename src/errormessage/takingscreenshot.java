package errormessage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takingscreenshot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.faridagupta.com/");
		liberiaryclass.screenshot(driver, "hello11");
		
		
		driver.findElement(By.xpath("//button[@class='close']//span//img")).click();
		liberiaryclass.screenshot(driver, "hello12");
		
		
		driver.findElement(By.xpath("//div[@class='login links pull-right']//a//span//*[local-name()='svg']")).click();
		TakesScreenshot ts2 = (TakesScreenshot)driver;
		File sourse2 = ts2.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(sourse2, new File("E:\\java_screenshots\\hell03"));
	    
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("rajan@faridagupta.com");
		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File sourse3 = ts3.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(sourse3, new File("E:\\java_screenshots\\hell04"));
	    
		driver.findElement(By.xpath("//input[@name='login[password]']")).sendKeys("Rajan@123");
		TakesScreenshot ts4 = (TakesScreenshot)driver;
		File sourse4 = ts4.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(sourse4, new File("E:\\java_screenshots\\hell05"));
		
		
		

	}

}
