package pack1;
	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	


	public class BasePage {
		
		
		//maintains all the re-usable functions related to project
		//open browser
		//close browser
		//login
		//logout
		//addemp
		//delemp
		//etc.,
		
		
		
		
		public static WebDriver driver;
		public String browser = "chrome";
		
		
		public BasePage() {
			
					
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			
			}
					public String getTitle() {
					return driver.getTitle();		
				}
				
				public void tearDown() {
					driver.quit();
				}

}
