package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static final Properties properties = new Properties();
    private static ConfigurationReader instance;

    public static ConfigurationReader get(){
        if(instance == null){
            instance = new ConfigurationReader();
            try{
                properties.load(new FileInputStream("src/main/resources/testData.properties"));
            } catch (IOException ioException){
                ioException.printStackTrace();
            }
        }
        return instance;
    }

    public String getUserEmail(){ return properties.getProperty("testData.userEmail");}
    public String getPassword(){return  properties.getProperty("testData.userPassword");}
    public String getCategory(){return properties.getProperty("testData.category");}
    public String getSubcategory(){return properties.getProperty("testData.subcategory");}
}
