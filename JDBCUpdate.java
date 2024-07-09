import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdate {

    public static void main(String[] args) {

        String updateSQL = " update student set id = ? where Address = ? ";

        try (Connection con = JDBCDemo3.getConnection();
             PreparedStatement preparedStatement = con.prepareStatement(updateSQL))
        {
            preparedStatement.setInt(1, 34);
            preparedStatement.setString(2, "Hyderabad");

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows updated:" + rowsAffected);


        } catch (SQLException e)

        {
            e.printStackTrace();
        }


    }
}
