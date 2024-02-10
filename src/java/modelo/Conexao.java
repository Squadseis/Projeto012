
package modelo;

/**
 *
 * @author nalis
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String classDriver ="com.mysql.jdbc.Driver" ;

    String url = "jdbc:mysql://localhost/canoe";
    String user = "root";
    String pass = "";

    public Connection conectar() {
        Connection con = null;
        try {
            // carregar
            Class.forName(classDriver);

            con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public void fecharConexao(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public com.mysql.jdbc.Connection conexao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
