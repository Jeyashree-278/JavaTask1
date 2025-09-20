package javatask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().refresh();
		driver.close();
		

	}

}
