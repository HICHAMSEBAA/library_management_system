package DataBase;

import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInfo{

    private static final String HOST = "127.0.0.1";
    private static final int PORT = 3306;
    private static final String DB_NAME = "Library";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "";

    private static final String URL = String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,DB_NAME);

    public static Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public static boolean saveOrUpdate(String query) throws SQLException {
        try (Connection con = getConnection(); Statement stmt = con.createStatement()) {
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException e) {
            System.err.println("Exception at execQuery : DB_info " + e.getLocalizedMessage());
            return false;
        }
    }


}
