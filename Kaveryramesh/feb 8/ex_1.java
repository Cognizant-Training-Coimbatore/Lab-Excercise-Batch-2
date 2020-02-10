package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\javaprograms\\selenium_examples\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("http://demowebshop.tricentis.com/");
		WebElement link1=driver.findElement(By.linkText("Register"));
		link1.click();
		String title=driver.getTitle();
	    String rtitle="Demo Web Shop. Register";
		if(title.equals(rtitle)==true)
		{
			System.out.println("verified");
		}		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("kavery");
		driver.findElement(By.id("LastName")).sendKeys("Ramesh");
		driver.findElement(By.id("Email")).sendKeys("kaveryramesh12345@gamil.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		WebElement link2=driver.findElement(By.linkText("Log out"));
		link2.click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
