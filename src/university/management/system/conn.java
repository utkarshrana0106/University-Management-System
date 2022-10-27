package university.management.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{

            //Registering Driver
            Class.forName("com.mysql.jdbc.Driver");

            //Establishing Connectivity
            c=DriverManager.getConnection("jdbc:mysql:///ums","root","");

            s=c.createStatement();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
