package class02Storing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class StoringDataToArray2D {
    public static void main(String[] args) throws IOException {

        String path="Data/Test.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelData=new XSSFWorkbook(fileInputStream);
        Sheet sheet1= excelData.getSheetAt(0);

        int rows= sheet1.getPhysicalNumberOfRows();
        System.out.println(rows);
        int colNum = sheet1.getRow(1).getLastCellNum();
        System.out.println(colNum);
        String [][] arrnew = new String[rows][colNum];

        for(int i=0; i< rows; i++) {
            Row rowWithData= sheet1.getRow(i);

            int noOfCells=rowWithData.getPhysicalNumberOfCells();

            for(int j=0; j<noOfCells; j++) {
                Cell cellWithData= rowWithData.getCell(j);
                String cellTextData=rowWithData.getCell(j).toString();
                //System.out.println(cellTextData);
                arrnew[i][j]=cellTextData;

            }

        }
        System.out.println("I am printing array values");

               for(int i=1; i< arrnew.length; i++) {
                    for (int j=0; j<arrnew[i].length; j++) {
                        System.out.print(arrnew[i][j]+" ");
                    }
                }
        System.out.println();




    }
}
