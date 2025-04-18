package com.example.E_CommerceAPI.controller;

import com.example.E_CommerceAPI.model.Product;
import com.example.E_CommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController
{

    @Autowired
    ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }


}
