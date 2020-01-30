import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class pgm29_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver","chromedriver.exe");          
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.google.co.in/");  
		String title = driver.getTitle();  
		int titleLength = driver.getTitle().length();  
		System.out.println("Title of the page is : " + title);  
		System.out.println("Length of the title is : "+ titleLength);  
		String actualUrl = driver.getCurrentUrl();  
		if (actualUrl.equals("https://www.google.co.in/")){  
		System.out.println("Verification Successful - The correct Url is opened.");  
		}  
		else{  
		 System.out.println("Verification Failed - An incorrect Url is opened.");  
		    }  
		String pageSource = driver.getPageSource();  
		int pageSourceLength = pageSource.length();  
		System.out.println("Total length of the Page Source is : " + pageSourceLength); 
		driver.close();   
	}

}
  
   

  
