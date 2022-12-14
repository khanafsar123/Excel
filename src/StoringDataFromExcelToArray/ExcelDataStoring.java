package StoringDataFromExcelToArray;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataStoring {
    public static void main(String[] args) throws IOException {
        String path="Data/Test.xlsx";
        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook excel=new XSSFWorkbook(file);
        Sheet sheet1= excel.getSheet("Sheet1");

        int noOfRows=sheet1.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        int noOfColumns = sheet1.getRow(1).getPhysicalNumberOfCells();
        System.out.println(noOfColumns);

        String[][] arr=new String[noOfRows][noOfColumns];

        for(int i=0; i<noOfRows; i++) {
            Row rowWithData= sheet1.getRow(i);
            for(int j=0; j<noOfColumns; j++) {
                Cell cell= rowWithData.getCell(j);
                String data=cell.toString();
              //  String cellText = rowWithData.getCell(j).toString();

                arr[i][j] =data;

            }}
            for(int i=1; i< arr.length; i++) {
                for (int j=0; j< arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }



    }
}
