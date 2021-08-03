package exerciciodefixacaopolimorfismo.entities;

public final class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }
    @Override
    public String toString(){
        return super.getName() + " $ " + String.format("%.2f", totalPrice()) 
                    + String.format("(Customs fee: $ %.2f)", customsFee);
    }
}
