package Webdriver_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		System.out.println("Titel\t:\t"+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.name("user_login")).sendKeys("JijoAJ");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.name("first_name")).sendKeys("Jijo");
		driver.findElement(By.name("last_name")).sendKeys("AJ");
		driver.findElement(By.name("email")).sendKeys("JijoAJ@mail.com");
		driver.findElement(By.name("address1")).sendKeys("ABC");
		driver.findElement(By.name("address2")).sendKeys("DEF");
		driver.findElement(By.name("address3")).sendKeys("GHI");
		driver.findElement(By.name("city")).sendKeys("Kochi");
		Select state= new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("California");

		
		driver.findElement(By.name("zip")).sendKeys("641246");
		
		Select country= new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("Austria");
		
		driver.findElement(By.name("phone_home")).sendKeys("9283579238");
		driver.findElement(By.name("phone_work")).sendKeys("9234569238");
		
		Select language= new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		
		Select age= new Select(driver.findElement(By.name("age_id")));
		age.selectByVisibleText("18-24");
		
		Select gender= new Select(driver.findElement(By.name("gender_id")));
		gender.selectByVisibleText("Male");
		
		Select edu= new Select(driver.findElement(By.name("education_id")));
		edu.selectByVisibleText("Other");
		
		Select income= new Select(driver.findElement(By.name("income_id")));
		income.selectByVisibleText("over $75,000");
		
		
		driver.findElement(By.name("note")).sendKeys("Form registered succesfully!!");
		Thread.sleep(5000);
		driver.findElement(By.name("Insert")).click();
		Thread.sleep(5000);
		driver.quit();
	
	}

}
