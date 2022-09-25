package com.talentCamp.springMvc.business.services;

import com.talentCamp.springMvc.business.entities.Product;

import java.util.List;

public interface ProductManager {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}