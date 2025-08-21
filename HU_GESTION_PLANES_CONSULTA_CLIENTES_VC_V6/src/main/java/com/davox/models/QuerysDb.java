package com.davox.models;

import com.davox.utils.ConnectBd;

import java.sql.*;

public class QuerysDb {
    public static PlanVozCorporativo obtenerDatosDelPlan(String codigoPlan) {
        String query = "SELECT * FROM DAVOX.planes_voz_corporativa WHERE COD_PLAN = ?";
        try (Connection conn = ConnectBd.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, codigoPlan);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("COD_PLAN: " + rs.getString("COD_PLAN"));
                System.out.println("DESCRIPCION: " + rs.getString("DESCRIPCION"));
                System.out.println("TIPO_PLAN: " + rs.getString("TIPO_PLAN"));
                System.out.println("UNIDADES_INCL: " + rs.getString("UNIDADES_INCL"));
                System.out.println("CARGO_FIJO: " + rs.getString("CARGO_FIJO"));
                System.out.println("VALOR_MINUTO_LDN_INCLUIDO: " + rs.getString("VALOR_MINUTO_LDN_INCLUIDO"));
                System.out.println("VALOR_MINUTO_LDI_INCLUIDO: " + rs.getString("VALOR_MINUTO_LDI_INCLUIDO"));
                System.out.println("VALOR_MINUTO_LE_INCLUIDO: " + rs.getString("VALOR_MINUTO_LE_INCLUIDO"));
                System.out.println("VALOR_MINUTO_LDN_ADICIONAL: " + rs.getString("VALOR_MINUTO_LDN_ADICIONAL"));
                System.out.println("VALOR_MINUTO_LDI_ADICIONAL: " + rs.getString("VALOR_MINUTO_LDI_ADICIONAL"));
                System.out.println("VALOR_MINUTO_LE_ADICIONAL: " + rs.getString("VALOR_MINUTO_LE_ADICIONAL"));
                return new PlanVozCorporativo(
                        rs.getString("COD_PLAN"),
                        rs.getString("DESCRIPCION"),
                        rs.getString("TIPO_PLAN"),
                        rs.getString("UNIDADES_INCL"),
                        rs.getString("CARGO_FIJO"),
                        rs.getString("VALOR_MINUTO_LDN_INCLUIDO"),
                        rs.getString("VALOR_MINUTO_LDI_INCLUIDO"),
                        rs.getString("VALOR_MINUTO_LE_INCLUIDO"),
                        rs.getString("VALOR_MINUTO_LDN_ADICIONAL"),
                        rs.getString("VALOR_MINUTO_LDI_ADICIONAL"),
                        rs.getString("VALOR_MINUTO_LE_ADICIONAL")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static String getBonosPlanes(){
        return null;
    }
}
