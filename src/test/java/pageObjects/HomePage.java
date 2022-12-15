package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.Loggerload;

public class HomePage {
	
	public  static WebDriver driver;
	String URL=ConfigReader.getApplicationUrl();
	String homeURL=ConfigReader.getHomePage();
	
	//Dsalgo page
	@FindBy (xpath="//a[@href='/home']")WebElement getstart_link;
	@FindBy (xpath="//a[contains(text(),'Get Started')]")WebElement getstart;
	
	//alert 
	@FindBy (xpath="//*[@class='alert alert-primary']")WebElement alert_msg;
	
	//Homepage
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstart_datastructures;
	@FindBy (xpath="//a[@href='array']")WebElement getstart_array;
	@FindBy (xpath="//a[@href='linked-list']")WebElement getstart_linkedlist;
	@FindBy (xpath="//a[@href='stack']")WebElement getstart_stack;
	@FindBy (xpath="//a[@href='queue']")WebElement getstart_queue;
	@FindBy (xpath="//a[@href='tree']")WebElement getstart_tree;
	@FindBy (xpath="//a[@href='graph']")WebElement getstart_graph;
	
	@FindBy (xpath="//a[@href='#']")WebElement dropdown;
	@FindBy (xpath="//div[@class='dropdown-menu show']")WebElement dropdown_array;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[2]")WebElement dropdown_linkedlist;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[3]")WebElement dropdown_stack;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[4]")WebElement dropdown_queue;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[5]")WebElement dropdown_tree;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[6]")WebElement dropdown_graph;
	
	//sigin
	@FindBy (xpath="//a[@href='/login']")
	static WebElement signin;
	//register
	@FindBy (xpath="//a[@href='/register']")WebElement register;
	
	//Dsalgo page elements
	public void dsalgopage() {
		
			driver=DriverFactory.getdriver();
			driver.get(URL);
			PageFactory.initElements(driver, this);
					
	}

	public void getStarted_link(String str) {
		
		getstart_link.click();
		
	}

	public String getPageTitle() {
		
		String title=driver.getTitle();
		return title;
		
	}
	
	public String alert() {
				
		String msg=alert_msg.getText();
		return msg;
		
	}

	//Home page Elements
	public void homepage() {
		
		driver=DriverFactory.getdriver();
		driver.get(homeURL);
		PageFactory.initElements(driver, this);
	}

	public void getStarted_home(String string) {
		
		switch (string) {
		case "Datastructures":
			Loggerload.info("click "+getstart_datastructures.getText()+"link on  DataStructures ");
			getstart_datastructures.click();
			break;
	    case "Arrays":
	    	Loggerload.info("click "+getstart_array.getText()+"link on Array ");
	    	getstart_array.click();
	    	break;
	    case "Linkedlist":
	    	Loggerload.info("click "+getstart_linkedlist.getText()+"link on LinkedList");
	    	getstart_linkedlist.click();
	    	break;
	    case "Stack":
	    	Loggerload.info("click "+getstart_stack.getText()+"link on stack");
	    	getstart_stack.click();
	    	break;
	    case "Queue":
	    	Loggerload.info("click "+getstart_queue.getText()+"link on queue ");
	    	getstart_queue.click();
	    	break;
	    case "Tree":
	    	Loggerload.info("click "+getstart_tree.getText()+"link on Tree ");
	    	getstart_tree.click();
	    	break;
	    case "Graph":
	    	Loggerload.info("click "+getstart_graph.getText()+"link on Graph ");
	    	getstart_graph.click();
			break;
		}
	}

	//Dropdown
	public void dropdown(String string) {
			
		dropdown.click();
		switch (string) { 
	    case "Arrays":
	    	Loggerload.info("User click on " + string);
	    	dropdown_array.click();
	    	break;
	    case "Linkedlist":
	    	Loggerload.info("User click on " + string);
	    	dropdown_linkedlist.click();
	    	break;
	    case "Stack":
	    	Loggerload.info("User click on " + string);
	    	dropdown_stack.click();
	    	break;
	    case "Queue":
	    	Loggerload.info("User click on " + string);
	    	dropdown_queue.click();
	    	break;
	    case "Tree":
	    	Loggerload.info("User click on " + string);
	    	dropdown_tree.click();
	    	break;
	    case "Graph":
	    	Loggerload.info("User click on " + string);
	    	dropdown_graph.click();
			break;
		}
		
			
	}
		

	//Signin 
	public static void signin_link() {
		signin.click();
	}

	public String login_page() {
		String title=driver.getTitle();
		return title;
	}

	//Register
	public void register_link() {
		
		register.click();
		
	}

	public String register_page() {
		String title=driver.getTitle();
		return title;
	}
	
}
