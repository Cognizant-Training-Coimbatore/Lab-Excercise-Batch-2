import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lab_exc_5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("logininaccept");
		driver.findElement(By.name("user_password")).sendKeys("thisisokay");
		driver.findElement(By.name("first_name")).sendKeys("Amith");
		driver.findElement(By.name("last_name")).sendKeys("C");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("majerikuth house");
		driver.findElement(By.name("address2")).sendKeys("palappatta");
		driver.findElement(By.name("address3")).sendKeys("malappuram");
		driver.findElement(By.name("city")).sendKeys("edvanna");
		Select sel =new Select(driver.findElement(By.name("state_id")));
		sel.selectByVisibleText("Texas");
		driver.findElement(By.name("zip")).sendKeys("87867");
		Select sel2 =new Select(driver.findElement(By.name("country_id")));
		sel2.selectByVisibleText("United States");
		driver.findElement(By.name("phone_home")).sendKeys("09777565788");
		driver.findElement(By.name("phone_work")).sendKeys("763797382");
		Select sel3 =new Select(driver.findElement(By.name("language_id")));
		sel3.selectByVisibleText("English");
		Select sel4 =new Select(driver.findElement(By.name("age_id")));
		sel4.selectByVisibleText("18-24");
		Select sel5 =new Select(driver.findElement(By.name("gender_id")));
		sel5.selectByVisibleText("Male");
		Select sel6 =new Select(driver.findElement(By.name("education_id")));
		sel6.selectByVisibleText("College");
		Select sel7 =new Select(driver.findElement(By.name("income_id")));
		sel7.selectByIndex(2);
		driver.findElement(By.name("note")).sendKeys("i am goooood");
		Thread.sleep(5000);
		driver.findElement(By.name("Insert")).click();;
		Thread.sleep(3000);
		driver.quit();
		

	}

}
