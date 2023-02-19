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
	LinkedList LL=new LinkedList();
	Stack SK = new Stack();
	Array AS = new Array();
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
	public void sign_in_page() throws IOException, InterruptedException {
	     
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
		LL.LL_getstarted();
	    LL.Introduction();
	    LL.perform_for_loop();
	} 
	@Test 
	public void Linkedlist2() throws IOException, InterruptedException {
	    Rg.login();
	    LL.LL_getstarted();
        LL.Creating_LinkedList();
        LL.perform_for_loop();
	} 
	@Test 
	public void Linkedlist3() throws IOException, InterruptedException {
        Rg.login();
        LL.LL_getstarted();
        LL.Types_of_LinkedList();
        LL.perform_for_loop();
	} 
	@Test 
	public void Linkedlist4() throws IOException, InterruptedException {
        Rg.login();
        LL.LL_getstarted();
        LL.Implement_LinkedList_in_Python();
        LL.perform_for_loop();
	} 
	@Test 
	public void Linkedlist5() throws IOException, InterruptedException {
	     Rg.login();
	     LL.LL_getstarted();
         LL.Traversal();
         LL.perform_for_loop();
	}  
	@Test 
	public void Linkedlist6() throws IOException, InterruptedException {    
        Rg.login();
        LL.LL_getstarted();
        LL.Insertion();
        LL.perform_for_loop();
	} 
	@Test 
	public void Linkedlist7() throws IOException, InterruptedException {   
        Rg.login();
        LL.LL_getstarted();
        LL.Deletion();
        LL.perform_for_loop();
	}   
	@Test 
	public void Linkedlist8() throws IOException, InterruptedException {   
        Rg.login();
        LL.LL_getstarted();
        LL.Deletion();
        LL.PracticeQ();
	}   
	@Test 
	public void Stack1() throws IOException, InterruptedException {   
        Rg.login();
        SK.selectdrop_Stack();
        SK.Select_Stack();
        SK.Operation_inStack();
        SK.perform_for_loop();
	} 
	
	@Test 
	public void Stack2() throws IOException, InterruptedException {   
        Rg.login();
        SK.selectdrop_Stack();
        SK.Select_Stack();
        SK.Implementation();
        SK.perform_for_loop();
	} 
	@Test 
	public void Stack3() throws IOException, InterruptedException {   
        Rg.login();
        SK.selectdrop_Stack();
        SK.Select_Stack();
        SK.Application();
        SK.perform_for_loop();
	} 
	@Test 
	public void Stack4() throws IOException, InterruptedException {   
        Rg.login();
        SK.selectdrop_Stack();
        SK.Select_Stack();
        SK.Application();
        SK.PracticeQ();
	}
	@Test 
	public void Array1_PracticeQ1() throws IOException, InterruptedException {  
		Rg.login();
		AS.Array_practiceQ();
		AS.Search_Array(); 
		AS.Input();
		
	}
	@Test 
	public void Array1_PracticeQ3() throws IOException, InterruptedException {  
		Rg.login();
		AS.Array_practiceQ();
		AS.Find_Numbers(); 
		AS.Input();
		
	}
	@Test 
	public void Array1_PracticeQ5() throws IOException, InterruptedException {  
		Rg.login();
		AS.Array_practiceQ();
		AS.squaresArray();
		AS.Input();
		
	}
	
  @AfterMethod
  public void teardown()
{
driver.quit();
}
	
}
	








