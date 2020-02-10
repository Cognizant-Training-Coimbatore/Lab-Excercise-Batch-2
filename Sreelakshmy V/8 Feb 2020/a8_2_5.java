package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a8_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
				driver.findElement(By.name("user_login")).sendKeys("Sree");
				driver.findElement(By.name("user_password")).sendKeys("1234@");
				driver.findElement(By.name("first_name")).sendKeys("Sreelakshmi");
				driver.findElement(By.name("last_name")).sendKeys("V");
				driver.findElement(By.name("email")).sendKeys("sreelakshmivinob@gmail.com");
				driver.findElement(By.name("address1")).sendKeys("qwedrftgyhujklkjnhbgvfcd");
				driver.findElement(By.name("city")).sendKeys("Coimbatore");
				Select combo1=new Select(driver.findElement(By.name("state_id")));
				combo1.selectByVisibleText("Indiana");
				driver.findElement(By.name("zip")).sendKeys("1234566896");
				Select combo2=new Select(driver.findElement(By.name("country_id")));
				combo2.selectByVisibleText("Baker Island");
				driver.findElement(By.name("phone_home")).sendKeys("1234567890");
				driver.findElement(By.name("phone_work")).sendKeys("1234565656");			
				Select combo3=new Select(driver.findElement(By.name("language_id")));
				combo3.selectByVisibleText("English");
				Select combo4=new Select(driver.findElement(By.name("age_id")));
				combo4.selectByVisibleText("18-24");
				Select combo5=new Select(driver.findElement(By.name("gender_id")));
				combo5.selectByVisibleText("Female");
				Select combo6=new Select(driver.findElement(By.name("education_id")));
				combo6.selectByVisibleText("College");
				Select combo7=new Select(driver.findElement(By.name("income_id")));
				combo7.selectByVisibleText("$25,000 - $34,000");
				driver.findElement(By.name("note")).sendKeys("CTS EMployee");
				driver.findElement(By.name("Insert")).click();
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
