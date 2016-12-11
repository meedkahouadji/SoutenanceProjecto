package sample;
import javafx.fxml.FXML;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**

/**
 * Created by MEDKAHOUADJI1 on 12/2/2016.
 */
public class DbConnect {

    final String Driver ="com.mysql.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3306/soutenance?autoReconnect=true&useSSL=false";

    int id=0;
    String nomprenom = null;
    String binome = null;
    String sujet = null;
    String salle = null;
    //SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    String heure = null;
    String encadrant = null;
    String login = null;
    String password = null;

    Connection conn =null ;
    Statement stmt = null;
    //Constructeur DBconnect
    /* public DbConnect(String nom_prenom , String binome,String sujet, String salle, String date, String heure,
                     String encadrant){
        nom_prenom = nom_prenom ;
        binome = binome;
        sujet = sujet;
        salle = salle ;
        date = date;
        heure = heure;
        encadrant = encadrant;
    }
    */
    public DbConnect(String name , String pass){
        login = name ;
        password = pass;
    }

    public void connect() throws SQLException,Exception{
        Class.forName(Driver);
        System.out.println("Connecting....");
        conn = DriverManager.getConnection(url,login,password);
        stmt = conn.createStatement();
    }
    public void closeConnection() throws SQLException,Exception{
        stmt.close();
        conn.close();
    }
    public Statement getStatement(){
        return stmt ;
    }
    public  Connection getConnection(){
        return conn ;
    }
}
