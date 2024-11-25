package datamahasiswa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 
 */
public class koneksi {
    private static Connection conn;

    public static Connection getkoneksi() {
        String host = "jdbc:mysql://localhost/db_mahasiswa";
        String user = "root";
        String pass = "";

        try {
            conn = (Connection) DriverManager.getConnection(host, user, pass);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn;
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
