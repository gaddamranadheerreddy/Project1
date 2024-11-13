package com.scalar.productservice.Controllers;

import com.scalar.productservice.Models.Product;
import com.scalar.productservice.Services.FakeStoreProductService;
import com.scalar.productservice.Services.ProductService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

//@Component
@RestController
public class ProductController {

//    ProductService productService = new FakeStoreProductService();
private ProductService productService;
public ProductController(ProductService productService) {
    this.productService = productService;
}

//    @RequestMapping
    @GetMapping("/products")
    public void getAllProducts(){

    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long id){
        productService.getProductDetails(id);
        return null;
    }

    @PostMapping("/")
    public void createProduct(){

    }
}
