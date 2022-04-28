package ehu.eus;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ClientApplication {

    public static void main(String args[]){
        Manager manager = new Manager();
        String body = manager.request("competitions");
        System.out.println(body);

        Gson gson = new Gson();
        JsonObject jsonObject;

        jsonObject = gson.fromJson(body, JsonObject.class);
        Type competitionListType = new TypeToken<ArrayList<Competition>>(){}.getType();
        List<Competition> competitions = gson.fromJson((jsonObject.get("competitions")), competitionListType);
        System.out.println(competitions.get(0).id);
        System.out.println(competitions.get(0).area);
        System.out.println(competitions.get(0).name);


    }
}
