import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program_day2_excersise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		System.out.println(driver.getTitle());
		Select combo=new Select(driver.findElement(By.name("category_id")));
		int size=combo.getOptions().size();
		int i;
		for(i=0;i<size;i++)
		{
			combo.selectByIndex(i);
			String s=combo.getFirstSelectedOption().getText();
			System.out.println(s);
			
			
		}
		int total=combo.getOptions().size();
		System.out.println(total);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
