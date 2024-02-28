package JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {

    public static void updateRecord() {
        String sql = "UPDATE actor SET first_name = 'barnabas' WHERE actor_id = 1  ";

        try (java.sql.Connection conn = Connection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            System.out.println("Record updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}