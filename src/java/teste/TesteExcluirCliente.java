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

public class TesteExcluirCliente {

    public static void main(String[] args) {
        excluirCliente(1); // Substitua 1 pelo ID do cliente desejado
    }

    private static void excluirCliente(int idCliente) {
        ClienteController.excluirCliente(idCliente);
    }
}

