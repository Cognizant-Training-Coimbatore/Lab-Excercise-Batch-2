package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\javaprograms\\selenium_examples\\chromedriver.exe");
		
//		Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("http://examples.codecharge.com/store/Default.php");
		String title=driver.getTitle();
	    String rtitle="Online Bookstore";
		if(title.equals(rtitle)==true)
		{
			System.out.println("verified");
		}		
		 Select product= new Select(driver.findElement(By.name("category_id")));
	        int total=product.getOptions().size();
	        System.out.println(total);
	        driver.quit();

	}

}
