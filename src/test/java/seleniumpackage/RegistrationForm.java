package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/aravi/Downloads/RegistrationForm.html");
		driver.findElement(By.id("firstName")).sendKeys("Jeyashree");
		driver.findElement(By.id("lastName")).sendKeys("Renganathan");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("email")).sendKeys("jeyashree278@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9047950346");
		driver.findElement(By.id("address")).sendKeys("1abc");

		driver.findElement(By.id("city")).sendKeys("Madurai");
		driver.findElement(By.id("state")).sendKeys("TN");
		driver.findElement(By.id("country")).sendKeys("IN");
		driver.findElement(By.id("username")).sendKeys("Jeyashree");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.id("confirmPassword")).sendKeys("123456");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/form/button"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/button")));
        loginBtn.click();
		Thread.sleep(3000);
		System.out.println("Registration successful");
		driver.close();
		
	}
	
	

}
