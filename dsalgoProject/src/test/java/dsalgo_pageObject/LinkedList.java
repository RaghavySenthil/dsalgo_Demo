package dsalgo_pageObject;

import java.io.IOException;

import org.openqa.selenium.By;

import Utils.Utils_Excel;
import base.BaseTest;

public class LinkedList extends BaseTest {
	//String code= "print('hello')";
	By LLgetstarted=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]/div/div/a");
    By LLIntro =  By.xpath("//a[text()='Introduction']");
    By LLCreate = By.xpath("//a[text()='Creating Linked LIst']");
    By LLType =By.xpath("//a[text()='Types of Linked List']");
    By LLImplementPythn =By.xpath("//a[text()='Implement Linked List in Python']");
    By LLTraversal =By.xpath("//a[text()='Traversal']");
    By LLInsertion =By.xpath("//a[text()='Insertion']");
    By LLDeletion =By.xpath("//a[text()='Deletion']");
    By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
    By tryhere =By.xpath("//a[text()='Try here>>>']");
    By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    By Run = By.xpath("//button[text()='Run']");
    
    public void LL_getstarted() throws InterruptedException, IOException { 
    	driver.findElement(LLgetstarted).click();
    }
    public void Introduction() throws InterruptedException, IOException { 
		   driver.findElement(LLIntro).click();
		   
    }	   
	   
	public void Creating_LinkedList() throws InterruptedException, IOException { 
			
		    driver.findElement(LLCreate).click();
		 	 }
	public void Types_of_LinkedList() throws InterruptedException, IOException { 
		 		
		     driver.findElement(LLType).click();
		   	 }
	public void Implement_LinkedList_in_Python() throws InterruptedException, IOException { 
		    
		   driver.findElement(LLImplementPythn).click();
		   	 }
	public void Traversal() throws InterruptedException, IOException { 
		    
		   driver.findElement(LLTraversal).click();
		  
	 }
	public void Insertion() throws InterruptedException, IOException { 
		   
		   driver.findElement(LLInsertion).click();
		   
	 }
	public void Deletion() throws InterruptedException, IOException { 
		  
		   driver.findElement(LLDeletion).click();
		 
	 }
	public void PracticeQ() {
		driver.findElement(LLDeletion).click();
   	 driver.findElement(PracticeQ1).click();
    }
	/*public void try_blank_Run() throws InterruptedException, IOException { 	   	   
		   driver.findElement(tryhere).click();
		   driver.findElement(Blankpage1).sendKeys(code);
		   driver.findElement(Run).click();
	 }*/
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
