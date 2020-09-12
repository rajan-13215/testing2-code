package againexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vsat.vedantu.com/register");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//select[@class='form-control ng-pristine ng-invalid ng-touched']"));
		System.out.println(list);
		list.size();
		
		for (WebElement hello : list) {
			
			System.out.println(hello);
			String ID = hello.getAttribute("id");
			System.out.println(ID);
			
			
			
		}
		
		
		

	}

}
