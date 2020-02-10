import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a31_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement email,password;
		email=driver.findElement(By.id("Email"));
		password=driver.findElement(By.id("Password"));
		email.sendKeys("user1");
		password.sendKeys("user1");
		WebElement link5=driver.findElement(By.id("small-searchterms"));
		link5.clear();
		link5.sendKeys("Books");
		WebElement search=driver.findElement(By.linkText("Search"));
		search.click();
		WebElement book=driver.findElement(By.linkText("BOOKS"));
		book.click();
		WebElement link4=driver.findElement(By.linkText("Add to cart"));
		link4.click();
		
	}

}
