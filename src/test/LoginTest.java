package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestNGListenerExample.class)

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	
	@Test
	@Parameters({"UserName", "Password"})
	
	public void LoginFailiureTest(String uname, String pwd) {
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(uname);
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(pwd);
		
		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();
		
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement ErrorMsg = driver.findElement(By.className("error_msg"));
		String ActError = ErrorMsg.getText();
		
		String ExpError = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(ActError, ExpError);
		
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(ActError, ExpError);
		
		
		List<WebElement> Input = driver.findElements(By.tagName("input"));
		
		System.out.println("Total Textboxes are " + Input.size());
		
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
	}

}
