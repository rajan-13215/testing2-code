package samelocatorsexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samename {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//select[@class='_9407 _5dba _8esg']"));
		System.out.println(list);
		
		for (WebElement newlist : list) {
			
			System.out.println(newlist);
			String ID = newlist.getAttribute("id");
			System.out.println(ID);
			
			if (ID.equalsIgnoreCase("Month")) {
				
				newlist.click();
				break;
			}
			
		}
		
		
		
		
		
	}

}
