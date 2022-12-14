package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRepl212 {
    public static void main(String[] args) {
        try {
            accessingThePath("");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        /*
        Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

**Expected Output:**

```
java.io.FileNotFoundException:  (No such file or directory)
         */
    }

    public static void accessingThePath(String url) throws FileNotFoundException {

        FileInputStream fileInputStream=new FileInputStream(url);

    }
}
