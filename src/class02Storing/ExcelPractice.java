package class02Storing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelPractice {
    public static void main(String[] args) throws IOException {
     String path="Data/Test.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelData=new XSSFWorkbook(fileInputStream);
        Sheet sheet1= excelData.getSheet("Sheet1");

        int rows= sheet1.getPhysicalNumberOfRows();
        Row headerRow=sheet1.getRow(0);

        for(int i=1; i<rows; i++) {
            Row rowData= sheet1.getRow(i);
            int columns=rowData.getPhysicalNumberOfCells();

            for(int j=0; j<columns; i++) {


                String keys=headerRow.getCell(j).toString();
                String values=rowData.getCell(j).toString();
            }
        }



    }}
