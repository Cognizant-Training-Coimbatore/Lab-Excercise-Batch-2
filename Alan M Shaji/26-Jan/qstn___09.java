import java.io.FileWriter;

public class qstn___09 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter fin=new FileWriter("D:\\myfile2.csv");
		fin.append("101");
		fin.append(",");
		fin.append("c");
		fin.append(",");
		fin.append("E.Balaguruswamy");
		fin.append(",");
		fin.append("BPB");
		fin.append(",");
		fin.append("110");
		fin.append("\n");
		fin.append("102");
		fin.append(",");
		fin.append("c++");
		fin.append(",");
		fin.append("Kanikar");
		fin.append(",");
		fin.append("Tech mcgraw hill");
		fin.append(",");
		fin.append("200");
		fin.append("\n");
		fin.append("103");
		fin.append(",");
		fin.append("Java made easy");
		fin.append(",");
		fin.append("Karthik");
		fin.append(",");
		fin.append("Vijaya");
		fin.append(",");
		fin.append("300");
		fin.append("\n");
		fin.flush();
		fin.close();
	}

}
