package br.com.sicredi.dojo.venda.model;

public class ClienteDTO extends PessoaDTO{

    private int qtdCompras;

    public ClienteDTO(String nome, String cpf, EnderecoDTO enderecoDTO) {
        super(nome, cpf, enderecoDTO);
        qtdCompras = 0;
    }

    public int getQtdCompras()
    {
        return qtdCompras;
    }

    public void incrementaCompras()
    {
     qtdCompras ++;
    }


}
