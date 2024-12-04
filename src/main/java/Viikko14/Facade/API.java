package Viikko14.Facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.parser.ParseException;

// Illegal exception jos attribuuttia ei löydy
//Heittää io exception jos HTTP pyyntö epäonnistuu
public class API implements GeneralAPI {
    public String apiSetup(String urlString, String attributeName)
            throws IllegalArgumentException, IOException {

        String jsonResponse;

        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            jsonResponse = response.toString();
        } finally {
            con.disconnect();
        }

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(jsonResponse);
            if (!jsonObject.containsKey(attributeName)) {
                throw new IllegalArgumentException("Attribute '" + attributeName + "' not found in the JSON response.");
            }
            return (String) jsonObject.get(attributeName);
        } catch (ParseException e) {
            throw new IOException("Error parsing JSON response.", e);
        }
    }



}
