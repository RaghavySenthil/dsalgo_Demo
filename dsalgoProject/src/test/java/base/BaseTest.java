package base;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest {
	
	public static WebDriver driver ;
	public static Properties prop =new Properties();
	public static FileReader fr;
	
	
	
	public void setup() throws IOException {
		try {
			
		FileReader fr=new FileReader("C:\\Users\\senth\\git\\dsalgo_Demo\\dsalgoProject\\src\\test\\resources\\Configfiles\\config.properties");
           prop.load(fr);
         
	
		
        if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
        	 driver = new ChromeDriver();//base
        	driver.get(prop.getProperty("testurl"));//properties
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
        	driver =new FirefoxDriver();//base
        	 driver.get(prop.getProperty("testurl"));//properties
        }
		}
		catch(NullPointerException nullPointer) {
			System.out.println(nullPointer.getCause());
			System.out.println(nullPointer.getMessage());
			nullPointer.printStackTrace();
		}
		
		
}
	/*
	 public void tearDown() {
		 driver.close();
		 System.out.println("tearDown is successfull");
		 
	 }*/
	 
	 }
