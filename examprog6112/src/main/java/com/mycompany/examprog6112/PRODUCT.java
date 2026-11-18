public class Product implements IProducts {

    private String[] products = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    }

    
    private int[] sales = {
        {25, 18, 20}
        {15, 10, 12}
        {18, 15, 20}
    }

   
    public String[] getProducts() {
        return products;
    }

    public int[][] getSales() {
        return sales;
    }

    public void setSales(int[][] sales) {
        this.sales = sales
    }

    
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j+) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

    
    public double GetAverageProductsSold() {
        int total = GetTotalProductsSold(
        int count = 0
        for (int i = 0; i < sales.length; i++) {
            count = count + sales[i].length;
        }
        return (double) total / count;
    }

    
    public String GetMostPopularProduct() {
       
        int biggest = 0;
        String popular = "";
        int biggestForPopular = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > biggest) {
                    biggest = sales[i][j];
                    popular = products[i];
                    biggestForPopular = biggest
                }
            }
        }
        return popular + (" + biggestForPopular + ");
    }
}
