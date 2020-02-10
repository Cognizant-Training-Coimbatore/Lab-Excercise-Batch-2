package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium10_Q5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String datafile = "E:\\myData.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(datafile));
		while((line = br.readLine()) != null)
		{
			String [] data = line.split(cvsSplitBy);
			System.out.println(data[0] + " " + data[1] + " " + data[2]);
		}
		
	}

}
