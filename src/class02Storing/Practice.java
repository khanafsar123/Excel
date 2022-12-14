package class02Storing;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Practice {
    public static void main(String[] args) throws IOException {

        String path="Data/Test.xlsx";

        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelSheets=new XSSFWorkbook(fileInputStream);

        Sheet sheet=excelSheets.getSheet("Sheet1");

        Row headerRow=sheet.getRow(0);
        int noOfRows= sheet.getPhysicalNumberOfRows();

        ArrayList<LinkedHashMap<String,String>> excelData=new ArrayList<>();

        for(int i=0; i<noOfRows; i++) {
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();
            Row dataRows=sheet.getRow(i);

            int cells= dataRows.getPhysicalNumberOfCells();
            for(int j=0; j<cells; j++) {
                Cell cellData= dataRows.getCell(i);

                String keys=headerRow.getCell(i).toString();
                String values=dataRows.getCell(i).toString();

                rowMap.put(keys, values);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);


    }}
