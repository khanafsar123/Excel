package class01Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path="F:\\Excel\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xxsfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet= (Sheet) xxsfWorkbook.getSheet("Sheet1");
        //Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row= sheet.getRow(0);

        System.out.println(row.getCell(0));





    }
}
