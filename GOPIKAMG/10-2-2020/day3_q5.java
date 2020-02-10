import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day3_q5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  // WebDriver driver=new ChromeDriver();
		   
		   //driver.get("http://demowebshop.tricentis.com");
		String datafile="E:\\employee.csv";
		BufferedReader br=null;
		String line="";
		String cvsSplitBy=",";
		br=new BufferedReader(new FileReader(datafile));
		while((line=br.readLine())!=null)
		{
			String[]data=line.split(cvsSplitBy);
			//driver.findElement(By.linkText("Register")).click();
			//driver.findElement(By.name("Firstname")).sendKeys(data[0]);
			//driver.findElement(By.name("Lastname")).sendKeys(data[1]);
			//driver.findElement(By.name("Password")).sendKeys(data[2]);
			System.out.println(data[0]+" "+data[1]+" "+data[2]);
		}
	}

}
