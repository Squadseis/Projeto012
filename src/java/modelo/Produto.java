/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author nalis
 */

import java.sql.*;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;
    private int estoque;

    // Construtores
    public Produto() {
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e Setters
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Métodos CRUD

    // Create - Cadastrar Produto
    public static Produto cadastrarProduto(String nome, double preco, int estoque) {
        Produto novoProduto = new Produto(nome, preco, estoque);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
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

    // Read - Buscar Produto
    public static Produto buscarProduto(int idProduto) {
        Produto produtoEncontrado = null;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
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

    // Update - Atualizar Produto
    public void atualizarProduto() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Produto SET nome = ?, preco = ?, estoque = ? WHERE id_produto = ?")) {

            preparedStatement.setString(1, this.getNome());
            preparedStatement.setDouble(2, this.getPreco());
            preparedStatement.setInt(3, this.getEstoque());
            preparedStatement.setInt(4, this.getIdProduto());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }

    // Delete - Excluir Produto
    public void excluirProduto() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Produto WHERE id_produto = ?")) {

            preparedStatement.setInt(1, this.getIdProduto());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }
}
