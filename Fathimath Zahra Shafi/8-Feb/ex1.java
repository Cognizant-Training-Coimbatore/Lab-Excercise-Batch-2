import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		String expected="Demo Web Shop";
		System.out.println(driver.getTitle());
		if(expected.equals(driver.getTitle()))
			System.out.println("title matches");
		else
			System.out.println("title does not match");
		
	
		
	 driver.findElement(By.linkText("Register")).click(); 
	 
	 String exp ="Demo Web Shop. Register";
	 System.out.println(driver.getTitle());
	 if(exp.equals(driver.getTitle()))
			System.out.println("title matches");
		else
			System.out.println("title does not match");
		
	
	 
	 
	 
	 List<WebElement> radio1= driver.findElements(By.name("Gender"));
	 radio1.get(0).click();
	 
	 
	 driver.findElement(By.id("FirstName")).sendKeys("Fathima");
	 driver.findElement(By.id("LastName")).sendKeys("Zahra");
	 driver.findElement(By.id("Email")).sendKeys("fathimazahra3@gmail.com");
	 
	 
	 driver.findElement(By.id("Password")).sendKeys("pass123$");
	 driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");

	 driver.findElement(By.id("register-button")).click(); 
	 
	 driver.findElement(By.linkText("Log out")).click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	 
	 

	 Thread.sleep(5000);
	 
		driver.quit();
		
		

	}

}
