import java.io.FileWriter;
import java.io.IOException;

public class qstn9 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter csvWriter = new FileWriter("book.csv");
		csvWriter.append("101");
		csvWriter.append(",");
		csvWriter.append("c");
		csvWriter.append(",");
		csvWriter.append("E.Balaguruswamy");
		csvWriter.append(",");
		csvWriter.append("BPB");
		csvWriter.append(",");
		csvWriter.append("110");
		csvWriter.append("\n");
		csvWriter.append("102");
		csvWriter.append(",");
		csvWriter.append("c++");
		csvWriter.append(",");
		csvWriter.append("kanikar");
		csvWriter.append(",");
		csvWriter.append("Tech mcgraw hill");
		csvWriter.append(",");
		csvWriter.append("200");
		csvWriter.append("\n");
		csvWriter.append("103");
		csvWriter.append(",");
		csvWriter.append("java made easy");
		csvWriter.append(",");
		csvWriter.append("karthik");
		csvWriter.append(",");
		csvWriter.append("vijaya");
		csvWriter.append(",");
		csvWriter.append("300");
		csvWriter.append("\n");
		
		csvWriter.flush();
		csvWriter.close();

	}
	
}
