package feb1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program2 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i;
		
		driver.get("file:///C:/Users/admin/Downloads/sample.html.htm");
		Select product = new Select(driver.findElement(By.xpath("/html/body/select")));
		product.selectByVisibleText("Mango");
		int total = product.getOptions().size();
		System.out.println(total);	
		for(i=0;i<total;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(1000);
			String s = product.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		Thread.sleep(5000);
		
		
		

	}

}
