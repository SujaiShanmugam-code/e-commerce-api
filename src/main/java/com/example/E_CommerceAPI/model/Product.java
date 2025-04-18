package com.example.E_CommerceAPI.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
//@Table(name = "Product") we can change Table name
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;

    private String productName;
    private double productPrice;
    private String productDescription;
    private double productRatings;
    private String productCategory;
    private String productSeller;
    private int productStock;
    private int productNumberOfReviews;
    private List<String> images;

    public void setImages(List<String> images) {
        this.images = images;
    }




    public long getProductId() {
        return productId;
    }

    public List<String> getImages() {
        return images;
    }



    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductRatings() {
        return productRatings;
    }

    public void setProductRatings(double productRatings) {
        this.productRatings = productRatings;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSeller() {
        return productSeller;
    }

    public void setProductSeller(String productSeller) {
        this.productSeller = productSeller;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductNumberOfReviews() {
        return productNumberOfReviews;
    }

    public void setProductNumberOfReviews(int productNumberOfReviews) {
        this.productNumberOfReviews = productNumberOfReviews;
    }

    public Product(String productName, double productPrice, String productDescription, double productRatings, String productCategory, String productSeller, int productStock, int productNumberOfReviews , List<String> images) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productRatings = productRatings;
        this.productCategory = productCategory;
        this.productSeller = productSeller;
        this.productStock = productStock;
        this.productNumberOfReviews = productNumberOfReviews;
        this.images = images;
    }

    public Product() {
    }
}

