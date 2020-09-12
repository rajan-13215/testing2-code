package pagetitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagetitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.faridagupta.com/");
		driver.manage().window().maximize();
		
		String pagesource = driver.getPageSource();
		System.out.println("page title is "+pagesource);
		
		if (pagesource.contains("rajan")) {
			
			System.out.println("");
			
		} else {
			
			System.out.println("test failed");

		}

	}

}
