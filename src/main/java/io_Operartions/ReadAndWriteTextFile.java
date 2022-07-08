package io_Operartions;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadAndWriteTextFile {
    public static void main(String[] args) throws IOException {

        File file = new File("Java.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line=br.readLine())!=null) {
            System.out.println(line);
        }
        String dataInTextFile = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
        System.out.println(dataInTextFile);

        //Write to another file
        File newFile = new File("ABC.txt");
        /*if(newFile.exists()) {
            newFile.delete();
        }*/
        if(newFile.exists()) {
            newFile.delete();
        }
        boolean isFileCreated = newFile.createNewFile();
        if(isFileCreated==true) {
            System.out.println("New File is created");
        } else {
            System.out.println("File is not created");
        }
        FileWriter fileWriter = new FileWriter(newFile);
        fileWriter.write(dataInTextFile);
        fileWriter.write("\nabc");
        fileWriter.close();
    }
}
