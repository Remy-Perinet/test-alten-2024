package com.alten.shop.product_service;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductService {

    @Autowired
    private ProductManager productManager;

    @GetMapping("/products")
    public List<ProductDto> getProducts() {
        return productManager.getAllProducts().stream().map(ProductMapper::toDto).toList();
    }
    
    @PostMapping("/products")
    @Transactional
    public List<ProductDto> createProducts(@RequestBody List<ProductDto> products) {
        List<Product> input  = products.stream().map(ProductMapper::toDb).toList();
        List<Product> result = productManager.createProducts(input);
        return result.stream().map(ProductMapper::toDto).toList();
    }
    
    @GetMapping("/product/{id}")
    public ProductDto getProduct(@PathVariable Long id) {
        Product result = productManager.getProductById(id);
        if (result == null) {
            return null;
        } else {
            return ProductMapper.toDto(result);
        }
    }


    @PatchMapping("/product/{id}")
    @Transactional
    public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductDto product) {
        Product result = productManager.updateProduct(id, ProductMapper.toDb(product));
        if(result == null){
            return null;
        } else {
            return ProductMapper.toDto(result);
        }
    }

    @DeleteMapping("/product/{id}")
    @Transactional
    public void deleteProduct(@PathVariable Long id) {
        productManager.deleteProduct(id);
    }
}
