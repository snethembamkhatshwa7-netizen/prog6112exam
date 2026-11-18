public class ProductCalculations implements IProductCalculations {

    private double price;

    
    public ProductCalculations(double price) {
        this.price = price;
    }


    public double GetVat() {
        return price * 0.15; // VAT
    }

   
    public double GetCommission() {
        return price * 0.05; //  Commission
    }

 
    public double GetTotal() {
        return price + GetVat() + GetCommission();
    }
}