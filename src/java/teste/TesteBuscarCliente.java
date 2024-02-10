/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
package teste;
/**
 *
 * @author nalis
 */
import modelo.Cliente;
import cotrole.ClienteController;

public class TesteBuscarCliente {

    public static void main(String[] args) {
        buscarClientePorId(1); // Substitua 1 pelo ID do cliente desejado
    }

    private static void buscarClientePorId(int idCliente) {
        Cliente cliente = ClienteController.buscarClientePorId(idCliente);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}

