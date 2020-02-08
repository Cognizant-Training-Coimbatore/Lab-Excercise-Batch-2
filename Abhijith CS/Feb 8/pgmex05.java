import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgmex05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("User1");
		driver.findElement(By.name("user_password")).sendKeys("Pass123#");
		driver.findElement(By.name("first_name")).sendKeys("Abhijith");
		driver.findElement(By.name("last_name")).sendKeys("C S");
		driver.findElement(By.name("email")).sendKeys("abhi@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Rose villa");
		driver.findElement(By.name("address2")).sendKeys("Muvattupuzha");
		driver.findElement(By.name("address3")).sendKeys("Kerala");
		driver.findElement(By.name("city")).sendKeys("Muvattupuzha");
		Select comb= new Select(driver.findElement(By.name("state_id")));
		comb.selectByIndex(1);
		driver.findElement(By.name("zip")).sendKeys("68666");
		Select comb1= new Select(driver.findElement(By.name("country_id")));
		comb1.selectByIndex(1);
		driver.findElement(By.name("phone_home")).sendKeys("0213457");
		driver.findElement(By.name("phone_work")).sendKeys("156454965");
		Select comb2= new Select(driver.findElement(By.name("language_id")));
		comb2.selectByIndex(1);
		Select comb3= new Select(driver.findElement(By.name("age_id")));
		comb3.selectByIndex(1);
		Select comb4= new Select(driver.findElement(By.name("gender_id")));
		comb4.selectByIndex(1);
		Select comb5= new Select(driver.findElement(By.name("education_id")));
		comb5.selectByIndex(1);
		Select comb6= new Select(driver.findElement(By.name("income_id")));
		comb6.selectByIndex(1);
		driver.findElement(By.name("note")).sendKeys("duygfff9uhg8ygf9-8ugfadfa9ug8ysdfga9igasad9g9ausdg");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[21]/td/input[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
