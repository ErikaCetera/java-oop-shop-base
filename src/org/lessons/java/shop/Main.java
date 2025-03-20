package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Product Name", "Product Description", new BigDecimal("19.99"),
                new BigDecimal("0.22"));

        Product product2 = new Product("Product Name2", new BigDecimal("19.99"));

        System.out.println(product1.getBasicPrice());
        System.out.println(product1.getPriceVat());
        System.out.println(product1.getCodeName());
        System.out.println(product1.getCode());


        System.out.println(product2.getProduct());
        
    }

}
