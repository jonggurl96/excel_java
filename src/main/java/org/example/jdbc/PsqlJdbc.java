package org.example.jdbc;

import org.example.entity.Drw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class PsqlJdbc {
    
    public void update(List<Drw> list) throws Exception {
        Class.forName("org.postgresql.Driver");
    
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "postgres";
    
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        System.out.printf("Connection: %s", conn);
    
        for(Drw d :
                list) {
            String query = "insert into drw(drw_no, bnus_no, " +
                    "drw_no_date, drwt_no1, drwt_no2, " +
                    "drwt_no3, drwt_no4, drwt_no5, drwt_no6, " +
                    "first_winamnt) " + d.values();
//            System.out.println(query);
            stmt.executeUpdate(query);
        }
    }
}
