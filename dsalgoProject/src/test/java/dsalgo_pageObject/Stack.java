package dsalgo_pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Utils_Excel;
import base.BaseTest;

public class Stack extends BaseTest {
	
	 By selectdropStack =By.xpath("//div[@class='nav-item dropdown']");
     By SelectStack =By.xpath("//a[text()='Stack']");
     /*By opinstack = By.xpath("//a[text()='Operations in Stack']");
     By Implementation = By.xpath("//a[text()='Implementation']");*/
     By Applications = By.xpath("//a[text()='Operations in Stack']");
     By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
     By tryhere =By.xpath("//a[text()='Try here>>>']");
     By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
     By Topic= By.xpath("//body/div/ul['+j+']/a[@class='list-group-item']");
     By Run = By.xpath("//button[text()='Run']");
     
     public void Stack1() throws IOException {
 		driver.findElement(selectdropStack).click();
 		driver.findElement(SelectStack).click();
 		List<WebElement> Topics= driver.findElements(Topic);
 		System.out.println(Topics.size());
 		WebElement T;
 		for( int j=1;j<=Topics.size();j++) {
 		System.out.println("Topic size is: " + Topics.size() + " and I variable is: " + j);
 		By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
 		T=driver.findElement(Topic);
 		T.click();
 		//System.out.println("Topic is: "+ Topic);
   
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
 	    		//e.printStackTrace();
 	    	}
 	   	driver.navigate().back();
 	}
 	   driver.navigate().back();
 	}
}
     public void PracticeQ() {
    	 driver.findElement(Applications).click();
    	 driver.findElement(PracticeQ1).click();
     }
}
