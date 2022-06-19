package br.com.sicredi.dojo.venda.controller;

import br.com.sicredi.dojo.venda.model.ClienteDTO;
import br.com.sicredi.dojo.venda.model.ProdutoDTO;
import br.com.sicredi.dojo.venda.model.VendedorDTO;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private ClienteDTO comprador;
    private VendedorDTO vendedor;
    private List<ProdutoDTO> produtos;

    public Venda(ClienteDTO comprador, VendedorDTO vendedor) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        vendedor.incrementaVendas();
        comprador.incrementaCompras();
        produtos = new ArrayList<>();
    }


    public ClienteDTO getComprador() {
        return comprador;
    }

    public VendedorDTO getVendedor() {
        return vendedor;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(ProdutoDTO produto){
        produtos.add(produto);
    }

    public void removerProduto(ProdutoDTO produto){
        produtos.remove(produto);
    }

}
