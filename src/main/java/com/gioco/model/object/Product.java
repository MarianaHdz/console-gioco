package com.gioco.model.object;

import java.util.Scanner;

public abstract class Product {
    private int productId;
    private String productName;
    private float productCost;
    private float productPrice;
    private int productStock;
    private Brand brand;
    private Platform platform;
    Scanner entrada = new Scanner(System.in);

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public void setProductCost(float productCost) {
        this.productCost = productCost;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
    
    public Product add(){
        System.out.printLn("Ingresa el nombre del producto: ");
        this.productName=entrada.next();
        System.out.printLn("Ingresa la marca: ");
        this.brand=entrada.next();
        System.out.printLn("Ingresa el costo: ");
        this.productCost=entrada.next();
        System.out.printLn("Ingresa el precio: ");
        this.productPrice=entrada.next();
        System.out.printLn("Ingresa las existencias: ");
        this.productStock=entrada.next();
    }
    
    public Product buscar(Product Products[], int id){
        Product buscado=new Product();
        for(int i=0;i<Products.length;i++){
            if(Products[i]!=null){
                if(Products[i].getProductId==id){
                   buscado=Products[i];
                   System.out.priintln(Products[i].getProductName() + "\n"); 
                }    
            }    
        }    
       return buscado; 
    }    
    
}
