package com.alten.shop.product_service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductManager {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> createProducts(List<Product> products){
        List<Product> newProducts = products.stream()
            .map(product -> productRepository.save(product))
            .toList();
        return newProducts;
    }

    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product product){
        if(productRepository.existsById(id)){
            return productRepository.save(product);
        } else {
            return null;
        }
        
    }

    public void deleteProduct(Long id){
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            productRepository.delete(product.get());
        }
    }
    
}
