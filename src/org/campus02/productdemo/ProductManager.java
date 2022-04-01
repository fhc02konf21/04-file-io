package org.campus02.productdemo;

import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void add(Product p) {
        products.add(p);
    }

    public void save(String path) {

    }

    public void load(String path) {

    }
}
