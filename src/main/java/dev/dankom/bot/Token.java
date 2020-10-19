package dev.dankom.bot;

import com.google.gson.JsonObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Token {
    public static String getToken() {
        JSONParser parser = new JSONParser();
        String out = "";
        try {
            JsonObject obj = (JsonObject) parser.parse(new FileReader("/DiscordTest/src/main/resources/private.json"));
            out = obj.get("token").getAsString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}
