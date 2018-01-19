package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelFile {
	
	public static ArrayList<ArrayList<String>> cellval(String FileName) {

		FileInputStream productname = null;
		try {
			productname = new FileInputStream(System.getProperty("user.dir") +File.separator+"SourceFiles"+File.separator+"username.xls");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(productname);
		} catch (Exception e) {

			e.printStackTrace();
		}

		Sheet sh = wb.getSheetAt(0);
		Iterator<Row> itrrow = sh.rowIterator();
		
		Row row;
		Cell cell;
		
		ArrayList<ArrayList<String>> rowvalue=new ArrayList<ArrayList<String>>();

		DataFormatter dataFormatter=new DataFormatter();	
		
		while (itrrow.hasNext()) {
			row = itrrow.next();
			if(row.getRowNum()>0)
			{
				ArrayList<String> cellvalue=new ArrayList<String>();
				Iterator<Cell> Itrcell=row.cellIterator();

				while(Itrcell.hasNext())
				{
					cell=Itrcell.next();
					cellvalue.add(dataFormatter.formatCellValue(cell));						
				}	
			rowvalue.add(cellvalue);
			}
		}
		return rowvalue;
	}
}
