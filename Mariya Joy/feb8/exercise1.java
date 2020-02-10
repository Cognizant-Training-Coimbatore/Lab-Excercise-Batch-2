package basic_commands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class exercise1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Java programs\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Mariya");
		driver.findElement(By.name("LastName")).sendKeys("Joy");
		driver.findElement(By.name("Email")).sendKeys("aswathijoy.1997@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("pass123$");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("pass123$");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(10000);
		driver.quit();
	}

}
