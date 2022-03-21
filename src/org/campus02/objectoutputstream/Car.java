package org.campus02.objectoutputstream;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
