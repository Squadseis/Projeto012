/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotrole;

import PersistênciaDAO.ProdutoDAO;
import modelo.Produto;

/**
 *
 * @author nalis
 */

public class ProdutoController {

    public static Produto cadastrarNovoProduto(String nome, double preco, int estoque) {
        return ProdutoDAO.cadastrarProduto(nome, preco, estoque);
    }

    public static Produto buscarProdutoPorId(int idProduto) {
        return ProdutoDAO.buscarProduto(idProduto);
    }

    public static void atualizarProduto(int idProduto, String novoNome, double novoPreco, int novoEstoque) {
        Produto produto = ProdutoDAO.buscarProduto(idProduto);
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            produto.setEstoque(novoEstoque);
            ProdutoDAO.atualizarProduto(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void excluirProduto(int idProduto) {
        ProdutoDAO.excluirProduto(idProduto);
    }
}
