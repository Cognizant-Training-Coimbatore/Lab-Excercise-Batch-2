import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

       
public class webdriver_testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://jpetstore.cfapps.io/");
			WebElement enterstore=driver.findElement(By.linkText("Enter the Store"));
		    enterstore.click();
			String s=driver.getTitle();
			System.out.println(s);
			driver.quit();


	}

}
