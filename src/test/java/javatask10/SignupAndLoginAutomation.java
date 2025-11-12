package javatask10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignupAndLoginAutomation {
	
	    public static void main(String[] args) throws InterruptedException {

	       
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	     driver.get("https://www.guvi.in/");
	        WebElement signupButton = driver.findElement(By.xpath("//a[text()='Sign up']"));
	        signupButton.click();
	        Thread.sleep(3000);
	        WebElement nameField = driver.findElement(By.id("name"));
	        nameField.sendKeys("TestPooja");

	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys("testuser8796" + "@google.com");

	        WebElement passwordField = driver.findElement(By.id("password"));
	        passwordField.sendKeys("Test@1234");
	        WebElement mobileField = driver.findElement(By.id("mobileNumber"));
            mobileField.sendKeys("9872943210");
	        WebElement submitSignup = driver.findElement(By.id("signup-btn"));
	        submitSignup.click();
	        Thread.sleep(5000);
	       // WebElement maybeLater = driver.findElement(By.xpath("//a[text()='Maybe later']"));
	       // maybeLater.click();
	        String signupTitle = driver.getTitle();
	        System.out.println("Signup Page Title: " + signupTitle);
	        

	       
	        driver.get("https://www.guvi.in/");
	        Thread.sleep(5000);
	        WebElement loginButton = driver.findElement(By.linkText("Login"));
	        loginButton.click();
	        Thread.sleep(3000);

	     
	        WebElement loginEmail = driver.findElement(By.id("email"));
	        loginEmail.sendKeys("testuser8796@google.com"); 

	        WebElement loginPassword = driver.findElement(By.id("password"));
	        loginPassword.sendKeys("Test@1234");

	      
	        WebElement submitLogin = driver.findElement(By.id("login-btn"));
	        submitLogin.click();

	        
	        Thread.sleep(5000);
	        String loginTitle = driver.getTitle();
	        System.out.println("Login Page Title: " + loginTitle);

	        if (!loginTitle.contains("Login")) {
	            System.out.println(" Login successful!");
	        } else {
	            System.out.println(" Login Failed!");
	        }

	        // Close browser
	        driver.quit();
	    }
	}



