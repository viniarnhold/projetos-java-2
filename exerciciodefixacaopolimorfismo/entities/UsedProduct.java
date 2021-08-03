package exerciciodefixacaopolimorfismo.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public SimpleDateFormat getSdf() {
        return this.sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public Date getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String toString(){
        return super.toString() + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }    
}
