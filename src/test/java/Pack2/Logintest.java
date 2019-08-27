package Pack2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pack1.BasePage;
import pack1.Loginpage;

public class Logintest {
		
		//all the actual test cases need to written in this package only
		
		Loginpage ln;
		//BasePage bn;
		
		public Logintest() {
			ln = new Loginpage();
			//bn = new BasePage();
		}
		
		
		@Test
		public void verifyWomentText() {
			Assert.assertTrue(ln.verifyWomen().isDisplayed());
		}
		
		@Test
		public void verifyDressesText() {
			Assert.assertTrue(ln.verifyDresses().isDisplayed());
		}
		
		@Test
		public void verifyTshirts() {
			Assert.assertTrue(ln.verifyTshirts().isDisplayed());
			
		}
		
		@Test
		public void sizes() {
		Assert.assertTrue(ln.msize().isDisplayed());
		System.out.println(ln.msize().getText());
		Assert.assertTrue(ln.size().isDisplayed());
		System.out.println(ln.size().getText());
		Assert.assertTrue(ln.lsize().isDisplayed());
		System.out.println(ln.lsize().getText());
		}
		
		@Test
		public void Pageallthree() {
			System.out.println(ln.WOMENPage());
			System.out.println(ln.DressesPage());
			System.out.println(ln.TshirtsPage());
		}
		
		@Test
		public void subscription() {
			//String txt = " Newsletter : You have successfully subscribed to this newsletter.
		ln.getNewsletterBox();
		System.out.println(ln.alert());
       }
	
		
		@Test
		public void message() {
			ln.addlisttocart();
		System.out.println(ln.Cnfmsg());
		/*String txt = "Product successfully added to your shopping cart";
		System.out.println(txt);*/
 
		}
		
		@Test
		public void proceed() {
			ln.checkout();
		}
		
		
		@Test
		public void takescreen() throws IOException {
			ln.screenshort();		
		}
		
		
		
}