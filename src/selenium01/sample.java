package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\desika\\eclipse-workspace\\selenium1\\lib\\chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		
		driver.close();
		
	
		
		
	}

}
