package class02Storing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CallingMethod {
    public static void main(String[] args) throws IOException {
        ArrayList<LinkedHashMap<String, String>> excelReading = MethodExcelReader.read("Data/Test.xlsx");
        
        // we can print all the maps from the arrayList
        for(var row:excelReading) {
            System.out.println(row);
        }

        // or we can read individual map
        // first row we declared as header so the data index 0 will start from data
        LinkedHashMap<String, String> row1=excelReading.get(0);
        System.out.println(row1.get("LastName"));
        
        
        
    }
}
