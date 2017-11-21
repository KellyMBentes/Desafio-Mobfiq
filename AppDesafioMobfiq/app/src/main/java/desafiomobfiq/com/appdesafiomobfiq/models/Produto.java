package desafiomobfiq.com.appdesafiomobfiq.models;

public class Produto {

    private String descricao;
    private double precoTabela;
    private double precoFinal;

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoTabela() {
        return precoTabela;
    }

    public void setPrecoTabela(double precoTabela) {
        this.precoTabela = precoTabela;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
