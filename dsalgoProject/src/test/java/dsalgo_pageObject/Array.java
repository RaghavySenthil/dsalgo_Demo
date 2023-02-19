package dsalgo_pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Utils.Utils_Excel;
import base.BaseTest;

public class Array extends BaseTest{

	By selectdropArray =By.xpath("//div[@class='nav-item dropdown']");
    By SelectArray =By.xpath("//a[text()='Arrays']");
    By Applications_of_Array = By.xpath("//a[text()='Applications of Array']");
    By PracticeQ = By.xpath("//a[text()='Practice Questions']");
    By search_Array = By.xpath("//a[text()='Search the array']");
    By Findnum = By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
    By squaresArray = By.xpath("//a[text()='Squares of  a Sorted Array']");
    By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    By tryhere =By.xpath("//a[text()='Try here>>>']");
    By Run = By.xpath("//button[text()='Run']");
    By def = By.xpath("//span[@class='cm-keyword'][text()='def']");
    By search =By.xpath("//span[@class='cm-def'][text()='search']");
    By Input_list = By.xpath("//span[@class='cm-variable'][text()='input_list']");
    
    public void Array_practiceQ() {
    	driver.findElement(selectdropArray).click();
    	driver.findElement(SelectArray).click();
    	driver.findElement(Applications_of_Array).click();
    	driver.findElement(PracticeQ).click();
    	
    }
    
    public void Search_Array() {
    	driver.findElement(search_Array).click();
    }
    public void Input() throws InterruptedException, IOException { 
    	
		String[][] code=Utils_Excel.PracticeQ1();
	   	        
	   	
	   		for(int i=0;i<=28;i++)
	   		{
	   			driver.findElement(Blankpage1).sendKeys(Keys.DELETE);
	   		}
	   			//for(int i=0;i<=1;i++) {
	   	    driver.findElement(Blankpage1).sendKeys(code[0]);
	   	    
	   	   	   driver.findElement(Run).click();
	}
      
    
public void Find_Numbers() throws InterruptedException, IOException { 
	driver.findElement(Findnum).click();
    	
}
public void squaresArray() throws InterruptedException, IOException { 
	driver.findElement(squaresArray).click();
    	
}
	   			
	
}

