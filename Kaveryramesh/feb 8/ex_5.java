package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\javaprograms\\selenium_examples\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		driver.findElement(By.name("user_login")).sendKeys("kaveryramesh12345");
		driver.findElement(By.name("user_password")).sendKeys("pass123$");
		driver.findElement(By.name("first_name")).sendKeys("kavery");
		driver.findElement(By.name("last_name")).sendKeys("Ramesh");
		driver.findElement(By.name("email")).sendKeys("kaveryramesh12345@gamil.com");
		driver.findElement(By.name("address1")).sendKeys("Midhunam,chalakkara roard");
		driver.findElement(By.name("address2")).sendKeys("padamugal,kakkanad");
		driver.findElement(By.name("address3")).sendKeys("ernakulam,kerala");
		driver.findElement(By.name("city")).sendKeys("kochi");
		Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("New Jersey");
		driver.findElement(By.name("zip")).sendKeys("68203");
		Select india=new Select(driver.findElement(By.name("country_id")));
		india.selectByVisibleText("India");
		driver.findElement(By.name("phone_home")).sendKeys("22356");
		driver.findElement(By.name("phone_work")).sendKeys("887543");
		Select language=new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("18-24");
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Female");
		Select edu=new Select(driver.findElement(By.name("education_id")));
		edu.selectByVisibleText("College");
		Select income =new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("over $75,000");
		driver.findElement(By.name("note")).sendKeys("heyy");
		driver.findElement(By.name("Insert")).click();
		
		
		
		
		
	}

}
