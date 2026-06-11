package form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KelasKoneksi {

    public static Connection konDB() {
        Connection con = null;

        try {
            // WAJIB: load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // WAJIB: nama database benar
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kampus?useSSL=false&serverTimezone=UTC",
                "root",
                ""
            );

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(
                null,
                "ERROR: MySQL Connector JAR belum ditambahkan!",
                "Driver Error",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                null,
                "ERROR Koneksi Database:\n" + e.getMessage(),
                "SQL Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
        return con;
    }
}
