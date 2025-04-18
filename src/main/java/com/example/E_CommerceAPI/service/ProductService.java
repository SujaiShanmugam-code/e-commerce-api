package com.example.E_CommerceAPI.service;


import com.example.E_CommerceAPI.model.Product;
import com.example.E_CommerceAPI.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts()
    {
        return productRepo.findAll();
    }
}
