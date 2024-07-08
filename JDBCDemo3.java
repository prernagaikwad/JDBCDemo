import java.sql.Connection;

// Create operation
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Callable;

public class JDBCDemo3 {


    static String url = "jdbc:mysql://localhost:3306/students";
    static String user = "root";
    static String password = "Prerna@123";

    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(url,user,password);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }


}

