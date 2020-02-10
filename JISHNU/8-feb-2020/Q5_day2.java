import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5_day2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("jishnu");
		driver.findElement(By.name("user_password")).sendKeys("jishnu123");
		driver.findElement(By.name("first_name")).sendKeys("jishnu");
		driver.findElement(By.name("last_name")).sendKeys("devadas");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("jishnudevadas@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("ABC House");
		driver.findElement(By.name("address2")).sendKeys("Taliparamba");
		driver.findElement(By.name("address3")).sendKeys("Kannur");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Kannur");
		Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("Alaska");
		driver.findElement(By.name("zip")).sendKeys("67459");
		Thread.sleep(1000);
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("Argentina");
		driver.findElement(By.name("phone_home")).sendKeys("22367546");
		driver.findElement(By.name("phone_work")).sendKeys("98738832");
		Select language=new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		Thread.sleep(1000);
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("25-34");
		Thread.sleep(1000);
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Male");
		Select education=new Select(driver.findElement(By.name("education_id")));
		education.selectByVisibleText("College");
		Thread.sleep(1000);
		Select income=new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("over $75,000");
		Thread.sleep(1000);
		driver.findElement(By.name("note")).sendKeys("None");
		Thread.sleep(1000);
		driver.findElement(By.name("Insert")).click();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
