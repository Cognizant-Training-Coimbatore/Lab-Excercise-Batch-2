import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgrm5_practice_d8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		   driver.manage().window().maximize();
		   driver.findElement(By.name("user_login")).sendKeys("xyz");
		   driver.findElement(By.name("user_password")).sendKeys("password");
		   driver.findElement(By.name("first_name")).sendKeys("abc");
		   driver.findElement(By.name("last_name")).sendKeys("xyz");
		   driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
		   driver.findElement(By.name("address1")).sendKeys("flatnoabc");
		   driver.findElement(By.name("address2")).sendKeys("nehrulane");
		   driver.findElement(By.name("address3")).sendKeys("lane-3");
		   driver.findElement(By.name("city")).sendKeys("California");
		   Select combo1=new Select(driver.findElement(By.name("state_id")));
		   combo1.selectByVisibleText("Maryland");
		   driver.findElement(By.name("zip")).sendKeys("47665");
		   Select combo2=new Select(driver.findElement(By.name("country_id")));
		   combo2.selectByVisibleText("Albania");
		   driver.findElement(By.name("phone_home")).sendKeys("787899687");
		   driver.findElement(By.name("phone_work")).sendKeys("323767");
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
		   driver.findElement(By.name("note")).sendKeys("hi hello jklj");
		   driver.findElement(By.name("Insert")).click();
		   Thread.sleep(5000);
		   driver.quit();
		   
		   
		   
	}

}
