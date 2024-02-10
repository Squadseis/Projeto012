/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import cotrole.ProdutoController;
import modelo.Produto;

/**
 *
 * @author nalis
 */
public class TesteProduto {

    public static void main(String[] args) {
        // Teste de cadastro de novo produto
        Produto novoProduto = ProdutoController.cadastrarNovoProduto("Produto Teste", 10.0, 50);
        System.out.println("Novo produto cadastrado: " + novoProduto);

        // Teste de busca de produto por ID
        Produto produtoEncontrado = ProdutoController.buscarProdutoPorId(novoProduto.getIdProduto());
        System.out.println("Produto encontrado: " + produtoEncontrado);

        // Teste de atualização de produto
        ProdutoController.atualizarProduto(novoProduto.getIdProduto(), "Produto Atualizado", 15.0, 100);
        System.out.println("Produto atualizado.");

        // Teste de busca novamente para verificar atualização
        Produto produtoAtualizado = ProdutoController.buscarProdutoPorId(novoProduto.getIdProduto());
        System.out.println("Produto atualizado encontrado: " + produtoAtualizado);

        // Teste de exclusão de produto
        ProdutoController.excluirProduto(novoProduto.getIdProduto());
        System.out.println("Produto excluído.");

        // Teste de busca após exclusão para verificar se foi removido
        Produto produtoExcluido = ProdutoController.buscarProdutoPorId(novoProduto.getIdProduto());
        System.out.println("Produto excluído encontrado: " + produtoExcluido);
    }
}
