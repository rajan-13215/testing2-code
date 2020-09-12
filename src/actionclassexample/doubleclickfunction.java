package actionclassexample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclickfunction {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOFTWARE QA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://api.jquery.com/contextmenu/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		driver.findElement(By.xpath("//label[contains(text(),'XXL')]")).sendKeys(Keys.ENTER);
		
		Actions act = new Actions(driver);
//		act.doubleClick(driver.findElement(By.xpath("//html//body//div"))).perform();
		Thread.sleep(3000);
		act.contextClick(driver.findElement(By.cssSelector("body:nth-child(2) > div.contextmenu:nth-child(1)"))).perform();
		Thread.sleep(3000);
		

	}

}
