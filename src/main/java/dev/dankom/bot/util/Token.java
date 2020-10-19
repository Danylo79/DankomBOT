package dev.dankom.bot.util;

import com.google.gson.JsonObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;

public class Token {
    public static String getToken() {
        JSONParser parser = new JSONParser();
        String out = "";
        try {
            JSONObject obj = (JSONObject) parser.parse(new FileReader(new File("./private.json")));
            out = obj.get("token").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}
