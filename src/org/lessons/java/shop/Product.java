package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    // attributi
    public int code;
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal vat;

    // capicità
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        Random r = new Random();
        int max = 10;
        this.code = r.nextInt(max);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    public BigDecimal getBasicPrice() {
        return this.price;
    }

    public BigDecimal getPriceVat() {
        return price.add(price.multiply(vat)).setScale(2, RoundingMode.DOWN);
    }

    public String getCodeName() {
        return code + "-" + name;
    }

}
