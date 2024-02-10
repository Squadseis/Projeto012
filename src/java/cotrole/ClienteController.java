/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotrole;
import java.util.List;
import modelo.Cliente;
/**
 *
 * @author nalis
 */

public class ClienteController {

    // Método para cadastrar um novo cliente
    public static void cadastrarNovoCliente(String nome, String email, String senha) {
        Cliente novoCliente = Cliente.cadastrarCliente(nome, email, senha);
        // Pode incluir lógica adicional, como atualizar a visão ou realizar outras operações necessárias.
    }

    // Método para buscar um cliente pelo ID
    public static Cliente buscarClientePorId(int idCliente) {
        return Cliente.buscarCliente(idCliente);
    }

    // Método para atualizar um cliente existente
    public static void atualizarCliente(int idCliente, String novoNome, String novoEmail, String novaSenha) {
        Cliente clienteExistente = Cliente.buscarCliente(idCliente);

        if (clienteExistente != null) {
            clienteExistente.setNome(novoNome);
            clienteExistente.setEmail(novoEmail);
            clienteExistente.setSenha(novaSenha);

            clienteExistente.atualizarCliente();
            // Pode incluir lógica adicional, como atualizar a visão ou realizar outras operações necessárias.
        }
    }

    // Método para excluir um cliente pelo ID
    public static void excluirCliente(int idCliente) {
        Cliente clienteParaExcluir = Cliente.buscarCliente(idCliente);

        if (clienteParaExcluir != null) {
            clienteParaExcluir.excluirCliente();
            // Pode incluir lógica adicional, como atualizar a visão ou realizar outras operações necessárias.
        }
    }

    // Método para obter todos os clientes (exemplo)
    public static List<Cliente> obterTodosClientes() {
        // Implemente este método conforme necessário para obter uma lista de todos os clientes.
        // Pode incluir lógica adicional, como atualizar a visão ou realizar outras operações necessárias.
        return null;
    }
}
