package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class feb8_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String s1=driver.getTitle();
		System.out.println(s1);
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		int l=combo1.getOptions().size();
		System.out.println("total values = "+l);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
