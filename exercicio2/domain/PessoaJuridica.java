package exercicio2.domain;

public class PessoaJuridica extends Contribuintes {

    private Integer numeroDeFuncionarios;

    public PessoaJuridica(){
        super();
    }
    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return this.numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double imposto() {
        double imp;
        if (numeroDeFuncionarios > 10){
            imp = (super.getRendaAnual() * 1.14);
        }
        else {
            imp = (super.getRendaAnual() * 1.16);
        }
        return imp;
    }
    
    
}
