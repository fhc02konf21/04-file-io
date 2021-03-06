package org.campus02.productdemo;

public class DemoApp {
    public static void main(String[] args) {

        try {
            // save entries
            ProductManager pm = new ProductManager();
            pm.add(new Product("Laptop", 1200.0,"Consumer-Goods"));
            pm.add(new Product("Golf 8", 39_512.9,"Automobile"));
            pm.add(new Product("Banana", 2.89,"Fruits"));
            pm.save("D:\\temp\\products.dat");

            System.out.println("saved");
        } catch (ProductFileExcecption e) {
            e.printStackTrace();
        }


        try {
            // load entries
            System.out.println("loading entries ...");
            ProductManager pm = new ProductManager();
            pm.load("D:\\temp\\products.dat");
            System.out.println("pm = " + pm);
        } catch (ProductFileExcecption e) {
            e.printStackTrace();
        }

    }
}
