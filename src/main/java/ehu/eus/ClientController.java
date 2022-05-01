package ehu.eus;

import com.google.gson.reflect.TypeToken;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ClientController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AreaCountryCodeTxt;

    @FXML
    private TextField AreaINamext;

    @FXML
    private TextField AreaIdTxt;

    @FXML
    private TextField CompetitionIdTxt;

    @FXML
    private TextField CompetitionNameTxt;

    @FXML
    private Button NextBtn;

    @FXML
    private Button PreviousBtn;


    int current=0;

    @FXML
    void ClickOnNextBtn(ActionEvent event) {
        if (current == ClientApplication.competitions.size()-1){
            current= 0;
        }else{
            current= current+1;
        }
        show(current);
    }

    @FXML
    void ClickOnPreviousBtn(ActionEvent event) {
        if (current == 0){
            current= ClientApplication.competitions.size()-1;
        }else{
            current= current-1;
        }
        show(current);
    }

    @FXML
    void initialize() {
        Competition competi1 = ClientApplication.competitions.get(0);
        System.out.println(competi1.getId());
        System.out.println(competi1.getName());
        System.out.println(competi1.getArea().getId());
        System.out.println(competi1.getArea().getName());
        System.out.println(competi1.getArea().getCountryCode());

        show(0);
    }

    private void show(int current){
        AreaIdTxt.setText(String.valueOf(ClientApplication.competitions.get(current).area.getId()));
        AreaINamext.setText(ClientApplication.competitions.get(current).area.getName());
        AreaCountryCodeTxt.setText(String.valueOf(ClientApplication.competitions.get(current).area.getCountryCode()));
        CompetitionIdTxt.setText(String.valueOf(ClientApplication.competitions.get(current).getId()));
        CompetitionNameTxt.setText(ClientApplication.competitions.get(current).getName());
    }

}

