package br.com.sicredi.dojo.venda.controller;

import br.com.sicredi.dojo.venda.model.ProdutoDTO;

public class Impressora {

    public static void imprimeNotaFiscal(Venda venda){
        System.out.println(
                "\nComprador: "+ venda.getComprador().getNome() +
                        "\nCPF: "+ venda.getComprador().getCpf()+
                        "\nEndereço: "+ venda.getComprador().getEndereco().toString()+
                        "\nVendedor: "+ venda.getVendedor().getNome()+
                        "\nProdutos: "+ getProdutos(venda)+
                        "\nValor Total: "+ getTotalValor(venda)
        );
    }
    public static String getProdutos(Venda venda){
        StringBuilder produtos = new StringBuilder();

        for (ProdutoDTO produto: venda.getProdutos()){
            produtos.append(produto.getNome())
                    .append("-")
                    .append(produto.getDescricao())
                    .append("-")
                    .append(produto.getMarca())
                    .append("-")
                    .append(produto.getCor())
                    .append("-")
                    .append(produto.getPreco())
                    .append("\n");
        }
        return produtos.toString();
    }
    public static double getTotalValor(Venda venda){
        double totalValor = 0.0;

        for (ProdutoDTO produto: venda.getProdutos()){
            totalValor += produto.getPreco() * produto.getQuantidade();
        }

        return totalValor;
    }

}
