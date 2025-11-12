package javatask10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerAutomation {
	
	    public static void main(String[] args) throws InterruptedException {
	        

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://jqueryui.com/datepicker/");
	        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	        WebElement dateField = driver.findElement(By.id("datepicker"));
	        dateField.click();

	        WebElement nextButton = driver.findElement(By.xpath("//a[@data-handler='next']"));
	        nextButton.click();
	        WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
	        dateToSelect.click();
	        String selectedDate = dateField.getAttribute("value");
	        System.out.println("Selected Date: " + selectedDate);

	   
	        driver.quit();
	    }
	}


