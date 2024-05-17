package generics;
import org.testng.annotations.Factory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.sound.sampled.TargetDataLine;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import Scripts.RegisterUser;

public class Data_Class {
	
	@Factory(dataProvider="getData1")
	public Object[] RegisterUser(String  name, String email) {
		return new Object[] {new RegisterUser(name, email)};
	}
	
	 
	 @DataProvider(parallel = true)
		public  String[][] getData1() throws IOException  {
		 Lib b = new Lib();
		 return b.getData("sheet1");
}
}

