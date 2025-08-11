package RedBus.test;

import RedBus.utilities.ExcelUtilities;

public class excelTests {
	
	public static void main(String[] args) {
		
		String dataSheetPath="./Data Sheet/Login Details Data Sheet.xlsx";
		String sheeName="Sheet1";
		
		ExcelUtilities excel=new ExcelUtilities(dataSheetPath,sheeName);
		
		int rc=excel.getRowCount();
		int cc=excel.getColumnCount();
		
		for(int i=1;i<rc;i++) {
			
			for(int j=0;j<cc;j++) {
				
				excel.getCellData(i, j);
				
			}
			
			
		}
		
		
	}

}
