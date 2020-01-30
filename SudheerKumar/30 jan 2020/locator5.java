import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("login"));
		login.click();
		WebElement rememberme=driver.findElement(By.name("RememberMe"));
		boolean res=rememberme.isSelected();
		if(res==true)
		{
			System.out.println("already selected");// TODO Auto-generated method stub
		}
		else
		{
			System.out.println("not selected....selecting now");
			rememberme.click();
			
		}
	}

}
