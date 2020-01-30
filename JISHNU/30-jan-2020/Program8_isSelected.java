import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program8_isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login= driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement remember = driver.findElement(By.name("RememberMe"));
		boolean res=remember.isSelected();
		if(res==true)
		{
			System.out.println("Already selected!");
		}
		else {
			System.out.println("Not selected.. selecting now");
			remember.click();
			Thread.sleep(4000);
		}
		driver.quit();
	}

}
