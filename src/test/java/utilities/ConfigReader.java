package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    //we will read data from config
    private static Properties properties;
    static {
        String path="configuration.properties";
        try {
            FileInputStream file=new FileInputStream(path);
            properties=new Properties();
            properties.load(file);
        }catch (Exception e){
            System.out.println("Could not read config file");
        }
    }
    //will return value from config
    public static String getProperty(String key){return properties.getProperty(key);}
}
