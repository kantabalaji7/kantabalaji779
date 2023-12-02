package com.excell.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class Excell_Example {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("D:\\New Microsoft Excel Worksheet (2).xls");
		Workbook    wb = Workbook.getWorkbook(file);
		Sheet       st = wb.getSheet(0);
		int row = 3;
		String empid = st.getCell(0,row).getContents();
		String name = st.getCell(1,row).getContents();
		String email = st.getCell(2,row).getContents();
		String no = st.getCell(3,row).getContents();

		System.out.println(empid+"||"+name+"||"+email+"||"+no);


	}

}
