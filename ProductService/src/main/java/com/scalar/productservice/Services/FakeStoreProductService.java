package com.scalar.productservice.Services;

import com.scalar.productservice.Models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//@Component
@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductDetails(Long id){
//        RestTemplate restTemplate = new RestTemplate();
//        restTemplate.getForObject("url");
        return null;
    }
}
