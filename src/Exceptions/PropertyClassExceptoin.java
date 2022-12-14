package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyClassExceptoin {
    public static Properties readNew(String url) {
        Properties property = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(url); // ideher hamy exception dy raha tha FileNotFoundException
            // Properties property = new Properties(); property is not considered as local variable so we will declare outside the parenthesis
            property.load(fileInputStream); // idher hamy io exception dy raha tha
        } catch (FileNotFoundException e) { // idher ham siry 1 exception ko handle kr rahy hain... agr hamy dono ko 1 saat solve karna hy to hm Exception class ko call karain gy
            System.out.println("Please check the path");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Please check the hardware");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    return property;
    }

    public static void main(String[] args) {
        readNew("www");
    }
}
