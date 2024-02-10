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

public class TesteCadastroCliente {

    public static void main(String[] args) {
        cadastrarNovoCliente();
    }

    private static void cadastrarNovoCliente() {
        ClienteController.cadastrarNovoCliente("Nome", "email@exemplo.com", "senha");
    }
}

