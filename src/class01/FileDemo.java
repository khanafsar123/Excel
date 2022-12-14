package class01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("URl"));
    }
}
