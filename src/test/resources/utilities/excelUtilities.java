
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtilities {
	
	public static void main(String[] args) {
		
		XSSFWorkbook workBook=new XSSFWorkbook("./Data Sheet/Login Details Data Sheet.xlsx");
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		XSSFRow row=sheet.getRow(0);
		int columnCount=row.getLastCellNum();
		System.out.println(columnCount);
		
		DataFormatter formatter=new DataFormatter();
		Object value=formatter.formatCellValue(sheet.getRow(2).getCell(0));
		System.out.println("The value is: "+value);		
		
	}	

}
