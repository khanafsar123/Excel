package class01;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcelData {
    public static void main(String[] args) throws IOException {
        String path="Data/Test.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);

        Sheet sheet1= excel.getSheet("Sheet1");

        //return how many rows in actual contains data in sheet
        int noOfRows=sheet1.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        for(int i=0; i<noOfRows; i++) {
            Row rows= sheet1.getRow(i);
            //loop for Cells
            // cell containing data
            int noOfCell=rows.getPhysicalNumberOfCells();
            for (int j=0; j<noOfCell; j++) {
                Cell cell= rows.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }


    }
}
