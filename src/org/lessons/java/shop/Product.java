package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    // attributi
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;


    // capicità

    //costruttore 1
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        Random r = new Random();
        int max = 1000;
        this.code = r.nextInt(max);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    //costruttore 2
    public Product( String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        
    }

   // metodi getter e setter

   //code
    public int getCode(){
        return this.code;
    }

    
    //name
    public String getName(){
        return this.name;
    }

    public void setName( String name){
        this.name = name;
    }

    //description
    public String getDescription(){
        return this.description;
    }

    public void setDescription( String description){
        this.description = description;
    }

    //price
    public BigDecimal getPrice(){
        return this.price;
    }

    public void setPrice( BigDecimal price){
        this.price = price;
    }

    //vat
    public BigDecimal getVat(){
        return this.vat;
    }

    public void setVat( BigDecimal vat){
        this.vat = vat;
    }


    // altri metodi
   public String getProduct(){
    return name + " " + price;
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
