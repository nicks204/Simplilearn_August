package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Selenium");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total no of Rows are " + Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total no of Columns are " + Columns.size());
		
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println("Data is " + data.getText());
		
		
		for(int i=2;i<=Rows.size();i++) {
			
			WebElement cell = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
			System.out.println("Compnay Name " + cell.getText());
		}
		
		//=====================Scroll Example
		
		
		WebElement Scroll = driver.findElement(By.xpath("//h2[text()='HTML Table - Collapsed Borders']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", Scroll);
		
		
		
		
	}

}
