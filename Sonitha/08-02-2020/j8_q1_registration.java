import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class j8_q1_registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		String a =driver.getTitle();
		String b ="Demo Web Shop";
		if(a.equalsIgnoreCase(b))
		System.out.println("Verified the title page");
		
		WebElement link = driver.findElement(By.linkText("Register"));
		link.click();
		
		String a1 =driver.getTitle();
		String b1 ="Demo Web Shop. Register";
		if(a1.equalsIgnoreCase(b1))
		System.out.println("Verified the title of the Register Page");
		//for radio button we use LIST
		List<WebElement> radio = driver.findElements(By.name("Gender"));
		radio.get(0).click();
		
		Random rand = new Random();
		
		driver.findElement(By.id("Email")).sendKeys("email"+rand.nextInt(100)+"@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("Sample firstname");
		driver.findElement(By.id("LastName")).sendKeys("Sample lastname");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.id("register-button")).click();
		
        driver.findElement(By.linkText("Log out")).click();
        Thread.sleep(5000);
        driver.quit();
	

	}

}
