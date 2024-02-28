package JDBC;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateOperation {
    public  static  void CreateRecord(){
        String Query = "insert Into homework (name,email,address,department_id)"+
                "Values ('Alex jobs','John@gmail.com','123-345-876',342)";

                try (java.sql.Connection conn = Connection.getConnection();
                     PreparedStatement ps = conn.prepareStatement(Query)){
                         ps.executeUpdate();
                    System.out.println("record created sucefully");
                } catch (SQLException e) {
                    e.printStackTrace();
                }}}




