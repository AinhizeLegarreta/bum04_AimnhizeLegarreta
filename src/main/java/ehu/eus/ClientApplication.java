package ehu.eus;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ClientApplication extends Application {

    public static List<Competition> competitions;
    public static Competition competition;
    public static int competitionId;
    public static String competitionName;
    public static Competition.Area area;
    public static int areaId;
    public static String areaName;
    public static String areaCountryCode;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientApplication.class.getResource("competitions.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ClientApplication");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){

        Manager manager = new Manager();
        String body = manager.request("competitions");
        System.out.println(body);

        Gson gson = new Gson();
        JsonObject jsonObject;

        jsonObject = gson.fromJson(body, JsonObject.class);

        Type competitionListType = new TypeToken<ArrayList<Competition>>(){}.getType();
        competitions = gson.fromJson((jsonObject.get("competitions")), competitionListType);

        System.out.println(competitions.get(0).id);
        System.out.println(competitions.get(0).area);
        System.out.println(competitions.get(0).name);

        launch();

    }

}
