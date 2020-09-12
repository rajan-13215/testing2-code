package acendingorder;

import java.util.ArrayList;import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dec {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement hello = driver.findElement(By.xpath("//select[3]"));
		
		Select sell = new Select(hello);
		List<WebElement> allvalues = sell.getOptions();
		
		ArrayList actuallist = new ArrayList<>();
		
		for (WebElement data : allvalues) {
			
			System.out.println(data);
			actuallist.add(data);
		}
		
		
		ArrayList templist = new ArrayList<>();
		templist.addAll(actuallist);
		
		Collections.sort(templist);
		Collections.sort(templist,Collections.reverseOrder());

	}

}
