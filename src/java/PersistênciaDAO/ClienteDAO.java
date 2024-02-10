/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistênciaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author nalis
 */

public class ClienteDAO {

    // Método para criar tabela 'clientes' no banco de dados
    public static void criarTabelaClientes() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "")) {

            String sql = "CREATE TABLE IF NOT EXISTS clientes ("
                    + "id_cliente INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(255) NOT NULL,"
                    + "email VARCHAR(255) NOT NULL,"
                    + "senha VARCHAR(255) NOT NULL"
                    + ")";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.executeUpdate();
                System.out.println("Tabela 'clientes' criada com sucesso!");
            }

        } catch (SQLException e) {
        }
    }
}
