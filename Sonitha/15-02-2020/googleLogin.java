import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("sakfahf");
		 driver.findElement(By.id("identifierNext")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.id("passwordNext")).click();
		  Thread.sleep(5000);  
	}

}
