package javatask9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchQueryValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("searchInput"));
		search.sendKeys("Artificial Intelligence");
		search.submit();
		Thread.sleep(3000);
		WebElement history=driver.findElement(By.xpath("//a[contains(@href, '#History')]"));
		history.click();
		Thread.sleep(3000);
		String sectiontitle=driver.findElement(By.id("History")).getText();
		System.out.println(sectiontitle);
		driver.close();
		driver.quit();
	}

}
