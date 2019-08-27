package pack1;
	

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

	public class Loginpage extends BasePage{
		
		
		//maintains all the variables & objects related to our project
		
		//WebDriver driver,
		//application url,
		//user name,
		//password,
		//etc.,
		
		/////OBJECTS
		
		//txt_username="txtUserName",
		//btn_Login="Submit",
		//lik_logout="logout"
		//etc.,
		
		
		@FindBy (xpath ="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
		private WebElement WOMEN;
		

	    @FindBy (xpath ="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	    private WebElement Dresses;
	    
	    @FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	    private WebElement Tshirts;
	    
	    @FindBy(xpath ="//*[@id='ul_layered_id_attribute_group_1']//li[1]/label/a")
	    private WebElement S;
	    
	    @FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']//li[2]/label/a")
	    private WebElement M;
	    
	    @FindBy(xpath ="//*[@id='ul_layered_id_attribute_group_1']//li[3]/label/a")
	    private WebElement L;
	    
	    @FindBy(xpath ="//*[@id=\"newsletter-input\"]") 
	    private WebElement Newsletter;
	    
	    @FindBy(xpath ="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	    private WebElement subbtn;
	    
	    @FindBy(xpath="//*[@id=\"columns\"]/p")
	    private WebElement alert;
	    
	    @FindBy(xpath ="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
	    private WebElement PrintedDress;
	    
	    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	    private WebElement Addtocart;
	    
	    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	    private WebElement Cnfmsg;
	    
	    @FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	    private  WebElement checkout;
	    
	    
		public Loginpage() //constructor-- for reading the locator
		{
			PageFactory.initElements(driver,this);
		}
		
		
		public WebElement verifyWomen() {		//method
			return WOMEN;
		}
	    
	    public WebElement verifyDresses() {
	    	return Dresses;
	    }    
	   
	    
	    public WebElement verifyTshirts(){
	    	return Tshirts;
	    }
	
	
	    public WebElement size() {
	    	Dresses.click();
	    	return S;
	    }
	    
	    public WebElement msize() {
	    	Dresses.click();
	    	return M;
	    }
	    
	    public WebElement lsize() {
	    	Dresses.click();
	    	return L;
	    }
	    
	    public String WOMENPage() {
	    	WOMEN.click();
	    	return driver.getTitle();
	    }
	    
	    public String DressesPage() {
	    	Dresses.click();
	    	return driver.getTitle();
	    }
	    
	    public String TshirtsPage() {
	    	Tshirts.click();
	    	return driver.getTitle();
	    }  
	    
	    
	    public void getNewsletterBox() {
	    int random = new Random().nextInt(300);
	    String email = "ramsuria"+random+"@yahoo.in";
	    Newsletter.sendKeys(email);
	    	subbtn.click();
	    }
	    
	    public String alert () {
			return alert.getText();
			
	    }
	    
	    public void addlisttocart() {
	    	Dresses.click();
	    	Actions action = new Actions(driver);
	    	action.moveToElement(PrintedDress).build().perform();
	        Addtocart.click();      	
	    }	
	 	
	    
	    public  String Cnfmsg() {
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return Cnfmsg.getText(); 	
	    }
	    
	    public void checkout() {
	    	checkout.click();
	    	
	    }
	    
	    public void screenshort() throws IOException {
	    	File snap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(snap,new File("C:\\Users\\user\\Pictures\\pics.png"));
			
	    }
	    
	    
	    }
	    
	   
	    