package JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadOperation {

    public static void readRecords(){

        String query = "SELECT actor_id,* FROM actor LIMIT 10;";

        try
                (java.sql.Connection conn = Connection.getConnection();
                 PreparedStatement ps = conn.prepareStatement(query);
                 ResultSet rs = ps.executeQuery()){

            while(rs.next()){
                int id =rs.getInt("actor_id");
                String firstName= rs.getString("first_name");
                String lastName =rs.getString("last_name");
                String lastUpdate = rs.getString("last_update");
                System.out.println(id+ " "+ firstName+ " "+ lastName);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }}