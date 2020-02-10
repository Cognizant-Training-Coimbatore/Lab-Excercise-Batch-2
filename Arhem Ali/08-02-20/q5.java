package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("arhem");
		driver.findElement(By.name("user_password")).sendKeys("arhem1");
		driver.findElement(By.name("first_name")).sendKeys("arhem");
		driver.findElement(By.name("last_name")).sendKeys("ali");
		driver.findElement(By.name("email")).sendKeys("arhem.ali10@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("stvincent colony, calicut,kerala");
		
		driver.findElement(By.name("city")).sendKeys("thudiyallur");
		Select s= new Select(driver.findElement(By.name("state_id")));
		s.selectByVisibleText("Alabama");
		driver.findElement(By.name("zip")).sendKeys("12345");
		Select f= new Select(driver.findElement(By.name("country_id")));
		f.selectByVisibleText("Bahrain");
		driver.findElement(By.name("phone_home")).sendKeys("mm");
		driver.findElement(By.name("phone_work")).sendKeys("mm");
		Select p= new Select(driver.findElement(By.name("language_id")));
		p.selectByVisibleText("Chinese");
		Select o= new Select(driver.findElement(By.name("age_id")));
		o.selectByVisibleText("25-34");
		Select e= new Select(driver.findElement(By.name("gender_id")));
		e.selectByVisibleText("Male");
		Select y= new Select(driver.findElement(By.name("education_id")));
		y.selectByVisibleText("College");
		Select a= new Select(driver.findElement(By.name("income_id")));
		a.selectByVisibleText("over $75,000");
		driver.findElement(By.name("note")).sendKeys("top");
		driver.findElement(By.name("Insert")).click();
		driver.quit();
		
		
		

	}

}
