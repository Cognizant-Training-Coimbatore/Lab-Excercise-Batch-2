import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("http://demowebshop.tricentis.com/");
 homepage home=new homepage(driver);
 home.clicklogin();
 login_page login=new login_page(driver);
 login.enterusername("anjana");
 login.enterpassword("111233");
 driver.quit();
	}

}
