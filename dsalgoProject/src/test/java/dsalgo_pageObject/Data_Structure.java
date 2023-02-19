package dsalgo_pageObject;


import java.io.IOException;

import org.openqa.selenium.By;

import Utils.Utils_Excel;


import base.BaseTest;


public class Data_Structure extends BaseTest {
	
	By DSgetstarted = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]/div/div/a");
    By DStimecomplex = By.xpath("//a[text()='Time Complexity']");
    By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
    By tryhere =By.xpath("//a[text()='Try here>>>']");
    By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    By Run = By.xpath("//button[text()='Run']");
    
    public void Datastructure() throws Exception { 
    	
 	 
            
   	   driver.findElement(DSgetstarted).click();
   	   driver.findElement(DStimecomplex).click();
   	//Utils_Excel read=new Utils_Excel();
	
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

