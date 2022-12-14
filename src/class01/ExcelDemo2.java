package class01;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Data/Test.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(fileInputStream);
        Sheet shee1= excel.getSheet("Sheet1");
        Row row0= shee1.getRow(0);
        System.out.println(row0.getCell(0));

        int noOfRows= shee1.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        for(int i=0; i<noOfRows; i++) {
            Row row=shee1.getRow(i); //get All the rows
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j=0; j<noOfCells; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();

        }


    }
}
