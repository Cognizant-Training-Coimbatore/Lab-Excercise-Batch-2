import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_day2_exercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Asha");
		driver.findElement(By.id("LastName")).sendKeys("Vijayakumar");
		driver.findElement(By.id("Email")).sendKeys("ashavijay97@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ashaarun@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ashaarun@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
