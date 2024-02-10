/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistênciaDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemCompra;
/**
 *
 * @author nalis
 */

public class ItemCompraDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/canoe";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static ItemCompra cadastrar(ItemCompra item) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO ItemCompra (id_compra, id_produto, quantidade) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, item.getIdCompra());
            preparedStatement.setInt(2, item.getIdProduto());
            preparedStatement.setInt(3, item.getQuantidade());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        item.setIdItem(generatedKeys.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
        }

        return item;
    }

    public static List<ItemCompra> buscarItensCompra(int idCompra) {
        List<ItemCompra> itensCompra = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ItemCompra WHERE id_compra = ?")) {

            preparedStatement.setInt(1, idCompra);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    ItemCompra item = new ItemCompra();
                    item.setIdItem(resultSet.getInt("id_item"));
                    item.setIdCompra(resultSet.getInt("id_compra"));
                    item.setIdProduto(resultSet.getInt("id_produto"));
                    item.setQuantidade(resultSet.getInt("quantidade"));
                    itensCompra.add(item);
                }
            }
        } catch (SQLException e) {
        }

        return itensCompra;
    }

    public static void atualizar(ItemCompra item) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE ItemCompra SET id_compra = ?, id_produto = ?, quantidade = ? WHERE id_item = ?")) {

            preparedStatement.setInt(1, item.getIdCompra());
            preparedStatement.setInt(2, item.getIdProduto());
            preparedStatement.setInt(3, item.getQuantidade());
            preparedStatement.setInt(4, item.getIdItem());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public static void excluir(ItemCompra item) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM ItemCompra WHERE id_item = ?")) {

            preparedStatement.setInt(1, item.getIdItem());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }
}
