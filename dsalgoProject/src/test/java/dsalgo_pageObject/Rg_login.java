package dsalgo_pageObject;

import java.io.File;
import java.io.IOException;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utils.Utils_Excel;
import base.BaseTest;



/*1. Automate Get Started Page,Registration,Login,Signout
2. Pick few data structure  topics like stacks,arrays  etc to automate. Use simple Python code in the text editor box
Implement Data Driven for Login functionality as well as  for textbox editor
Implement Page object Model
Implement Cross browser Testing
Generate Testng reports & Allure reports.
Push your code to github and share the teams github link  
Run jobs in Jenkins through Github repository
Write granular test cases in Gherkin format 
Try to implement in Cucumber BDD using POM.
Timeline : 3-4 weeks */


public class Rg_login extends BaseTest {
	
	private static Logger logger =LogManager.getLogger(Rg_login.class);
	int i=1;
	
	By getstart =By.xpath("//a/button[contains(text(),'Get Started')]");
    By register = By.xpath("//a[contains(text(),' Register ')]");
    By username = By.xpath("//input[@type='text'and@name='username']");
    By Password1 = By.xpath("//input[@type='password'and@name='password1']");
    By Password2 = By.xpath("//input[@type='password'and@name='password2']");
    By SubmitReg = By.xpath("//input[@type='submit'and@value='Register']");
    By Signin =By.xpath("//a[contains(text(),'Sign in')]");
    By signout =By.xpath("//a[contains(text(),'Sign out')]");
    By loginuser=By.xpath("//input[@type='text'and@name='username']");
    By loginpassword=By.xpath("//input[@type='password'and@name='password']");
    By login =By.xpath("//input[@type='submit'and@value='Login']");
    By selectdrop =By.xpath("//div[@class='nav-item dropdown']");
    By dropdownele =By.xpath("//div[@class='dropdown-menu show']/a["+i+"]");
    By Errormsg = By.xpath("//div[@class='alert alert-primary']");
    By DSgetstarted = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]/div/div/a");
    
    
    public void getstarted() throws InterruptedException, IOException {
    	driver.findElement(getstart).click();
    	driver.manage().window().maximize();
    }
	
		
		public void selectdropwon() throws IOException {
			
			driver.findElement(selectdrop).click();
			driver.findElement(dropdownele).click();
			String Msg=	driver.findElement(Errormsg).getText();
		 logger.error("The Error msg is :" +Msg);
		
	}
public void selectAlldrop() throws IOException, InterruptedException {
	for(i=1;i<=6;i++) {
			driver.findElement(selectdrop).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Thread.sleep(1000);
			driver.findElement(dropdownele).click();
			String Msg=	driver.findElement(Errormsg).getText();
			logger.error("The Error msg is :" +Msg);
		
	}
}
	public void Home_getstarted()throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(DSgetstarted).click();
		String Msg=	driver.findElement(Errormsg).getText();
		logger.error("The Error msg is :" +Msg);
	}
	
	public static void takesScreenshot(String fileName) throws IOException {
		//1.Take Screenshot and store it as file format:
		File Screenshotfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2.Now copy the screenshot and time stamp(java.sql) to a desired file location using copy file method:
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		String dir= System.getProperty("user.dir");
		FileUtils.copyFile(Screenshotfile,new File(dir+"/src/test/resources/dsalgo_Screenshots/"+fileName+"_"+timestamp+".jpg"));
		
	}	
	 public void signin()throws IOException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	 
	 driver.findElement(Signin).click();
}
	 public void Regpage1()throws IOException, InterruptedException {
			 
	 driver.findElement(register).click();
	 driver.findElement(SubmitReg).click();
	 Thread.sleep(1000);
	 takesScreenshot("Register1_page");
	
	 }
	 public void Regpage2()throws IOException, InterruptedException {
		 //driver.findElement(register).click();
	  driver.findElement(username).sendKeys("Hermi");
	 driver.findElement(SubmitReg).click();
	 Thread.sleep(1000);
	 takesScreenshot("Register2_page");
	 
	 }
	 public void Regpage3()throws IOException, InterruptedException {
		
		 driver.findElement(username).clear();
	driver.findElement(username).sendKeys("Madhu");
	 driver.findElement(Password1).sendKeys("saddfgdsf");
	 driver.findElement(SubmitReg).click();
	 Thread.sleep(1000);
	 takesScreenshot("Register3_page");
	 
		 }
	 public void Regpage4()throws IOException {
			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 driver.findElement(username).clear();
		driver.findElement(username).sendKeys("xperia11");
		 driver.findElement(Password1).sendKeys("skyBlack84#08");
		 driver.findElement(Password2).sendKeys("skyBlack84#07");
		 driver.findElement(SubmitReg).click();
		 takesScreenshot("Register4_page");
		 
			 }
	 public void Register() throws InterruptedException, IOException {
		    
			driver.findElement(username).sendKeys(prop.getProperty("username"));
			driver.findElement(Password1).sendKeys(prop.getProperty("Password1"));
			driver.findElement(Password2).sendKeys(prop.getProperty("Password1"));
			driver.findElement(SubmitReg).click();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			String Msg=	driver.findElement(Errormsg).getText();
			logger.info("The Page message is :" +Msg);
	 }	

	 public void sign_in1() throws InterruptedException, IOException {
		 
             driver.findElement(Signin).click();
             driver.findElement(login).click();
             takesScreenshot("Login1");
             
	 }
	 
	 public void sign_in2() throws InterruptedException, IOException {
		        
         driver.findElement(loginuser).sendKeys("xperia9");
         driver.findElement(login).click();
         Thread.sleep(1000);
         takesScreenshot("Login2");
 }
 public void Valid_Invalidlogin() throws InterruptedException, IOException {
		        
	      driver.findElement(Signin).click();
	       String[][] code=Utils_Excel.loginData();
	     	    
	     	for(int i=0;i<=1;i++) {
	     		
	     		driver.findElement(loginuser).sendKeys(code[i][0]);
	            driver.findElement(loginpassword).sendKeys(code[i][1]);
	     	     driver.findElement(login).click();
	     	}
	     	
        String Msg=driver.findElement(Errormsg).getText();
         logger.error("The Page error is :" +Msg);
 }
 /*public void Validlogin() throws InterruptedException, IOException {
	 //driver.findElement(Signin).click();
     driver.findElement(loginuser).sendKeys(prop.getProperty("username1"));
     driver.findElement(loginpassword).sendKeys(prop.getProperty("Password"));
     driver.findElement(login).click();
     String Msg=driver.findElement(Errormsg).getText();
     logger.info("The Page message is :" +Msg);
     //driver.findElement(signout).click();
}*/ 
public void login() throws InterruptedException, IOException {
	 driver.findElement(Signin).click();
     /*driver.findElement(loginuser).sendKeys(prop.getProperty("username1"));
     driver.findElement(loginpassword).sendKeys(prop.getProperty("Password"));*/
	 String[][] code=Utils_Excel.loginData();
	    
  	
  		driver.findElement(loginuser).sendKeys(code[i][0]);
         driver.findElement(loginpassword).sendKeys(code[i][1]);
  	     driver.findElement(login).click();
  	} 	
 
 

 
}
 



