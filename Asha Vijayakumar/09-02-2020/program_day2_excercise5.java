import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_day2_excercise5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("ashavijay");
		driver.findElement(By.name("user_password")).sendKeys("asha@12345");
		driver.findElement(By.name("first_name")).sendKeys("Asha");
		driver.findElement(By.name("last_name")).sendKeys("Vijayakumar");
		driver.findElement(By.name("email")).sendKeys("ashavijay97@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("sunshine");
		driver.findElement(By.name("user_login")).sendKeys("ashavijay");
		driver.findElement(By.name("city")).sendKeys("cochin");
		Select comp=new Select(driver.findElement(By.name("state_id")));
		comp.selectByVisibleText("Texas");
		driver.findElement(By.name("zip")).sendKeys("68314");
		driver.findElement(By.name("city")).sendKeys("cochin");
		Select comp1=new Select(driver.findElement(By.name("country_id")));
		comp1.selectByVisibleText("American Samoa");
		driver.findElement(By.name("phone_home")).sendKeys("2467892");
		driver.findElement(By.name("phone_work")).sendKeys("2455778");
		Select comp2=new Select(driver.findElement(By.name("language_id")));
		comp2.selectByVisibleText("English");
		Select comp3=new Select(driver.findElement(By.name("age_id")));
		comp3.selectByVisibleText("25-34");
		Select comp4=new Select(driver.findElement(By.name("gender_id")));
		comp4.selectByVisibleText("Female");
		Select comp5=new Select(driver.findElement(By.name("education_id")));
		comp5.selectByVisibleText("College");
		Select comp6=new Select(driver.findElement(By.name("income_id")));
		comp6.selectByVisibleText("under $25,000");
		driver.findElement(By.name("note")).sendKeys("hello");
		driver.findElement(By.name("Insert")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
