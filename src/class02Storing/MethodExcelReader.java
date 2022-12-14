package class02Storing;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MethodExcelReader {
    public static ArrayList<LinkedHashMap<String, String>> read(String path) throws IOException {

        FileInputStream fis=new FileInputStream(path);
//that helps us to read and write data
        XSSFWorkbook excel=new XSSFWorkbook(fis);

        Sheet sheet=excel.getSheet("Sheet1");

        ArrayList<LinkedHashMap<String,String>> excelData=new ArrayList<>();
        int noOfRow=sheet.getPhysicalNumberOfRows();

        Row headerRow=sheet.getRow(0);

        for (int i=1; i<noOfRow;i++) {
            LinkedHashMap<String,String> rowMap=new LinkedHashMap();
            Row dataRow=sheet.getRow(i);//get a row from sheet one by one through loop

            int noOfCell=dataRow.getPhysicalNumberOfCells();
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {
                String key=headerRow.getCell(cellNo).toString();
                String values=dataRow.getCell(cellNo).toString();

                rowMap.put(key,values);

            }
            excelData.add(rowMap);

            //System.out.println(rowMap);


        }
       return excelData;

    }
}
