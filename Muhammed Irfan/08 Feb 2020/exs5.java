package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exs5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
	
		driver.findElement(By.name("user_login")).sendKeys("User Name");
		driver.findElement(By.name("user_password")).sendKeys("asd22@123");
		driver.findElement(By.name("first_name")).sendKeys("Muhammed");
		driver.findElement(By.name("last_name")).sendKeys("Irfan");
		driver.findElement(By.name("address1")).sendKeys("Perekkattil");
		driver.findElement(By.name("address2")).sendKeys("U C College");
		driver.findElement(By.name("address3")).sendKeys("Aluva");
		driver.findElement(By.name("city")).sendKeys("Kochi");
		Select a1= new Select(driver.findElement(By.name("state_id")));
		a1.selectByVisibleText("Alaska");
		
		driver.findElement(By.name("zip")).sendKeys("683102");
		Select a2= new Select(driver.findElement(By.name("country_id")));
		a2.selectByVisibleText("India");
		
		driver.findElement(By.name("phone_home")).sendKeys("9893536327");
		driver.findElement(By.name("phone_work")).sendKeys("2343536327");
	
		Select a3= new Select(driver.findElement(By.name("language_id")));
		a3.selectByVisibleText("English");
		
		Select a4= new Select(driver.findElement(By.name("age_id")));
		a4.selectByVisibleText("18-24");
		
		Select a5= new Select(driver.findElement(By.name("gender_id")));
		a5.selectByVisibleText("Male");
		
		Select a6= new Select(driver.findElement(By.name("education_id")));
		a6.selectByVisibleText("College");
		
		Select a7= new Select(driver.findElement(By.name("income_id")));
		a7.selectByVisibleText("$25,000 - $34,000");
		driver.findElement(By.name("note")).sendKeys("Awesome");
		driver.findElement(By.name("Insert")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
