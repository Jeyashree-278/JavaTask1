package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) throws InterruptedException {
		String title="GUVI | Learn to code in your native language";
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.guvi.in/");
		 Thread.sleep(2000);
		 String title1=driver.getTitle();
		 System.out.println(title);
		 if(title1.equals(title))
		 {
			 System.out.println("Title is matched");
		 }
		 else
		 {
			 System.out.println("Title is not matched");
		 }
		driver.quit();
		// TODO Auto-generated method stub

	}

}
