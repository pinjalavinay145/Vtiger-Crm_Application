package DataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

    public String ReadDataFromPropertiesFile(String variable) throws IOException {
        FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Vinay kumar\\IdeaProjects\\Vtiger-Crm_Application\\src\\main\\resources\\data.properties");
        Properties prop= new Properties();
        prop.load(fileInputStream);
        return prop.getProperty(variable);
    }
}
