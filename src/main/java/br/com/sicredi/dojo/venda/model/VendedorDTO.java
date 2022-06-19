package br.com.sicredi.dojo.venda.model;

public class VendedorDTO extends PessoaDTO{


    private int qtdVendas;

    public VendedorDTO(String nome, String cpf, EnderecoDTO enderecoDTO) {
        super(nome, cpf, enderecoDTO);
        qtdVendas = 0;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void incrementaVendas()
    {
        qtdVendas ++;
    }

}
