package org.campus02.productdemo;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void add(Product p) {
        products.add(p);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }

    public void save(String path) throws ProductFileExcecption {

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(products);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new ProductFileExcecption("Fehler beim Speichern von " + path, e);
        } catch (IOException e) {
            throw new ProductFileExcecption("Fehler beim Speichern von " + path, e);
        }
        finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void load(String path) throws ProductFileExcecption {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)))
        {
            products = (ArrayList<Product>) ois.readObject();

        } catch (FileNotFoundException e) {
            throw new ProductFileExcecption("Fehler beim Laden von " + path, e);
        } catch (IOException e) {
            throw new ProductFileExcecption("Fehler beim Laden von " + path, e);
        } catch (ClassNotFoundException e) {
            throw new ProductFileExcecption("Falsches Dateiformat beim Laden von " + path , e);
        } /*finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
