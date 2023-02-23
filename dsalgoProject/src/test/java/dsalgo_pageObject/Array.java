package dsalgo_pageObject;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Utils_Excel;
import base.BaseTest;


public class Array extends BaseTest {
	
	 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
	 By array=By.xpath("//a[text()='Arrays']");
	 By arrayphython= By.xpath("//a[text()='Arrays in Python']");
	 By tryhere= By.xpath("//a[text()='Try here>>>']");
	 By input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	 By run= By.xpath("//form[@id='answer_form']/button");
	 By arrayusinglist= By.xpath("//a[text()='Arrays Using List']");
	 By basicoperationlist= By.xpath("//a[text()='Basic Operations in Lists']");
	 By applicationArray= By.xpath("//a[text()='Applications of Array']");
	 By practiceQ= By.xpath("//a[text()='Practice Questions']");
	 By searcharray=By.xpath("//a[text()='Search the array']");
	 By maxCons= By.xpath("//a[text()='Max Consecutive Ones']");
	 By findno=By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	 By square=By.xpath("//a[text()='Squares of  a Sorted Array']");
	 By Topics=By.xpath("//body/div/ul/a[@class='list-group-item']");
	 public void Arraysel()
	 {
	 driver.findElement(dropdown).click();
	 driver.findElement(array).click();
	 }
	
	 public void performArray() throws Exception
	 {
	 String[][] code= Utils_Excel.getData();
	 int l=code.length;
	 int size= driver.findElements(Topics).size();
	 for(int j=1; j<=size;j++)
	 {
	 By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
	 driver.findElement(Topic).click();
	 System.out.println("Topic is: "+ Topic);
	 for(int i=0;i<l;i++)
	 {
	 driver.findElement(tryhere).click();
	 System.out.println(code);
	 driver.findElement(input).sendKeys(code[i]);
	 driver.findElement(run).click();
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
	 public void practiceQSearchArray() throws IOException
	 {
	 driver.findElement(arrayphython).click();
	 driver.findElement(practiceQ).click();
	 driver.findElement(searcharray).click();
	  for(int i=0;i<=28;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	 }
	 String[][] code= Utils_Excel.PracticeQ1();
	 driver.findElement(input).sendKeys(code[0]);
	 driver.findElement(run).click();
	 driver.navigate().back();
	 driver.findElement(searcharray).click();
	 for(int i=0;i<=28;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	 }
	 driver.findElement(input).sendKeys(code[1]);
	 driver.findElement(run).click();
	 try {
	 driver.switchTo().alert().accept();
	 }
	 catch(Exception e){
	 e.printStackTrace();
	 }
	 }
	 public void practiceQMaxCons() throws IOException
	 {
	 driver.findElement(arrayphython).click();
	 driver.findElement(practiceQ).click();
	 driver.findElement(maxCons).click();
	 for(int i=0;i<=35;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	  }
	 String[][] code= Utils_Excel.PracticeQ1();
	 driver.findElement(input).sendKeys(code[0]);
	 driver.findElement(run).click();
	 driver.navigate().back();
	 driver.findElement(maxCons).click();
	 for(int i=0;i<=35;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	  }
	 driver.findElement(input).sendKeys(code[1]);
	 driver.findElement(run).click();
	 try {
	 driver.switchTo().alert().accept();
	 }
	 catch(Exception e){
	 e.printStackTrace();
	 }
	 }
	 public void findnum() throws IOException
	 {
	 driver.findElement(arrayphython).click();
	 driver.findElement(practiceQ).click();
	 driver.findElement(findno).click();
	 for(int i=0;i<=22;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	  }
	 String[][] code= Utils_Excel.PracticeQ1();
	 driver.findElement(input).sendKeys(code[0]);
	 driver.findElement(run).click();
	 driver.navigate().back();
	 driver.findElement(findno).click();
	 for(int i=0;i<=22;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	  }
	 driver.findElement(input).sendKeys(code[1]);
	 driver.findElement(run).click();
	 try {
	 driver.switchTo().alert().accept();
	 }
	 catch(Exception e){
	 e.printStackTrace();
	 }
	   }
	 public void square() throws IOException
	 {
	 driver.findElement(arrayphython).click();
	 driver.findElement(practiceQ).click();
	 driver.findElement(square).click();
	 for(int i=0;i<=25;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	  }
	 String[][] code= Utils_Excel.PracticeQ1();
	 driver.findElement(input).sendKeys(code[0]);
	 driver.findElement(run).click();
	 driver.navigate().back();
	 driver.findElement(square).click();
	 for(int i=0;i<=25;i++)
	 {
	 driver.findElement(input).sendKeys(Keys.DELETE);
	  }
	 driver.findElement(input).sendKeys(code[1]);
	 driver.findElement(run).click();
	 try {
	 driver.switchTo().alert().accept();
	 }
	 catch(Exception e){
	 e.printStackTrace();
	 }
	   }
	 }


