package io_Operartions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class PropertyFileimpl {
    public static void main(String[] args) throws IOException {
//        String PROJECT
        /*HashMap<String,String> userDetails=new HashMap<>();
        userDetails.put("firstname","bharghav");
        userDetails.put("lastname","Sravan");
        userDetails.put("mobile","123456789");
        userDetails.put("loginId","bharghav.sravan3@gmail.com");
        userDetails.put("password","password");
        System.out.println(userDetails.get("firstname"));
        System.out.println(userDetails.get("mobile"));*/
        File propertiesFile = new File("Files/UserData.properties");
        Properties prop = new Properties();
        prop.load(new FileInputStream(propertiesFile));
        prop.forEach((k,v)->{
            System.out.println("key :: " + k +", the value is :: " + v);
        });
        System.out.println("printing it from property files");
        System.out.println(prop.getProperty("firstname"));
        System.out.println(prop.getProperty("lastname"));
        prop.setProperty("lastname","mylastname");
        FileOutputStream fout = new FileOutputStream(propertiesFile);
        prop.store(fout,"");
        fout.close();
    }
}
