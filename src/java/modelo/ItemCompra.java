/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nalis
 */
public class ItemCompra {
    private int idItem;
    private int idCompra;
    private int idProduto;
    private int quantidade;

    // Construtores
    public ItemCompra() {
    }

    public ItemCompra(int idProduto, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Métodos CRUD

    // Create - Cadastrar ItemCompra
    public static ItemCompra cadastrarItemCompra(ItemCompra item) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
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

    // Read - Buscar ItensCompra por Compra
    public static List<ItemCompra> buscarItensCompra(int idCompra) {
        List<ItemCompra> itensCompra = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
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

    // Update - Atualizar ItemCompra
    public void atualizarItemCompra() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE ItemCompra SET id_compra = ?, id_produto = ?, quantidade = ? WHERE id_item = ?")) {

            preparedStatement.setInt(1, this.getIdCompra());
            preparedStatement.setInt(2, this.getIdProduto());
            preparedStatement.setInt(3, this.getQuantidade());
            preparedStatement.setInt(4, this.getIdItem());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }

    // Delete - Excluir ItemCompra
    public void excluirItemCompra() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "seu_usuario", "sua_senha");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM ItemCompra WHERE id_item = ?")) {

            preparedStatement.setInt(1, this.getIdItem());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }
}
