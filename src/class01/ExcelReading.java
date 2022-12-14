package class01;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelReading {
    public static void main(String[] args) throws IOException {
        String path="Data/Test.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);

        // for excel we have xxfWorkbok
        XSSFWorkbook excelFiles=new XSSFWorkbook(fileInputStream);

        // now get the sheet
        Sheet sheet=excelFiles.getSheet("Sheet1");
        Row row0=sheet.getRow(0);
        System.out.println(row0.getCell(0));

        Row row1=sheet.getRow(1);
        System.out.println(row1.getCell(1));

        Row row2= sheet.getRow(2);
        System.out.println(row2.getCell(2));



    }
}
