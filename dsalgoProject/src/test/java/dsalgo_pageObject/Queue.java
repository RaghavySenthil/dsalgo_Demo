package dsalgo_pageObject;
import org.openqa.selenium.By;

import Utils.Utils_Excel;
import base.BaseTest;

public class Queue extends BaseTest {
	By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
	By queue=By.xpath("//a[text()='Queue']");
	By queuephython= By.xpath("//a[text()='Implementation of Queue in Python']");
	By queuecollection= By.xpath("//a[text()='Implementation using collections.deque']");
	By queueArray= By.xpath("//a[text()='Implementation using array']");
	By queueOp= By.xpath("//a[text()='Queue Operations']");
	By tryhere= By.xpath("//a[text()='Try here>>>']");
	By input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By run= By.xpath("//form[@id='answer_form']/button");
	By practiceQ= By.xpath("//a[text()='Practice Questions']");
	By Topics=By.xpath("//body/div/ul/a[@class='list-group-item']");
	public void Quesel()
	{
		driver.findElement(dropdown).click();;
		driver.findElement(queue).click();;
		
	}

	public void performQueue() throws Exception
	{
	   
		
		String[][] code= Utils_Excel.getData();
		int size= driver.findElements(Topics).size();
		for(int j=1; j<=size;j++)
		{
			By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
			driver.findElement(Topic).click();
			//System.out.println("Topic is: "+ Topic);

		for(int i=0;i<=2;i++)
		{
			driver.findElement(tryhere).click();
			
			//System.out.println(code);

			driver.findElement(input).sendKeys(code[i]);
			driver.findElement(run).click();

			try {
				driver.switchTo().alert().accept();
			}
			catch(Exception e){
				//e.printStackTrace();
			}

			driver.navigate().back();
			
		}
		driver.navigate().back();
		}

	}
	
	public void practiceQ()
	{
		driver.findElement(queuephython).click();
		driver.findElement(practiceQ).click();
	}

}
