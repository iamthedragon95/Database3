package com.niit.database.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.database.model.Product;
import com.niit.database.service.ProductService;
@Controller
public class CategoryController {
	@Autowired
	ProductService productService;
	@RequestMapping("/guitar")
	public String setupForm(Map<String, Object> map){
		Product product = new Product();
		map.put("product", product);
		map.put("ProductList", productService.getgit());
		return "product view";
	}

	
}
