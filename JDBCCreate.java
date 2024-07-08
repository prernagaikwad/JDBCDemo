import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class JDBCCreate
{
    public static void main(String[] args)
    {

        String insertSQl = "Insert into student(id,first_name,last_name,Address,Marks) VALUES(?,?,?,?,?)";

        try (
            Connection con =JDBCDemo3.getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(insertSQl))
        {

            preparedStatement.setInt(1,12);
            preparedStatement.setString(2,"John");
            preparedStatement.setString(3,"reddy");
            preparedStatement.setString(4,"Hyderabad");
            preparedStatement.setInt(5,89);



            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows inserted:" + rowsAffected);
        } catch(SQLException e)
        {
            e.printStackTrace();

        }


    }

}






