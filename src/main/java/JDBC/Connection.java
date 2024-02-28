package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

    private static final String Db_uRl = "jdbc:postgresql://localhost:5432/postgres";
private static  String userName = "postgres";

private  static final String password ="petranos23";
public static java.sql.Connection getConnection () throws SQLException{




    return DriverManager.getConnection(Db_uRl,userName,password);
    }

}