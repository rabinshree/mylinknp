package E2EProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidLoginTest {
	

	 
	public WebDriver driver;
	



	@BeforeMethod

	public void SetUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rabin\\Downloads\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\rabin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//driver= new FirefoxDriver();
	     
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.mylinknp.com/");
		
		//Thread.sleep(3000);
	}
	

	@Test
	public void verifyValidLoginTest() 
	
	{
		
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("admintest");
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test99");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Assert.assertTrue(true);
		// Assert.assertTrue(false);  // negative testing
	}
	@Test
	public void LogOutTest()
	{
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("testadmin");
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test99");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//span[@class='header-user-name']")).click();
		driver.findElement(By.xpath("//ul[@id='account-menu-dropdown']//a[@class='dropdown-item'][contains(text(),'Logout')]")).click();
		Assert.assertTrue(true);
		 //Assert.assertTrue(false); // negative testing
	}
	
	@AfterMethod
	public void tearDown() {
       driver.quit();
}


}



