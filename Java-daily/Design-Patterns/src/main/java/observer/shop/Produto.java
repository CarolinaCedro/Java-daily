package observer.shop;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private Integer qtd;
    private String preco;


    public Produto(String nome, Integer qtd, String preco) {
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", qtd=" + qtd +
                ", preco='" + preco + '\'' +
                '}';
    }
}
