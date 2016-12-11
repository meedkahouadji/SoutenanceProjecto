package sample;

import com.jfoenix.controls.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.sql.SQLException;

public class AdminController {
    @FXML
    public  JFXTextField name;
    public  JFXTextField partner;
    public  JFXTextField room;
    public  JFXTextField leader;
    public  JFXDatePicker time;
    public  JFXTextField oclock;
    public  JFXTextField topic;
    public  JFXButton submit;


    public void submitclick(ActionEvent actionEvent) {
        AjouterP(name.getText(),partner.getText(),topic.getText(),room.getText(),time.getValue().toString(),oclock.getText(),leader.getText());
    }


    public static void AjouterP(String nomprenom, String binome, String sujet, String salle, String date, String heure, String encadrant){
        try{
            DbConnect db = new DbConnect("root","");
            AdminController c = new AdminController() ;


            String query= "INSERT INTO admin (nomprenom, binome, sujet, salle, date, heure, encadrant) VALUES ('"+nomprenom+"', '"+binome+"', '"+sujet+"', '"+salle+"', '"+date.toString()+"', '"+heure+"', '"+encadrant+"')";
            db.connect();
            db.getStatement().executeUpdate(query);
            db.closeConnection();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (Exception de) {
            de.printStackTrace();
        }


    };
}