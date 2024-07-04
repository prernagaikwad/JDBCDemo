import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCdemo
{
    public static void main(String[] args)
    {
        String url ="jdbc:mysql://localhost:3306/students";
        String user ="root";
        String password ="Prerna@123";

        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver") ;

            Connection con = DriverManager.getConnection(url,user,password);

            System.out.println("Connected to the database");

        }
        catch(SQLException e)
        {
            System.out.println();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
