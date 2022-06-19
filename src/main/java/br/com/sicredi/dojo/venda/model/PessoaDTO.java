package br.com.sicredi.dojo.venda.model;

public class PessoaDTO {

    private String nome;
    private String cpf;
    private EnderecoDTO endereco;

    public PessoaDTO(String nome, String cpf, EnderecoDTO endereco)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO enderecoDTO) {
        this.endereco = enderecoDTO;
    }
}
