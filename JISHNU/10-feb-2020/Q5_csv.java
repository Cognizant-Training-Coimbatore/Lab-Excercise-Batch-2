package feb10;

import java.io.BufferedReader;

import java.io.FileReader;


public class Q5_csv {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		String datafile = "E:/Q5_10-feb.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while ((line = br.readLine()) != null) 
		{
			
			String[] data = line.split(csvSplitBy);
			
			
			System.out.println(data[0] + data[1] + data[2]);
		}
		br.close();
	}

}
