import java.sql.*;

public class JDBCDemo1
{
    public static void main(String[] args)
    {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "Prerna@123";

        try
        {
           //Import JDBC packages
           // Load and rregister the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection

            Connection con = DriverManager.getConnection(url,user,password);

            // Create a statement

            Statement stmt = con.createStatement();

            // Execute SQl queries

            String sql = "select * from customers";
            ResultSet resultSet = stmt.executeQuery(sql);

            // Process the results
            while (resultSet.next())
            {
                int customerNumber = resultSet.getInt("customerNumber");
                String customerName = resultSet.getString("customerName");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                String country = resultSet.getString("country");
                System.out.println(customerNumber + " ," + customerName +"," + "city" + " ," + "state" +"," +"country");


            }

            // close the connections
            resultSet.close();
            stmt.close();
            con.close();


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
