import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;

public class test {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("G1.json"));
        JSONObject jsonObject = (JSONObject) obj;
       // String name = (String) jsonObject.get("Name");
       // String course = (String) jsonObject.get("Course");
        JSONArray Edge = (JSONArray) jsonObject.get("Edges");
        int i=0;
        while (0< Edge.length()){
            System.out.println(Edge.get(i));
        }
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.
// Checking hashtable is empty or not.
        boolean isEmpty = ht.isEmpty();
        System.out.println("Is hash table empty: " +isEmpty);

// Adding entries using put() method in hash table.
        ht.put(1, "One"); // ht.size() is 1.
        ht.put(2, "Two"); // ht.size() is 2.
        ht.put(3, "Three"); // ht.size() is 3.
    }
}
