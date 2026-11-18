import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        PrintProduct printer = new PrintProduct();

        String[] names = product.getProducts();
        int[][] sales = new int[3][3];

        
        for (int i = 0; i < 3; i++) {
            for (int month = 1; month <= 3; month++) {
                System.out.print("Enter number of sales for month " + month + " for " + names[i] + " mattress: ");
                sales[i][month - 1] = sc.nextInt();
            }
        }

        product.setSales(sales);

        // Report
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("********************************************");
        printer.PrintTotal(product.GetTotalProductsSold());
        printer.PrintAverage(product.GetAverageProductsSold());
        printer.PrintMostPopular(product.GetMostPopularProduct());
    }
}