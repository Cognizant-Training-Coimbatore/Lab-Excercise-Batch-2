import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgrm1_practice_d8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com");
		   if(driver.getTitle().equalsIgnoreCase("Demo Web shop"))
			 
		   System.out.println("Title verified");
		   WebElement link1=driver.findElement(By.linkText("Register"));
		   link1.click();
		   if(driver.getTitle().equalsIgnoreCase("Demo Web Shop. Register"))
				 System.out.println("verified");
		   List<WebElement> radio1=driver.findElements(By.name("Gender"));
		   radio1.get(0).click();
		   driver.findElement(By.name("FirstName")).sendKeys("xyz");
		   driver.findElement(By.name("LastName")).sendKeys("ghjkl");
		   driver.findElement(By.id("Email")).sendKeys("msdgopz777@yahoo.com");
		   driver.findElement(By.id("Password")).sendKeys("pass123$1");
		   driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$1");
		   driver.findElement(By.id("register-button")).click();
		   driver.findElement(By.linkText("Log out")).click();
		   
		   
		   Thread.sleep(5000);
		   driver.quit();


	}

}
