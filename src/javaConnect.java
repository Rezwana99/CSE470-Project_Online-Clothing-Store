/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rezwana Hasan
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection c;
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection c=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Rezwana Hasan\\Desktop\\Online Clothing Store\\StoreDB.sqlite");
            return c;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
    
}
