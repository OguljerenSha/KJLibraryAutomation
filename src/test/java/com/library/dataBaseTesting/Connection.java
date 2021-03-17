package com.library.dataBaseTesting;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.DB_Utility;

import java.sql.*;

public class Connection {
    public static void main(String[] args) throws SQLException {

//        String url = ConfigurationReader.getProperty("library1.database.url");
//        String username = ConfigurationReader.getProperty("library1.database.username");
//        String password = ConfigurationReader.getProperty("library1.database.password");
//
//        Connection connection = DriverManager.getConnection(url, username, password);
//        Statement statement = connection.

        DB_Utility.createConnection();
        DB_Utility.runQuery("SELECT * FROM books");

    }
}
