package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
       /* String s ="10s";
        int i = Integer.parseInt(s);
        System.out.println("print");*/
        File file = new File("");
        final int f =10;

        try {
            Thread.sleep(2000);
            FileInputStream fi = new FileInputStream(file);//execution flow is breaking here
            fi.close();
            System.out.println("in try block");
        } catch (InterruptedException | IOException e) {
            System.out.println("in catch block");
        }  finally {
            System.out.println("final block");
        }
        System.out.println("print");
    }
}
