package class02Storing;

import java.io.IOException;
import java.util.Properties;

public class readingProperty {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties";
        Properties property = PropertyReturn.read(path);
        System.out.println(property.getProperty("browser"));
    }
}
