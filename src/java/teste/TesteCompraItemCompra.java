/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
/**
 *
 * @author nalis
 */
import java.util.ArrayList;
import java.util.List;
import modelo.Compra;
import modelo.ItemCompra;

/**
 *
 * @author nalis
 */
public class TesteCompraItemCompra {

    public static void main(String[] args) {
        // Testando o CRUD para Compra e ItemCompra

        // Criando alguns itens de compra
        ItemCompra item1 = new ItemCompra(1, 2); // Exemplo: produto com id 1 e quantidade 2
        ItemCompra item2 = new ItemCompra(3, 1); // Exemplo: produto com id 3 e quantidade 1

        // Criando uma lista de itens de compra
        List<ItemCompra> itensCompra = new ArrayList<>();
        itensCompra.add(item1);
        itensCompra.add(item2);

        // Criando uma compra com os itens criados
        Compra novaCompra = Compra.realizarCompra(1, itensCompra); // Exemplo: cliente com id 1

        // Verificando se a compra foi realizada com sucesso
        if (novaCompra != null) {
            System.out.println("Compra realizada com sucesso!");
            System.out.println("ID da Compra: " + novaCompra.getIdCompra());
            System.out.println("ID do Cliente: " + novaCompra.getIdCliente());
            System.out.println("Data da Compra: " + novaCompra.getData());

            // Exibindo os itens da compra
            List<ItemCompra> itens = novaCompra.getItens();
            System.out.println("Itens da Compra:");
            for (ItemCompra item : itens) {
                System.out.println("ID do Item: " + item.getIdItem());
                System.out.println("ID do Produto: " + item.getIdProduto());
                System.out.println("Quantidade: " + item.getQuantidade());
            }

            // Testando a busca de uma compra pelo ID
            System.out.println("\nTestando a busca de uma compra pelo ID...");
            Compra compraEncontrada = Compra.buscarCompra(novaCompra.getIdCompra());
            if (compraEncontrada != null) {
                System.out.println("Compra encontrada:");
                System.out.println("ID da Compra: " + compraEncontrada.getIdCompra());
                System.out.println("ID do Cliente: " + compraEncontrada.getIdCliente());
                System.out.println("Data da Compra: " + compraEncontrada.getData());
                // Exibindo os itens da compra encontrada
                List<ItemCompra> itensEncontrados = compraEncontrada.getItens();
                System.out.println("Itens da Compra:");
                for (ItemCompra item : itensEncontrados) {
                    System.out.println("ID do Item: " + item.getIdItem());
                    System.out.println("ID do Produto: " + item.getIdProduto());
                    System.out.println("Quantidade: " + item.getQuantidade());
                }
            } else {
                System.out.println("Compra não encontrada.");
            }

            // Testando a exclusão da compra
            System.out.println("\nTestando a exclusão da compra...");
            novaCompra.excluirCompra();
            System.out.println("Compra excluída com sucesso!");

            // Verificando se a compra foi excluída corretamente
            Compra compraExcluida = Compra.buscarCompra(novaCompra.getIdCompra());
            if (compraExcluida == null) {
                System.out.println("Compra foi excluída do banco de dados.");
            } else {
                System.out.println("Erro: A compra ainda existe no banco de dados.");
            }
        } else {
            System.out.println("Erro ao realizar a compra.");
        }
    }
}
