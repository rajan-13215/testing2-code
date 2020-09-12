package handellingdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement values = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sell1= new Select(values);
		
		WebElement firstvalue =  sell1.getFirstSelectedOption();
		System.out.println(firstvalue.getText());
		
		sell1.selectByVisibleText("Aug");
		
		WebElement secondtvalue = sell1.getFirstSelectedOption();
		System.out.println(secondtvalue);
		System.out.println(secondtvalue.getText());
		
		List<WebElement> list =  sell1.getOptions();
		
		for (WebElement hello : list) {
			
			System.out.println(hello.getText());
			
		}
		
		
		
		
//		Select sell1 = new Select(driver.findElement(By.xpath("//select[2]")));
//		sell1.selectByIndex(2);

		
		
	}

}
