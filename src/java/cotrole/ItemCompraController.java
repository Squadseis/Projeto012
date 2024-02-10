/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotrole;
import PersistênciaDAO.ItemCompraDAO;
import java.util.List;
import modelo.ItemCompra;
/**
 *
 * @author nalis
 */
public class ItemCompraController {

    public static ItemCompra cadastrarItemCompra(int idCompra, int idProduto, int quantidade) {
        ItemCompra item = new ItemCompra(idProduto, quantidade);
        return ItemCompraDAO.cadastrar(item);
    }

    public static List<ItemCompra> buscarItensCompra(int idCompra) {
        return ItemCompraDAO.buscarItensCompra(idCompra);
    }

    public static void atualizarItemCompra(ItemCompra item) {
        ItemCompraDAO.atualizar(item);
    }

    public static void excluirItemCompra(ItemCompra item) {
        ItemCompraDAO.excluir(item);
    }
}
