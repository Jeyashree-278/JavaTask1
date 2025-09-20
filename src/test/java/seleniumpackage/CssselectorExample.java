package seleniumpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssselectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("#email")).sendKeys("jeyashree278@gmail.com");
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("password123");
		//driver.findElement(By.cssSelector(".inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("password123");
		//driver.findElement(By.cssSelector(".inputtext _55r1 inputtext _9npi inputtext _9npi[name='pass']")).sendKeys("password123");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
	driver.close();
	driver.quit();
	}
	

}
