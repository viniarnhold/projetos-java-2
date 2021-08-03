package exercicio2.domain;

public class PessoaFisica extends Contribuintes {
    private Double gastoscsaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoscsaude) {
        super(nome, rendaAnual);
        this.gastoscsaude = gastoscsaude;
    }

    public Double getGastoscsaude() {
        return this.gastoscsaude;
    }

    public void setGastoscsaude(Double gastoscsaude) {
        this.gastoscsaude = gastoscsaude;
    }

    @Override
    public Double imposto() {
        double imp;
        if (super.getRendaAnual() < 20000.00){
            imp = (super.getRendaAnual() * 1.15) - (gastoscsaude / 2);
        }
        else {
            imp = (super.getRendaAnual() * 1.25) - (gastoscsaude / 2);
        }
        return imp;
    }

    

}
