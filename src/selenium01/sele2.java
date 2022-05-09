package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\desika\\eclipse-workspace\\selenium1\\lib\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().minimize();
		
		driver.findElement(By.xpath("//input[@id=user-name]")).sendKeys("standard_user");
		WebElement pswd= driver.findElement(By.className("input_error form_input"));
		pswd.sendKeys("secret_sauce");
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
		
	}

}
