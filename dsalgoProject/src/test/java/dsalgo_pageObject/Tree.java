package dsalgo_pageObject;

import java.io.IOException;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ScreenShot;
import Utils.Utils_Excel;
import base.BaseTest;

public class Tree extends BaseTest{
	//String Code= "print('Test')";
	//String Code1= "Test";
	By Tree= By.xpath("//div//div[6]//div//div//a[contains(text(),'Get Started')]");
	By Topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
	By Tryhere= By.xpath("//a[contains (text(),'Try here')]");
	By Input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By Implementation= By.xpath("//a[text()='Implementation Of BST']");
	By PracticeQ =By.xpath("//a[text()='Practice Questions']");
	By Run= By.xpath("//button");
	
	
	public void AccessTree() throws IOException, InterruptedException {
		driver.findElement(Tree).click();
		String[][] code= Utils_Excel.getData();
		int l=code.length;
		int size= driver.findElements(Topic).size();
		for( int j=1;j<=size;j++) {
		//Thread.sleep(1000);
		By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
		driver.findElement(Topic).click();
		System.out.println("Topic is: "+ Topic);
		for(int i=0;i<l;i++)
		{
		driver.findElement(Tryhere).click();
		System.out.println(code);
		driver.findElement(Input).sendKeys(code[i]);
		driver.findElement(Run).click();
		try {
		driver.switchTo().alert().accept();
		}
		catch(Exception e){
		}
		driver.navigate().back();
		}
		driver.navigate().back();
		}
		}
public void PracticeQ() {
	driver.findElement(Tree).click();
driver.findElement(Implementation).click();
driver.findElement(PracticeQ).click();
}
}
