package Data;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
   public String Fname ,Lname , email,phonNumber ,pass,confirmpass , Value, Country;

    public void reader() throws IOException, ParseException {
        String path =System.getProperty("user.dir")+"//src//test//java//Data//userData.json";
        File src=new File(path);
        JSONParser parser =new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(src));
        for (Object object :jarray){
            JSONObject person = (JSONObject) object;
            Fname= (String) person.get("firstName");
            Lname= (String) person.get("lastName");
            email= (String) person.get("email");
            phonNumber= (String) person.get("phone");
            pass = (String) person.get("pass");
            Value= (String) person.get("value");

        }

    }
}
