package E2EProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest {

	
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
		String title =driver.getTitle();
		System.out.println("this is a title" +title);
		Assert.assertEquals(title, "MyLinknp - Welcome to our network");


	}

	@AfterMethod
	public void tearDown() {
       driver.quit();
}


}




	
	
	

