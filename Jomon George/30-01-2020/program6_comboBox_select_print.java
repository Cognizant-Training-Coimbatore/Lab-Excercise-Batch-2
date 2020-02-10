package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program6_comboBox_select_print {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String inputURL = "http://examples.codecharge.com/Store/Default.php";
		driver.get(inputURL);
		
		Select product = new Select(driver.findElement(By.name("category_id")));
		
		int size = product.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(5000);
			String S = product.getFirstSelectedOption().getText();
			System.out.println(S);
		}
		
//		Thread.sleep(5000);
		driver.quit();
	}

}
