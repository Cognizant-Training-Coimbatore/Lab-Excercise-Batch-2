import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		 driver.findElement(By.name("user_login")).sendKeys("fathimazahra");
		 driver.findElement(By.name("user_password")).sendKeys("fathima123");
		 
		 driver.findElement(By.name("first_name")).sendKeys("Fathima");
		 driver.findElement(By.name("last_name")).sendKeys("Zahra");
		
		 driver.findElement(By.name("email")).sendKeys("fathimazahra@gmail.com");
		 
		 driver.findElement(By.name("address1")).sendKeys("Krishh Brindavan, Thudiyalur Road");
		 driver.findElement(By.name("address2")).sendKeys("Saravanampatti");
		 driver.findElement(By.name("city")).sendKeys("Coimbatore");
		 Select op=new Select(driver.findElement(By.name("state_id")));
			op.selectByVisibleText("Alaska");
			 driver.findElement(By.name("zip")).sendKeys("68201");
			 driver.findElement(By.name("country_id")).sendKeys("United States");
			 
			 driver.findElement(By.name("phone_home")).sendKeys("04842391541");
			 driver.findElement(By.name("phone_work")).sendKeys("04842561566");
			 
			 Select opt=new Select(driver.findElement(By.name("language_id")));
				opt.selectByVisibleText("English");

				 Select ops=new Select(driver.findElement(By.name("age_id")));
					ops.selectByVisibleText("18-24");

					 Select opn=new Select(driver.findElement(By.name("gender_id")));
						opn.selectByVisibleText("Female");
						
						Select opa=new Select(driver.findElement(By.name("education_id")));
						opa.selectByVisibleText("College");

						Select opk=new Select(driver.findElement(By.name("income_id")));
						opk.selectByVisibleText("over $75,000");
						
						
						 driver.findElement(By.name("note")).sendKeys("I am a very friendly person");
						
						 driver.findElement(By.name("Insert")).click();
						Thread.sleep(5000);
						
						

		
		
		
	}

}
