package DataDriven_Testing;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReaddataFromJsonFile {
    public Object readDataFromJsonFile(String variableName) throws IOException, ParseException {
        JSONParser parser= new JSONParser();
        Object object = parser.parse(new FileReader("C:\\Users\\Vinay kumar\\IdeaProjects\\Vtiger-Crm_Application\\src\\main\\resources\\appCommenData.json"));
        JSONObject jsonObject = (JSONObject) object;
        return jsonObject.get(variableName);

    }
}
