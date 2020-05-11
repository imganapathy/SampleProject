package com.restapi.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.example.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>
{

} 
