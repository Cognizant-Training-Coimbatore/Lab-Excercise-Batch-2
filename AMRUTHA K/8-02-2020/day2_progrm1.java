import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_progrm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.linkText("Register")).click();
	    System.out.println(driver.getTitle());
	   List<WebElement>ob=driver.findElements(By.name("Gender"));
	   
	   ob.get(0).click();
	   driver.findElement(By.id("FirstName")).sendKeys(" Sample firstname ");
	   driver.findElement(By.id("LastName")).sendKeys(" Sample laststname ");
	   driver.findElement(By.id("Email")).sendKeys("amruthamurali97rk@gmail.com");
	   driver.findElement(By.id("Password")).sendKeys("  pass123$  ");
	   driver.findElement(By.id("ConfirmPassword")).sendKeys("  pass123$  ");
	   driver.findElement(By.id("register-button")).click();
	   driver.findElement(By.linkText("Log out"));
	   
	    Thread.sleep(2000);
	    driver.quit();

	}

}
