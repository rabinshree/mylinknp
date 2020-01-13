package E2EProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeLoginTest {


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
	public void verifyInvalidPW() 
	
	{
		
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("admintest");
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test9912");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
     	//Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());

	}
	@Test
	public void VerifyInvalidUserName()
	{
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("admintesttest");
		driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test99");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
     	//Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	}
	
	

@Test
public void VerifyUserNamrEmty()
{
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("");
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test99");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
 	//Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
}

@Test
public void VerifyInvalidPWblanks()
{
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("admintesttest");
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
 	Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
}

@Test
public void VerifyUsernamePWblanks()
{
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("");
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
 	//Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
}

	


@Test
public void VerifyNumberinUserID()
{
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("111111");
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test99");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
 	//Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
}


@Test
public void VerifyNumberPW()
{
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("admintesttest");
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("9912");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
 //	Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
}


@Test
public void VerifyCharecterinPW()
{
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Username']")).sendKeys("admintesttest");
	driver.findElement(By.xpath("//div[@class='portable-login']//input[@placeholder='Password']")).sendKeys("test99@$&");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	Assert.assertTrue(true, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
 	//Assert.assertTrue(false, driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
}

	@AfterMethod
	public void tearDown() {
       driver.quit();
}


}



