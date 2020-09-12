package acendingorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ace {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement values = driver.findElement(By.xpath("//select[2]"));
		Select  sell1 = new Select(values);
		
		List<WebElement> allvalues = sell1.getOptions();
		System.out.println(allvalues);
		
		ArrayList newlist = new ArrayList<>();
		
		for (WebElement textvalue : allvalues) {
			
			System.out.println(textvalue.getText());
			newlist.add(textvalue);
			
		}
		
		ArrayList temlist = new ArrayList<>();
		temlist.addAll(newlist);
		
		Collections.sort(temlist,Collections.reverseOrder());
		

	}

}
