package WriteDataIntoCSVFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.opencsv.CSVWriter;

//Comma Separated Values(CSV) -
public class WriteIntoCSV {

	public static void main(String[] args) throws IOException {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Employee ID").append(",").append("Employee Name").append(",").append("Salary")
				.append("\n");
		stringBuilder.append("1240906").append(",").append("Vikas Jagtap").append(",").append("20LPA").append("\n");

		//
		FileWriter fileWriter = new FileWriter("src\\main\\resources\\sample1.csv");
		CSVWriter writer = null;
		try {
			writer = new CSVWriter(fileWriter);

			String[] header = { "Employee ID", "Employee Name", "Salary" };
			writer.writeNext(header);
			String[] rowValues = { "1240908", "Akash", "10LPA" };
			writer.writeNext(rowValues);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		//
		try {
			File file = new File("C:\\Users\\Vikas Jagtap\\Desktop\\Backend\\Java\\Core Java\\sample1.csv");
			PrintWriter printWriter = new PrintWriter(file);
			printWriter.write(stringBuilder.toString());
			System.out.println("CSV file is created");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
