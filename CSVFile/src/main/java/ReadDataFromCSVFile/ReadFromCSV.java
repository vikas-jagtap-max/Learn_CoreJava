package ReadDataFromCSVFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadFromCSV {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fileReader = new FileReader("src\\main\\resources\\sample2.csv");

		//
		System.out.println("Method 1");
		CSVReader reader = null;
		reader = new CSVReader(fileReader);

		String[] next;
		try {
			while ((next = reader.readNext()) != null) {
				for (String csvFileValues : next) {

					System.out.println(csvFileValues + " ");
				}
				System.out.println("\n");
			}
		} catch (CsvValidationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//
		System.out.println("Method 2");
		BufferedReader bufferedReader = null;
		String line = "";

		bufferedReader = new BufferedReader(fileReader);
		try {
			while ((line = bufferedReader.readLine()) != null) {
				String[] row = line.split(",");
				for (String index : row) {
					System.out.printf("%-10s", index);

				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
