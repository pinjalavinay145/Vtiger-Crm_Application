package DataDriven_Testing;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelUtility {
    public Object[][] readingDataFromExcel() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Vinay kumar\\IdeaProjects\\Vtiger-Crm_Application\\src\\main\\resources\\Book1.exceldata.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheetname = workbook.getSheet("sheet1");
        int noOfRowsInSheet = sheetname.getPhysicalNumberOfRows();
        int noOfColumnsInSheet = sheetname.getRow(1).getPhysicalNumberOfCells();
        Object sheet[][]=new Object[noOfRowsInSheet][noOfColumnsInSheet];
        for (int i=0;i<noOfRowsInSheet;i++){
            for (int j=0;j<noOfColumnsInSheet;j++){
                sheet[i][j]=sheetname.getRow(i).getCell(j).toString();
            }
        }return sheet;
    }
}

