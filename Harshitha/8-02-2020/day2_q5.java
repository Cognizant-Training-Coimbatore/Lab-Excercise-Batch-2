import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_q5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("LBT15IT");
		driver.findElement(By.name("user_password")).sendKeys("zxcvbnm");
		driver.findElement(By.name("first_name")).sendKeys("Anju");
		driver.findElement(By.name("last_name")).sendKeys("Kurian");
		driver.findElement(By.name("email")).sendKeys("anjukurian@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("qwert");
		driver.findElement(By.name("address2")).sendKeys("mnbv");
		driver.findElement(By.name("address3")).sendKeys("asdf");
		driver.findElement(By.name("city")).sendKeys("uhbnjiokm");
		Select cb1=new Select(driver.findElement(By.name("state_id")));
		cb1.selectByVisibleText("Alabama");
		driver.findElement(By.name("zip")).sendKeys("12345");
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("Argentina");
		driver.findElement(By.name("phone_home")).sendKeys("22345678");
		driver.findElement(By.name("phone_work")).sendKeys("09876544321");
		driver.findElement(By.name("city")).sendKeys("uhbnjiokm");
		Select lang=new Select(driver.findElement(By.name("language_id")));
		lang.selectByVisibleText("English");
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("18-24");
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Female");
		Select education=new Select(driver.findElement(By.name("education_id")));
		education.selectByVisibleText("College");
		Select income=new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("$50,000 - $74,000");
		driver.findElement(By.name("note")).sendKeys("Hi!!!I am Anju");
		driver.findElement(By.name("Insert")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
