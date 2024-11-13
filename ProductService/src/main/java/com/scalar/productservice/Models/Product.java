package com.scalar.productservice.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //these annotations come from Lombork
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private Category category;

    //manually creating getters and setters:
//    public void setId(Long id){
//        this.id = id;
//    }
//
//    public Long getId(){
//        return id;
//    }
}
