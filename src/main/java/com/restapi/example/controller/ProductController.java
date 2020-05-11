package com.restapi.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.restapi.example.model.Product;
import com.restapi.example.model.ProductConfig;
import com.restapi.example.repo.ConfigRepo;
import com.restapi.example.repo.ProductRepo;


@Controller
public class ProductController {
	
		@Autowired
		ProductRepo productRepo;
		
		@Autowired
		ConfigRepo configRepo;

		@GetMapping("/product/api/getproductdetails")
		public ResponseEntity<List<Product>> getProductDetails()
		{
			return new ResponseEntity<List<Product>>(productRepo.findAll() , HttpStatus.OK);
		}
		
		@GetMapping("/config/api/getConfigdetails")
		public ResponseEntity<List<ProductConfig>> getProductConfigDetails()
		{
			return new ResponseEntity<List<ProductConfig>>(configRepo.findAll() , HttpStatus.OK);
		}
		

}
