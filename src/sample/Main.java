package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.util.calendar.BaseCalendar;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("admin.fxml"));
        primaryStage.setTitle("Admin Pannel");
        primaryStage.setScene(new Scene(root, 630, 500));
        primaryStage.show();

        //DbConnect db = new DbConnect("root","");
        //AdminController c = new  AdminController() ;
        // String sql= "Select * From login";
        // String sql= "INSERT INTO admin (nom_prenom, binome, sujet, salle, date, heure, encadrant) VALUES ([value-2],[value-3],[value-4],[value-5],[value-6],[value-7],[value-8])";
        //AjouterP("med","kech","bombe","amphi", "2016-05-06","50000","hmida");
    }



    public static void main(String[] args) {
        launch(args);
    }

}
