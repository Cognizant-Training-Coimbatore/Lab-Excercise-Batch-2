package java_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class qn_5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("user_password")).sendKeys("aparna@45");
		Thread.sleep(2000);
		driver.findElement(By.name("first_name")).sendKeys("Aparna");
		Thread.sleep(2000);
		driver.findElement(By.name("last_name")).sendKeys("Augustine");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("aparna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("nest california");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("california");
		Thread.sleep(2000);
        Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("California");
		Thread.sleep(2000);
		driver.findElement(By.name("zip")).sendKeys("34567");
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("India");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_home")).sendKeys("3456767");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_work")).sendKeys("34567");
		Thread.sleep(2000);
		Select language=new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		Thread.sleep(2000);
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("18-24");
		Thread.sleep(2000);
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Female");
		Thread.sleep(2000);
		Select edu=new Select(driver.findElement(By.name("education_id")));
		edu.selectByVisibleText("College");
		Thread.sleep(2000);
		Select inc=new Select(driver.findElement(By.name("income_id")));
		inc.selectByVisibleText("$25,000 - $34,000");
		Thread.sleep(2000);
		driver.findElement(By.name("note")).sendKeys("I like watching movies");
		Thread.sleep(2000);
		driver.findElement(By.name("Insert")).click();;
		Thread.sleep(2000);
		driver.quit();
	}

}
