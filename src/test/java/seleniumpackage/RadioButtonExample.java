package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@value='rd1']")).isDisplayed();
		 driver.findElement(By.xpath("//input[@value='rd2']")).isSelected();
		 driver.findElement(By.xpath("//input[@value='rd3']")).isEnabled();
		 List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio']"));
		 System.out.println("The number of radio button is "+radio.size());
		 String value="rd3";
		
		 for(WebElement radio1:radio)
		 {
			 String value1=radio1.getAttribute("value");
			 System.out.println(value1);
			 
			 if(value.equals(value1))
			 {
				 radio1.click();
				 System.out.println("Clicked " +radio1);
				 
			 }
			//	radio.get(i).click();
			 //}
		// }
		 
	}
	
	driver.quit();
			
}}
