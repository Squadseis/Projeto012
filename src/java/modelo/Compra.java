package modelo;
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
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int idCompra;
    private int idCliente;
    private List<ItemCompra> itens;
    private String data;

    // Construtores
    public Compra() {
        this.itens = new ArrayList<>();
    }

    public Compra(int idCompra, int idCliente, List<ItemCompra> itens, String data) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.itens = itens;
        this.data = data;
    }

    // Getters e Setters
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    // Métodos CRUD

    // Create - Realizar Compra
    public static Compra realizarCompra(int idCliente, List<ItemCompra> itens) {
        Compra novaCompra = new Compra();
        novaCompra.setIdCliente(idCliente);
        novaCompra.setItens(itens);
        novaCompra.setData("2024-02-05"); // Substitua pela lógica real de obtenção da data

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Compra (id_cliente, data) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setInt(1, novaCompra.getIdCliente());
            preparedStatement.setString(2, novaCompra.getData());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        novaCompra.setIdCompra(generatedKeys.getInt(1));
                    }
                }
            }

            // Agora, inserir os itens da compra na tabela ItemCompra
            for (ItemCompra item : novaCompra.getItens()) {
                item.setIdCompra(novaCompra.getIdCompra());
                ItemCompra.cadastrarItemCompra(item); // Assumindo que existe um método para cadastrar item de compra
            }

        } catch (SQLException e) {
        }

        return novaCompra;
    }

    // Read - Buscar Compra
    public static Compra buscarCompra(int idCompra) {
        Compra compraEncontrada = null;

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Compra WHERE id_compra = ?")) {

            preparedStatement.setInt(1, idCompra);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    compraEncontrada = new Compra();
                    compraEncontrada.setIdCompra(resultSet.getInt("id_compra"));
                    compraEncontrada.setIdCliente(resultSet.getInt("id_cliente"));
                    compraEncontrada.setData(resultSet.getString("data"));

                    // Recuperar itens da compra
                    List<ItemCompra> itensCompra = ItemCompra.buscarItensCompra(compraEncontrada.getIdCompra());
                    compraEncontrada.setItens(itensCompra);
                }
            }
        } catch (SQLException e) {
        }

        return compraEncontrada;
    }

    // Update - Atualizar Compra
    public void atualizarCompra() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Compra SET id_cliente = ?, data = ? WHERE id_compra = ?")) {

            preparedStatement.setInt(1, this.getIdCliente());
            preparedStatement.setString(2, this.getData());
            preparedStatement.setInt(3, this.getIdCompra());

            preparedStatement.executeUpdate();

            // Atualizar itens da compra (se necessário)
            for (ItemCompra item : this.getItens()) {
                item.atualizarItemCompra(); // Assumindo que existe um método para atualizar item de compra
            }

        } catch (SQLException e) {
        }
    }

        // Delete - Excluir Compra
    public void excluirCompra() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/canoe", "root", "");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Compra WHERE id_compra = ?")) {

            preparedStatement.setInt(1, this.getIdCompra());

            preparedStatement.executeUpdate();

            // Excluir itens da compra (se necessário)
            for (ItemCompra item : this.getItens()) {
                item.excluirItemCompra(); // Assumindo que existe um método para excluir item de compra
            }

        } catch (SQLException e) {
        }
    }
}
