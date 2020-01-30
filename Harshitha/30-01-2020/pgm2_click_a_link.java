import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2_click_a_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver","chromedriver.exe");//to launch browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");//webpage to be opened
		WebElement login=driver.findElement(By.linkText("Log in"));//for clicking link
		login.click();
		String s=driver.getTitle();//to get title of the page
		System.out.println(s);
		driver.quit();
	}

}
