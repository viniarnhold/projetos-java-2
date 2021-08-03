package exercicio2.domain;

public abstract class Contribuintes {
    private String nome;
    private Double rendaAnual;

    public Contribuintes() {
    }

    public Contribuintes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return this.rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();
}
