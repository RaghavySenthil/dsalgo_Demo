package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class ScreenShot extends BaseTest {
	
	public static void takesScreenshot(String fileName) throws IOException {
		//1.Take Screenshot and store it as file format:
		File Screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2.Now copy the screenshot and time stamp(java.sql) to a desired file location using copy file method:
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		String dir= System.getProperty("user.dir");
		FileUtils.copyFile(Screenshotfile,new File(dir+"/src/test/resources/dsalgo_Screenshots/"+fileName+"_"+timestamp+".jpg"));
		
	}	

}
