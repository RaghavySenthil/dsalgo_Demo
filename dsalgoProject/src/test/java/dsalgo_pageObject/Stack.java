package dsalgo_pageObject;

import java.io.IOException;

import org.openqa.selenium.By;

import Utils.Utils_Excel;
import base.BaseTest;

public class Stack extends BaseTest {
	
	 By selectdropStack =By.xpath("//div[@class='nav-item dropdown']");
     By SelectStack =By.xpath("//a[text()='Stack']");
     By opinstack = By.xpath("//a[text()='Operations in Stack']");
     By Implementation = By.xpath("//a[text()='Implementation']");
     By Applications = By.xpath("//a[text()='Operations in Stack']");
     By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
     By tryhere =By.xpath("//a[text()='Try here>>>']");
     By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
     By Run = By.xpath("//button[text()='Run']");
     
     public void selectdrop_Stack() {
    	 driver.findElement(selectdropStack).click();
     }
     public void Select_Stack() {
    	 driver.findElement(SelectStack).click();
     }
     public void Operation_inStack() {
    	 driver.findElement(opinstack).click();
     }
     public void Implementation() {
    	 driver.findElement(Implementation).click();
     }
     public void Application() {
    	 driver.findElement(Applications).click();
     }
     public void PracticeQ() {
    	 driver.findElement(Applications).click();
    	 driver.findElement(PracticeQ1).click();
     }
     public void perform_for_loop() throws InterruptedException, IOException { 
 		String[][] code=Utils_Excel.getData();
 	   	        
 	   	for(int i=0;i<=2;i++) {
 	   	    driver.findElement(tryhere).click();
 	   	    driver.findElement(Blankpage1).sendKeys(code[i]);
 	   	   	   driver.findElement(Run).click();
 	   	   
 	   	 //Thread.sleep(5000);
 	   	try {
 	   	driver.switchTo().alert().accept();
 	   	   	}
 	   	  	
 	    	catch (Exception e) {
 	    		e.printStackTrace();
 	    	}
 	   	driver.navigate().back();
 	}
 	   	
 	}
}
