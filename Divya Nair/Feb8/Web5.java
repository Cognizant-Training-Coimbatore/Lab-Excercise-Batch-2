import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("user_login")).sendKeys("Divya_n");
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.name("first_name")).sendKeys("Divya");
		Thread.sleep(1000);
		driver.findElement(By.name("last_name")).sendKeys("Nair");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("divya@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("Usha hostel Sravanampatti");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Ernakulam");
		Thread.sleep(1000);
		Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("Georgia");
		Thread.sleep(1000);
		driver.findElement(By.name("zip")).sendKeys("7234561240");
		Thread.sleep(1000);
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_home")).sendKeys("9807654310");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_work")).sendKeys("9807654320");
		Thread.sleep(1000);
		Select language=new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		Thread.sleep(1000);
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByIndex(4);
		Thread.sleep(1000);
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByIndex(2);
		Thread.sleep(1000);
		Select education=new Select(driver.findElement(By.name("education_id")));
		education.selectByIndex(1);
		Thread.sleep(1000);
		Select income=new Select(driver.findElement(By.name("income_id")));
		income.selectByIndex(4);
		Thread.sleep(1000);
		driver.findElement(By.name("note")).sendKeys("I am Great");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.name("Insert"));
		submit.click();
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
