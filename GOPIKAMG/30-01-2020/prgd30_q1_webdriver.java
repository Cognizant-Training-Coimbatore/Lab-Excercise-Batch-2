import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prgd30_q1_webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		{
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			  WebDriver driver=new ChromeDriver();
			  driver.get("http://jpetstore.cfapps.io/");
			  WebElement login=driver.findElement(By.linkText("Enter the Store"));
			  login.click();
			  String s =driver.getTitle();
			  System.out.println(s);
			  Thread.sleep(5000);
			  driver.quit();
	}

}
}