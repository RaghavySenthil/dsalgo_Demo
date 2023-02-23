package dsalgo_pageObject;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.Utils_Excel;
import base.BaseTest;

public class Runner extends BaseTest{

	Rg_login Rg = new Rg_login();
	Stack SK = new Stack();
	Array ar =new Array();
	LinkedList LL= new LinkedList();
	Tree TR = new Tree();
	Graph GR = new Graph();
	Queue QU= new Queue();
	
	@BeforeMethod
	
	public void Lunch() throws IOException, InterruptedException {
	
		setup();
		Rg.getstarted();
	}
	
	@Test
	public void dropdown() throws InterruptedException, IOException {
		
				Rg.selectdropwon();
	}
	@Test
	public void selectAlldrop() throws InterruptedException, IOException {
	            Rg.selectAlldrop();
	}
	
	@Test
	public void home_getstarted() throws InterruptedException, IOException {
		       Rg.Home_getstarted();    
}
	@Test 
	public void signin() throws IOException, InterruptedException {
		Rg.sign_in1();
		Rg.sign_in2();
		Rg.signin();
	}
	@Test 
	public void Regpage() throws IOException, InterruptedException {
		Rg.Regpage1();
		Rg.Regpage2();
		Rg.Regpage3();
		Rg.Regpage4();
		Rg.Register();
	}
	@Test 
	public void LoginPage() throws IOException, InterruptedException {
	     
                  Rg.Valid_Invalidlogin();
		           //Rg.login(); 
                
	}     
	@Test
	public void Datastructure() throws Exception {
		Data_Structure DS= new Data_Structure();
		     Rg.login();       
             DS.Datastructure();
             
	}     
	@Test 
	public void Linkedlist1() throws IOException, InterruptedException {
		           
		Rg.login();
		LL.LList1();
		LL.PracticeQ();
		
	} 
	
	@Test 
	public void Stack1() throws IOException, InterruptedException {   
        Rg.login();
        SK.Stack1();
        SK.PracticeQ();
       
	} 
	@Test 
	public void Tree() throws IOException, InterruptedException {   
        Rg.login();
        TR.AccessTree();
	}
	@Test 
	public void Tree1() throws IOException, InterruptedException {   
        Rg.login();
        TR.PracticeQ();
	}
	@Test 
	public void Graph() throws IOException, InterruptedException {   
        Rg.login();
        GR.AccessGraph();
	}
	@Test 
	public void Graph1() throws IOException, InterruptedException {   
        Rg.login();
        GR.PracticeQ();
	}

	@Test
	public void array() throws Exception
	{
		Rg.login();
		ar.Arraysel();
		ar.performArray();
		
	}
		
	
	@Test
	public void ArrayPracticeQ() throws InterruptedException, IOException
	{
		Rg.login();
		ar.Arraysel();
		ar.practiceQSearchArray();
		
	}
	@Test
	public void ArrayMaxConsPracticeQ() throws InterruptedException, IOException
	{
		Rg.login();
		ar.Arraysel();
		ar.practiceQMaxCons();
		
	}
	@Test
	public void ArrayfindnoPracticeq() throws InterruptedException, IOException
	{
		Rg.login();
		ar.Arraysel();
		ar.findnum();
		
	}
	@Test
	public void ArraysquarePracticeQ() throws InterruptedException, IOException
	{
		Rg.login();
		ar.Arraysel();
		ar.square();
		
	}
	@Test
	public void Queue() throws Exception
	{
		Rg.login();
		QU.Quesel();
		QU.performQueue();
	}
	
	@Test
	public void QueuepracticeQ()  throws Exception
	{
		Rg.login();
		QU.Quesel();
		QU.practiceQ();
	}
	
 @AfterMethod
  public void teardown()
{
driver.quit();
}
	
}
	








