package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SignUp = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		SignUp.click();
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement LastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement MobNo = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		
		FirstName.sendKeys("Tom");
		LastName.sendKeys("Jerry");
		MobNo.sendKeys("8888888888");
		Password.sendKeys("abc1234");
		
		
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select ddDdate = new Select(Date);
		Select ddMonth = new Select(Month);
		Select ddYear = new Select(Year);
		
		ddDdate.selectByVisibleText("1");
		ddMonth.selectByVisibleText("Jan");
		ddYear.selectByVisibleText("1985");
		
		WebElement MaleGender = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		MaleGender.click();
		
		WebElement Submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		//Submit.click();
		
		

	}

}
