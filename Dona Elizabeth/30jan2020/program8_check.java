import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program8_check {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		Thread.sleep(3000);
		WebElement rem=driver.findElement(By.name("RememberMe"));
		boolean res=rem.isSelected();
		if(res==true)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected... Selecting now");
			rem.click();
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
