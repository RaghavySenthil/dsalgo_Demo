package dsalgo_pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.Utils_Excel;
import base.BaseTest;

public class LinkedList extends BaseTest {

	By LLgetstarted=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]/div/div/a");
	By Topic= By.xpath("//body/div/ul['+j+']/a[@class='list-group-item']");
    By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
    By tryhere =By.xpath("//a[text()='Try here>>>']");
    By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
    By LLDeletion =By.xpath("//a[text()='Deletion']");
    By Run = By.xpath("//button[text()='Run']");
	public void LList1() throws IOException {
		driver.findElement(LLgetstarted).click();
		List<WebElement> Topics= driver.findElements(Topic);
		System.out.println(Topics.size());
		WebElement T;
		for( int j=1;j<=Topics.size();j++) {
		System.out.println("Topic size is: " + Topics.size() + " and I variable is: " + j);
		By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
		T=driver.findElement(Topic);
		T.click();
		//System.out.println("Topic is: "+ Topic);
				
			//public void perform_for_loop() throws InterruptedException, IOException { 
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
		driver.findElement(LLDeletion).click();
   	 driver.findElement(PracticeQ1).click();
    }
}

