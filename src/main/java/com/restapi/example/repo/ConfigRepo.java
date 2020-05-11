package com.restapi.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.example.model.ProductConfig;

public interface ConfigRepo extends JpaRepository<ProductConfig,Integer>
{

} 
