package Exceptions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelTryCatch {

    public static void main(String[] args) {
        String path="Data/Test.xlsx";




    }

  public static List<Map<String,String>> readExcel(String path) {
      FileInputStream fileInputStream = null;
      XSSFWorkbook excelSheets = null;
      List<Map<String,String>> arrayList=null;
      try {
          fileInputStream = new FileInputStream(path);
          excelSheets = new XSSFWorkbook(fileInputStream);

          Sheet sheet1=excelSheets.getSheet("Sheet1");
          int noOfRows= sheet1.getPhysicalNumberOfRows();

        arrayList=new ArrayList<>();

          Row headerRow=sheet1.getRow(0);

          for(int i=1; i<noOfRows; i++) {
              Map<String,String> map=new LinkedHashMap<>();
              Row rowData= sheet1.getRow(i);

              int noOfColumns=rowData.getPhysicalNumberOfCells();

              for(int j=0; j<noOfColumns; j++) {
                  Cell cell=rowData.getCell(i);
                  // System.out.println(cell);
                  String key=headerRow.getCell(j).toString();
                  String values=rowData.getCell(j).toString();

                  map.put(key,values);
              }
              arrayList.add(map);
          }
          System.out.println(arrayList);
      }
      catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e){
          e.printStackTrace();
      } finally {
          try {
              fileInputStream.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
      return arrayList;
    }

}
