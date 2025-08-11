package RedBus.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	static XSSFSheet sheet;
	static XSSFWorkbook workBook;
	static XSSFRow row;
	
	public ExcelUtilities(String dataSheetPath, String sheetName) {
		
		try {
		workBook=new XSSFWorkbook(dataSheetPath);
		sheet=workBook.getSheet(sheetName);
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());		
		}
		
	}
	
	public static int getRowCount() {
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		return rowCount;
		
	}
	
	public static int getColumnCount() {
		
		row=sheet.getRow(0);
		int columnCount=row.getLastCellNum();
		System.out.println(columnCount);
		return columnCount;
		
	}
	
	public static void getCellData(int rowNum, int colNum) {
		
		DataFormatter formatter=new DataFormatter();
		Object value=formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		System.out.println("The value is: "+value);
		
	}
		
		
		

		

		
	
		
	

}
