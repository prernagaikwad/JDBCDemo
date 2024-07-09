import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCRead {
    public static void main(String[] args) {
        String selectsql = "select * from student";

        try (Connection con = JDBCDemo3.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(selectsql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String first_name = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                String Address = resultSet.getString("Address");
                int Marks = resultSet.getInt("Marks");
                System.out.println("ID : " + id + ", First_Name :" + first_name + ", Last_Name : " + last_name + ", Address : " + Address + ", Marks : " + Marks);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}