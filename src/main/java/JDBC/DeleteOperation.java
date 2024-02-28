package JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteOperation {

    public  static void DeleteRecord() {
        String Query = "Delete from homework where id = 4";
        try (java.sql.Connection conn = Connection.getConnection();
             PreparedStatement ps = conn.prepareStatement(Query)) {
            ps.executeUpdate();
            System.out.println("record created deleted");


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}