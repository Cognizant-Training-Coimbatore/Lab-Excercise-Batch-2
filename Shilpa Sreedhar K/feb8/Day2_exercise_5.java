package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_exercise_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_login")).sendKeys("Helen");
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys("Helen@123");
		Thread.sleep(2000);
		driver.findElement(By.name("first_name")).sendKeys("Helen");
		Thread.sleep(2000);
		driver.findElement(By.name("last_name")).sendKeys("Mariyam");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Helenmariyam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("Flat no 12 D");
		Thread.sleep(2000);
		driver.findElement(By.name("address2")).sendKeys("skyline Apartments");
		Thread.sleep(2000);
		driver.findElement(By.name("address3")).sendKeys("Disneyland");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Los Angeles");
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("California");
		Thread.sleep(2000);
		driver.findElement(By.name("zip")).sendKeys("123456");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("United States");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_home")).sendKeys("1234567");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_work")).sendKeys("3123456");
		Thread.sleep(2000);
		Select lang=new Select(driver.findElement(By.name("language_id")));
		lang.selectByVisibleText("English");
		Thread.sleep(2000);
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("13-17");
		Thread.sleep(2000);
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Female");
		Thread.sleep(2000);
		Select edu=new Select(driver.findElement(By.name("education_id")));
		edu.selectByVisibleText("Graduate School");
		Thread.sleep(2000);
		Select income=new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("over $75,000");
		Thread.sleep(2000);
		driver.findElement(By.name("note")).sendKeys("Hi selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("Insert")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
