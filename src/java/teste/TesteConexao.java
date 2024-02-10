

package teste;
/**
 *
 * @author nalis
 */
import java.sql.Connection;
import modelo.Conexao;

public class TesteConexao {
    public static void main(String[] args) {
        Conexao conexaoObjeto = new Conexao();
        Connection conexao = conexaoObjeto.conectar();
        
        if (conexao != null) {
            System.out.println("Conexão estabelecida com sucesso!");
            // Faça qualquer operação com o banco de dados aqui, se necessário
            // Lembre-se de fechar a conexão quando terminar
            conexaoObjeto.fecharConexao(conexao);
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }
    }
}
