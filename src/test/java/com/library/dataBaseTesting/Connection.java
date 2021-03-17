package com.library.dataBaseTesting;

import com.library.utilities.ConfigurationReader;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public static void main(String[] args) {

        String url = ConfigurationReader.getProperty("library1.database.url");
        String username = ConfigurationReader.getProperty("library1.database.username");
        String password = ConfigurationReader.getProperty("library1.database.password");

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.getMessage();
        }

    }
}
