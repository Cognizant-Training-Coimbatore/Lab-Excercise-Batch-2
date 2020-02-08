package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class feb8_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("stani123");
		driver.findElement(By.name("user_password")).sendKeys("stani123");
		driver.findElement(By.name("first_name")).sendKeys("stani");
		driver.findElement(By.name("last_name")).sendKeys("stani");
		driver.findElement(By.name("email")).sendKeys("stani12@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("house");
		driver.findElement(By.name("address2")).sendKeys("post");
		driver.findElement(By.name("address3")).sendKeys("pin");
		driver.findElement(By.name("city")).sendKeys("kottayam");
		Select combo1=new Select(driver.findElement(By.name("state_id")));
		combo1.selectByVisibleText("Texas");
		driver.findElement(By.name("zip")).sendKeys("68610");
		Select combo2=new Select(driver.findElement(By.name("country_id")));
		combo2.selectByVisibleText("American Samoa");
		driver.findElement(By.name("phone_home")).sendKeys("68610421");
		driver.findElement(By.name("phone_work")).sendKeys("68610454");
		Select combo3=new Select(driver.findElement(By.name("language_id")));
		combo3.selectByVisibleText("English");
		Select combo4=new Select(driver.findElement(By.name("age_id")));
		combo4.selectByVisibleText("25-34");
		Select combo5=new Select(driver.findElement(By.name("gender_id")));
		combo5.selectByVisibleText("Male");
		Select combo6=new Select(driver.findElement(By.name("education_id")));
		combo6.selectByVisibleText("College");
		Select combo7=new Select(driver.findElement(By.name("income_id")));
		combo7.selectByVisibleText("over $75,000");
		driver.findElement(By.name("note")).sendKeys("hello");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[21]/td/input[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
