package com.example.E_CommerceAPI.repository;

import com.example.E_CommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository <Product, Long>
{

}
