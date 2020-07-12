package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {

    public static String[] readValidCredentials() {
        String[] credential = new String[2];
        File file = new File("D:/Selenium/angielski/src/test/resources/config.properties");

        FileInputStream fileInput;
        Properties prop = new Properties();
        try {
            fileInput = new FileInputStream(file);
            prop.load(fileInput);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        credential[0] = prop.getProperty("correctusername");
        credential[1] = prop.getProperty("correctpassword");

        return credential;
    }

}