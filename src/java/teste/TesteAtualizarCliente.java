/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
/**
 *
 * @author nalis
 */
import cotrole.ClienteController;

public class TesteAtualizarCliente {

    public static void main(String[] args) {
        atualizarCliente(1, "Novo Nome", "novoemail@exemplo.com", "novasenha"); // Substitua 1 pelo ID do cliente desejado
    }

    private static void atualizarCliente(int idCliente, String novoNome, String novoEmail, String novaSenha) {
        ClienteController.atualizarCliente(idCliente, novoNome, novoEmail, novaSenha);
    }
}

    

