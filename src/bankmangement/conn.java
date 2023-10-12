
package bankmangement;

import java.sql.*;
public class conn 
{
    Connection c;
    Statement s;
    public conn() 
    {
        try 
        {
        
        c= DriverManager.getConnection("jdbc:mysql:///bankmanagement","root","gupta@306");
        s =c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
}

