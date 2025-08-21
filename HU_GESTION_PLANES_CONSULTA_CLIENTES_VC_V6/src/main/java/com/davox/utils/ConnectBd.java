package com.davox.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectBd {
    private static final String URL = "jdbc:oracle:thin:@//10.203.21.21:1705/DAVOXQA";
    private static final String USER = "davox";
    private static final String PASSWORD = "Temporal01+"; // Reemplaza aquí

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        // ✅ Mostrar info en consola para ver si estás conectado al esquema correcto
        System.out.println("🔗 Conectado como: " + conn.getMetaData().getUserName());
        return conn;
    }
}
