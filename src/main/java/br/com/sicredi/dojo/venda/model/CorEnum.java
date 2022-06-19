package br.com.sicredi.dojo.venda.model;

public enum CorEnum {
    PRETO("preto"),
    BRANCO("branco"),
    AZUL("azul"),
    VERMELHO("vermelho");

    private String cor;

    CorEnum(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
