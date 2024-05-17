package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Lib {
	
	@DataProvider(parallel = true)
	public  String[][] getData(String sheetname) throws IOException {
		File	excelfile= new File("./Resorses/234.xlsx");

		FileInputStream file = new FileInputStream(excelfile);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet	sheet	 = workbook.getSheet("Sheet1");

		int rowcount = 	sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();

		System.out.println(rowcount);  //1
		
		System.out.println(cellCount);  //2

		String[][] data = new String[rowcount][cellCount];

		System.out.println("before for loop");
		for(int i = 1 ; i <= rowcount ;i++)
		{
			System.out.println("inside for loop");
			for(int j = 0 ;j < cellCount ; j++ )
			{
				System.out.println(cellCount + "cell count" + j +"row count"+ i);
				try{
					DataFormatter df =  new DataFormatter();
				System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
				data[i-1][j] = df.formatCellValue(sheet.getRow(i).getCell(j));}
				catch(Exception e) {
					System.err.println(e);
				}
				
			}
		}


		workbook.close();
		file.close();
		return data;



	}}



