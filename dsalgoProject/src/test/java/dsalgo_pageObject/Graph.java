package dsalgo_pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.ScreenShot;
import Utils.Utils_Excel;
import base.BaseTest;

public class Graph extends BaseTest{

By Graph= By.xpath("//div//div[7]//div//div//a[contains(text(),'Get Started')]");
By Topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
By Tryhere= By.xpath("//a[contains (text(), 'Try here')]");
By Graph_Representations= By.xpath("//a[contains (text(), 'Graph Representations')]");
By PracticeQ= By.xpath("//a[contains (text(), 'Practice Questions')]");
By Input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
By Run= By.xpath("//button");


    public void AccessGraph() throws IOException {
driver.findElement(Graph).click();
String[][] code= Utils_Excel.getData();
int l=code.length;
int size= driver.findElements(Topic).size();
for( int j=2;j<=size;j++) {
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
driver.findElement(Graph).click();
driver.findElement(Graph_Representations).click();
driver.findElement(PracticeQ).click();
}
}
