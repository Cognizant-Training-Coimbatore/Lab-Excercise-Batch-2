package feb1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		int i=0;
		for(i=0;i<5;i++)
		{
			String username;
			Random rand= new Random();
			int ranmdomnumber=rand.nextInt(1000);
			username="user"+ ranmdomnumber+ "@gamil.com";
			System.out.println(username);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("firstname1");
			driver.findElement(By.id("LastName")).sendKeys("lastname1");
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.name("Password")).sendKeys("123456$");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("123456$");
			driver.findElement(By.name("register-button")).click();
			driver.findElement(By.linkText("Log out")).click();
			
		}
		driver.quit();

	}

}