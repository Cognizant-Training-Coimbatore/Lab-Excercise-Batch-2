import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BROWSER_PROGRAM_REMEMBER_ME {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		WebElement rememberme=driver.findElement(By.name("RememberMe"));
		boolean res=rememberme.isSelected();
		if(res==true)
		{
			System.out.println("Already selected");
			
		}
		else
		{
			System.out.println("not selected....Selecting now");
			rememberme.click();
			Thread.sleep(5000);
		}
		driver.quit();
		
			
		}
	}


