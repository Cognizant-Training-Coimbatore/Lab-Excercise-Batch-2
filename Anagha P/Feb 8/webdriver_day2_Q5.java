package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriver_day2_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe" );		
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		WebElement login,password,first,last,address,city,email,zip,homeph,workph,yourself;
		login=driver.findElement(By.name("user_login"));
		login.sendKeys("arjun123");
		password=driver.findElement(By.name("user_password"));
		password.sendKeys("pass123$");
		first=driver.findElement(By.name("first_name"));
		first.sendKeys("Arjun");
		last=driver.findElement(By.name("last_name"));
		last.sendKeys("P");
		email=driver.findElement(By.name("email"));
		email.sendKeys("arjun123@gmail.com");
		address=driver.findElement(By.name("address1"));
		address.sendKeys("flat101,kottayam,oppo.loogos jun");
		city=driver.findElement(By.name("email"));
		city.sendKeys("canada");
		Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("Kansas");
		zip=driver.findElement(By.name("zip"));
		zip.sendKeys("2345");
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("Kenya");
		homeph=driver.findElement(By.name("phone_home"));
		homeph.sendKeys("9947346871");
		workph=driver.findElement(By.name("phone_work"));
		workph.sendKeys("9207117706");
		Select lan=new Select(driver.findElement(By.name("language_id")));
		lan.selectByVisibleText("English");
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("25-34");
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Male");
		Select education=new Select(driver.findElement(By.name("education_id")));
		education.selectByVisibleText("College");
		Select income=new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("over $75,000");
		yourself=driver.findElement(By.name("note"));
		yourself.sendKeys("Pshghasgdshdghghsagcggahgchchgjhahgcahhsahhcagchg");
		
	}

}
