package capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class childclass {

	public static void takingscreenshot(WebDriver driver, String pathname) throws Exception {
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Source, new File("D:\\selenium_screenshot"+pathname));
		
		

	}

}
