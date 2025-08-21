package com.davox.utils;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        try (Connection conn = ConnectBd.getConnection()) {
            System.out.println("✅ Conexión exitosa a Oracle");
        } catch (Exception e) {
            System.out.println("❌ Error de conexión:");
            e.printStackTrace();
        }
    }
}
