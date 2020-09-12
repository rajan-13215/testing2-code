package errormessage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class liberiaryclass {

	public static void screenshot(WebDriver driver, String filename) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourse = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sourse, new File("E:\\java_screenshots\\"+filename));
		
		
		
	}
		
}	
		
		

