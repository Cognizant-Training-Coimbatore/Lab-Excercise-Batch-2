import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day2_program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\amrutha\\java\\seleniumfile\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	    driver.findElement(By.name("user_login")).sendKeys("amrutha");
	    driver.findElement(By.name("user_password")).sendKeys("papapapa");
	    driver.findElement(By.name("user_login")).sendKeys("amrutha");
	    driver.findElement(By.name("first_name")).sendKeys("amrutha");
	    driver.findElement(By.name("last_name")).sendKeys("amrutha");
	    driver.findElement(By.name("email")).sendKeys("amrutha@gmail.com");
	    driver.findElement(By.name("address1")).sendKeys("thazhekunnamal");
	    driver.findElement(By.name("address2")).sendKeys("Nanminda");
	    driver.findElement(By.name("address3")).sendKeys("kozhikode");
	    driver.findElement(By.name("city")).sendKeys("calicut");
	    driver.findElement(By.name("address1")).sendKeys("thazhekunnamal");
	    Select oc=new Select(driver.findElement(By.name("state_id")));
	    oc.selectByVisibleText("Hawaii");
	    driver.findElement(By.name("zip")).sendKeys("69283");
	    Select oc2=new Select(driver.findElement(By.name("country_id")));
	    oc2.selectByVisibleText("Australia");
	    driver.findElement(By.name("phone_work")).sendKeys("688038047");
	    Select oc3=new Select(driver.findElement(By.name("language_id")));
	    oc3.selectByVisibleText("English");
	    Select oc4=new Select(driver.findElement(By.name("age_id")));
	    oc4.selectByVisibleText("18-24");
	    Select oc5=new Select(driver.findElement(By.name("gender_id")));
	    oc5.selectByVisibleText("Female");
	    Select oc6=new Select(driver.findElement(By.name("education_id")));
	    oc6.selectByVisibleText("Graduate School");
	    Select oc7=new Select(driver.findElement(By.name("income_id")));
	    oc7.selectByVisibleText("$35,000 - $49,000");
	    driver.findElement(By.name("note")).sendKeys("hobbies are driving,fooding,reading");
	    driver.findElement(By.name("Insert")).click();
	    driver.close();
	    
	}

}
