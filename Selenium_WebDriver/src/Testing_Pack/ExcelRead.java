package Testing_Pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelRead {

	public static void main(String[] args) throws IOException {


		File file = new File("H:\\ApachePOI_DataDriven_File.xls"); 
		FileInputStream excel = new FileInputStream(file); 
		HSSFWorkbook wb = new HSSFWorkbook(excel); 
		HSSFSheet ws = wb.getSheet("Input");
		
		int rownum = ws.getLastRowNum()+1; 
		int columnnum = ws.getRow(0).getLastCellNum(); 

		
		String[][] data = new String[rownum][columnnum]; 
		
		for(int i=0 ; i<rownum; i++)
		{
			HSSFRow row = ws.getRow(i);
		
			for(int j=0; j<columnnum; j++)
				
			{
				
				HSSFCell cell = row.getCell(j); 
				
				String value = cellToString(cell); 
				
				data[i][j]= value;
				System.out.println("the value is " +value);
				
			}
		}
	
	}

	public static String cellToString(HSSFCell cell) {
		
		int type  ; 
		Object result; 
		type= cell.getCellType(); 
		
		switch(type)
		{
		case 0: 
		result = cell.getNumericCellValue(); 
		break;
		case 1:
			result = cell.getStringCellValue(); 
		break;
		
		default :
			throw new RuntimeException("There are no support for this type of cell");
		
		}
		
		return result.toString();
		
		
	}

}
