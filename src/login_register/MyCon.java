package login_register;

import java.sql.*;
import javax.swing.JOptionPane;

public class MyCon 
{
    public static void main(String[] args) {
        System.out.println("My connection is working");
    }
    Connection cn = null;
    public static Connection ConnectDB() 
    {
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
      Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3308/mydb","Ritwik","qwerty");
      //JOptionPane.showMessageDialog(null,"Database connected");
      return cn;
      }
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          return  null;
      }
      }
}
 