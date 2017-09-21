/**
 * 
 */
package Lab1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Ankit.Mittal
 *
 */
public class miscellaneousProg {

	/**
	 * this program id joint for reading data from properties files and excel files
	 * @throws IOException 
	 */
	public static String readProp(String key)
	{
		String value="";
		
		try {
		String path=//System.getProperty("java.class.path")+File.separator+
				"miscellaneousProg.properties";
		System.out.println(path);
		
		File file=new File(path);
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Properties p=new Properties();
		p.load(fileInputStream);
		
		value=p.getProperty(key);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;		

	}
	
	
	
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fileInputStream=new FileInputStream("D:\\miscellaneousProg.xlsx");
			Workbook ankit=WorkbookFactory.create(fileInputStream);
			Sheet sheet=ankit.getSheetAt(0);
			Iterator<Row> iterator=sheet.iterator();
			
			while(iterator.hasNext())
			{
				Row row=iterator.next();
				Iterator<Cell> iterator2=row.cellIterator();
				while(iterator2.hasNext())
				{
					Cell cell=iterator2.next();
					
					String value1=cell.getStringCellValue();
					
				//	miscellaneousProg miscellaneousProg=new miscellaneousProg();
					String value= miscellaneousProg.readProp(value1);
					System.out.println(value);
				}
			}
			
		} 
		catch (InvalidFormatException | IOException e) 
		{
			e.printStackTrace();
		}
		

//		String value= miscellaneousProg.readProp("name");
//		System.out.println(value);
		

		
		
	}

}
