/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistênciaDAO;

/**
 *
 * @author nalis
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Produto;

public class ProdutoDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/canoe";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Produto cadastrarProduto(String nome, double preco, int estoque) {
        Produto novoProduto = new Produto(nome, preco, estoque);

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Produto (nome, preco, estoque) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, novoProduto.getNome());
            preparedStatement.setDouble(2, novoProduto.getPreco());
            preparedStatement.setInt(3, novoProduto.getEstoque());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        novoProduto.setIdProduto(generatedKeys.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
        }

        return novoProduto;
    }

    public static Produto buscarProduto(int idProduto) {
        Produto produtoEncontrado = null;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Produto WHERE id_produto = ?")) {

            preparedStatement.setInt(1, idProduto);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    produtoEncontrado = new Produto();
                    produtoEncontrado.setIdProduto(resultSet.getInt("id_produto"));
                    produtoEncontrado.setNome(resultSet.getString("nome"));
                    produtoEncontrado.setPreco(resultSet.getDouble("preco"));
                    produtoEncontrado.setEstoque(resultSet.getInt("estoque"));
                }
            }
        } catch (SQLException e) {
        }

        return produtoEncontrado;
    }

    public static void atualizarProduto(Produto produto) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Produto SET nome = ?, preco = ?, estoque = ? WHERE id_produto = ?")) {

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setInt(3, produto.getEstoque());
            preparedStatement.setInt(4, produto.getIdProduto());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public static void excluirProduto(int idProduto) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Produto WHERE id_produto = ?")) {

            preparedStatement.setInt(1, idProduto);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }
}
