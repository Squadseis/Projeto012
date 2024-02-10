/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotrole;
import java.util.List;
import modelo.Compra;
import modelo.ItemCompra;
/**
 *
 * @author nalis
 */
public class CompraController {

    public static Compra realizarNovaCompra(int idCliente, List<ItemCompra> itens) {
        return Compra.realizarCompra(idCliente, itens);
    }

    public static Compra buscarCompraPorId(int idCompra) {
        return Compra.buscarCompra(idCompra);
    }

    public static void atualizarCompra(int idCompra, int idCliente, String data) {
        Compra compra = Compra.buscarCompra(idCompra);
        if (compra != null) {
            compra.setIdCliente(idCliente);
            compra.setData(data);
            compra.atualizarCompra();
        } else {
            System.out.println("Compra não encontrada.");
        }
    }

    public static void excluirCompra(int idCompra) {
        Compra compra = Compra.buscarCompra(idCompra);
        if (compra != null) {
            compra.excluirCompra();
            System.out.println("Compra excluída.");
        } else {
            System.out.println("Compra não encontrada.");
        }
    }
}
