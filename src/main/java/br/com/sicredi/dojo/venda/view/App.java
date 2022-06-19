package br.com.sicredi.dojo.venda.view;

import br.com.sicredi.dojo.venda.controller.Venda;
import br.com.sicredi.dojo.venda.model.*;
import static br.com.sicredi.dojo.venda.controller.Impressora.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<VendedorDTO> listaVendedores = new ArrayList<>();
        List<ClienteDTO> listaClientes = new ArrayList<>();
        List<Venda> listaVendas = inicializaVendas(listaVendedores, listaClientes);

        for (Venda venda : listaVendas)
        {
            imprimeNotaFiscal(venda);
            imprimeNotaFiscal(venda);
        }




    }

    public static List<Venda> inicializaVendas(List<VendedorDTO> listaVendedores, List<ClienteDTO>  listaClientes){
        List<Venda> listaVendas = new ArrayList<>();
        EnderecoDTO endereco = new EnderecoDTO();
        endereco.setBairro("guajuviras");
        endereco.setCep("96750-000");
        endereco.setRua("afonso manfroid");
        endereco.setCidade("minas do leao");
        ClienteDTO compradorRodrigo = new ClienteDTO("Rodrigo Oliveira de Freitas", "01234567890", endereco);
        listaClientes.add(compradorRodrigo);
        ClienteDTO compradorJoao    = new ClienteDTO("Joao Américo dos Santos", "10928374657", endereco);
        listaClientes.add(compradorJoao);
        VendedorDTO vendedorAlex = new VendedorDTO("Alex de Paula", "09876543210", endereco);
        listaVendedores.add(vendedorAlex);
        Venda venda1 = new Venda(compradorRodrigo, vendedorAlex);
        listaVendas.add(venda1);
        venda1.adicionarProduto(new ProdutoDTO("Teclado",     "Logitech", "Wireless", CorEnum.AZUL, 1,80.00));
        venda1.adicionarProduto(new ProdutoDTO("Mouse",       "Logitech", "Wireless", CorEnum.VERMELHO, 1, 70.00));
        venda1.adicionarProduto(new ProdutoDTO("Processador", "AMD",      "Ryzen5 5600", CorEnum.PRETO, 1,  2500.00));
        venda1.adicionarProduto(new ProdutoDTO("Memoria",     "Corsair",  "8gb", CorEnum.PRETO, 2,           400.00));
        venda1.adicionarProduto(new ProdutoDTO("Gabinete",    "Pichau",   "Gamer", CorEnum.BRANCO, 1,         200.00));
        venda1.adicionarProduto(new ProdutoDTO("Fonte",       "Corsair",  "500w", CorEnum.PRETO, 1,          400.00));
        Venda venda2 = new Venda(compradorJoao, vendedorAlex);
        listaVendas.add(venda2);
        venda2.adicionarProduto(new ProdutoDTO("Teclado",     "Logitech", "Wireless", CorEnum.AZUL, 1,80.00));
        venda2.adicionarProduto(new ProdutoDTO("Mouse",       "Logitech", "Wireless", CorEnum.VERMELHO, 1, 70.00));
        return listaVendas;
    }


}
