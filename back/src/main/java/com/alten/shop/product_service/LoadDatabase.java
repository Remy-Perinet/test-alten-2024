package com.alten.shop.product_service;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(ProductRepository repository) {

    return args -> {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<ProductDto> productsDto = mapper.readValue(
                new File("src\\main\\resources\\products.json"), 
                mapper.getTypeFactory().constructCollectionType(List.class, ProductDto.class)
            );
            List<Product> products = productsDto.stream().map(ProductMapper::toDb).toList();
            products.forEach(product ->{
                repository.save(product);
            });
        } catch (Exception e) {
            throw new RuntimeException("Erreur de lecture du json des produits", e);
        }
    };
  }
}