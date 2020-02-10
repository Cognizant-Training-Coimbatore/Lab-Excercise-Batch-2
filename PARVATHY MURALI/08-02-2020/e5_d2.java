package project_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e5_d2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("user_login")).sendKeys("Parvathy");
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys("1234534");
		Thread.sleep(1000);
		driver.findElement(By.name("first_name")).sendKeys("Parvathy");
		Thread.sleep(1000);
		driver.findElement(By.name("last_name")).sendKeys("Murali");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("Parvathym@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("Usha hostel Sravanampatti");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Coimbatore");
		Thread.sleep(1000);
		Select state=new Select(driver.findElement(By.name("state_id")));
		state.selectByVisibleText("Hawaii");
		Thread.sleep(1000);
		driver.findElement(By.name("zip")).sendKeys("4667889222");
		Thread.sleep(1000);
		Select country=new Select(driver.findElement(By.name("country_id")));
		country.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_home")).sendKeys("9807654310");
		Thread.sleep(1000);
		driver.findElement(By.name("phone_work")).sendKeys("9807654399");
		Thread.sleep(1000);
		Select language=new Select(driver.findElement(By.name("language_id")));
		language.selectByVisibleText("English");
		Thread.sleep(1000);
		Select age=new Select(driver.findElement(By.name("age_id")));
		age.selectByIndex(4);
		Thread.sleep(1000);
		Select gender=new Select(driver.findElement(By.name("gender_id")));
		gender.selectByIndex(1);
		Thread.sleep(1000);
		Select education=new Select(driver.findElement(By.name("education_id")));
		education.selectByIndex(1);
		Thread.sleep(1000);
		Select income=new Select(driver.findElement(By.name("income_id")));
		income.selectByIndex(3);
		Thread.sleep(1000);
		driver.findElement(By.name("note")).sendKeys("Hey Selenium");
		Thread.sleep(1000);
		WebElement submit=driver.findElement(By.name("Insert"));
		submit.click();
		driver.quit();

	}

}
