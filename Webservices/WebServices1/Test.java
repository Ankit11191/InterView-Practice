package testCases;

import java.util.ArrayList;

import base.Logging;
import base.ReadFromExcelFile;

public class Test extends Logging{

	public static void main(String[] args) {

		ArrayList<ArrayList<String>> UNPWD = ReadFromExcelFile.cellval("FileName");
		
		Login.launcg();
		for(ArrayList<String> aaa:UNPWD.subList(0, 2))
		{
			String[] arr=aaa.toArray(new String[aaa.size()]);
			Login.logging(arr[0], arr[1]);
			ReadFromExcelFile.updateCell("FileName",arr[0]);			
		}
		Login.logoff();
	}
}
