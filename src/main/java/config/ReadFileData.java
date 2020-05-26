package config;

import org.apache.http.auth.UsernamePasswordCredentials;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {

    String loginV;
    String passwordV;
    String[] credential;
    UsernamePasswordCredentials credentials;

     public ReadFileData(){
        loginV = "login";
        passwordV = "password";}


     public String[] ReadValidCredentials() {
        String[]credential=new String[2];
        File file = new File("D:/Selenium/angielski/src/test/resources/config.properties");

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        //load properties file
        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        credential[0]=prop.getProperty("correctusername");
        credential[1]=prop.getProperty("correctpassword");

        return credential;
    }

}