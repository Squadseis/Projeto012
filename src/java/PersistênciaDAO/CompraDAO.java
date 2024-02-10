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
import java.util.ArrayList;
import modelo.Compra;

public class CompraDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/canoe";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static final String INSERIR_COMPRA = "INSERT INTO Compra (id_cliente, data) VALUES (?, ?)";
    private static final String BUSCAR_COMPRA_POR_ID = "SELECT * FROM Compra WHERE id_compra = ?";
    private static final String ATUALIZAR_COMPRA = "UPDATE Compra SET id_cliente = ?, data = ? WHERE id_compra = ?";
    private static final String EXCLUIR_COMPRA = "DELETE FROM Compra WHERE id_compra = ?";

    public static Compra inserirCompra(int idCliente, String data) {
        Compra novaCompra = null;
        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conexao.prepareStatement(INSERIR_COMPRA, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pstmt.setInt(1, idCliente);
            pstmt.setString(2, data);
            int linhasAfetadas = pstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        int idCompra = rs.getInt(1);
                        novaCompra = new Compra(idCompra, idCliente, new ArrayList<>(), data);
                    }
                }
            }
        } catch (SQLException ex) {
        }
        return novaCompra;
    }

    public static Compra buscarCompraPorId(int idCompra) {
        Compra compraEncontrada = null;
        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conexao.prepareStatement(BUSCAR_COMPRA_POR_ID)) {
            pstmt.setInt(1, idCompra);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int idCliente = rs.getInt("id_cliente");
                    String data = rs.getString("data");
                    compraEncontrada = new Compra(idCompra, idCliente, new ArrayList<>(), data);
                }
            }
        } catch (SQLException ex) {
        }
        return compraEncontrada;
    }

    public static void atualizarCompra(int idCompra, int idCliente, String data) {
        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conexao.prepareStatement(ATUALIZAR_COMPRA)) {
            pstmt.setInt(1, idCliente);
            pstmt.setString(2, data);
            pstmt.setInt(3, idCompra);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public static void excluirCompra(int idCompra) {
        try (Connection conexao = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conexao.prepareStatement(EXCLUIR_COMPRA)) {
            pstmt.setInt(1, idCompra);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
        }
    }
}

