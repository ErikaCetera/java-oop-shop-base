package org.lessons.java.shop;

import java.math.BigDecimal;


public class Main {
public static void main(String[] args) {


    Product product1 = new Product("Product Name", "Product Description", new BigDecimal("19.99"), new BigDecimal("0.22"));
   
   System.out.println(product1.code);
   System.out.println(product1.getBasicPrice());
   System.out.println(product1.getPriceVat());
   System.out.println(product1.getCodeName());
   

}

      
}

