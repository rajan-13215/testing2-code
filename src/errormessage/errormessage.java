package errormessage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errormessage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='close']//span//img")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@class='login links pull-right']//a//span//*[local-name()='svg']")).click();
		driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("ydytyrter");
		driver.findElement(By.xpath("//button[@title='Login']")).click();
		String error_message = driver.findElement(By.xpath("//div[@class='tab-pane active']//div//ul[@class='messages']//li[@class='error-msg']//ul//li")).getText();
		System.out.println(error_message);
		
		if (error_message.equals("Please provide a valid Email or Phone No.")) {
			
			System.out.println("recived correct message");
			
		} else {
			
			System.out.println("opps! do the needful");

		}

	}

}
