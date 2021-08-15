package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Selenium");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement From =driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(From, To).build().perform();
		

	}

}
