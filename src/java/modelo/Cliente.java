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

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String senha;

    // Construtores
    public Cliente() {
    }

    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Getters e Setters (adicionando para idCliente)
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Métodos CRUD

    // Create - Cadastrar Cliente
    public static Cliente cadastrarCliente(String nome, String email, String senha) {
        Cliente novoCliente = new Cliente(nome, email, senha);

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Cliente (nome, email, senha) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, novoCliente.getNome());
            preparedStatement.setString(2, novoCliente.getEmail());
            preparedStatement.setString(3, novoCliente.getSenha());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        novoCliente.setIdCliente(generatedKeys.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
        }

        return novoCliente;
    }

    // Read - Buscar Cliente
    public static Cliente buscarCliente(int idCliente) {
        Cliente clienteEncontrado = null;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Cliente WHERE id_cliente = ?")) {

            preparedStatement.setInt(1, idCliente);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    clienteEncontrado = new Cliente();
                    clienteEncontrado.setIdCliente(resultSet.getInt("id_cliente"));
                    clienteEncontrado.setNome(resultSet.getString("nome"));
                    clienteEncontrado.setEmail(resultSet.getString("email"));
                    clienteEncontrado.setSenha(resultSet.getString("senha"));
                }
            }
        } catch (SQLException e) {
        }

        return clienteEncontrado;
    }

    // Update - Atualizar Cliente
    public void atualizarCliente() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Cliente SET nome = ?, email = ?, senha = ? WHERE id_cliente = ?")) {

            preparedStatement.setString(1, this.getNome());
            preparedStatement.setString(2, this.getEmail());
            preparedStatement.setString(3, this.getSenha());
            preparedStatement.setInt(4, this.getIdCliente());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }

    // Delete - Excluir Cliente
    public void excluirCliente() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Cliente WHERE id_cliente = ?")) {

            preparedStatement.setInt(1, this.getIdCliente());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
        }
    }
}

