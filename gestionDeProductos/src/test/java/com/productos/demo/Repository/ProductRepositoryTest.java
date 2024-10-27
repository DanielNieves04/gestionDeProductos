package com.productos.demo.Repository;

import com.productos.demo.Entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    public ProductRepositoryTest(){
    }

    @Test
    public void saveProduct(){
        Product product = Product.builder()
                .name("Portatil")
                .description("Buen precio y buena calidad")
                .price(40000F)
                .quantity(3)
                .build();
        productRepository.save(product);
    }

    @Test
    public void updateProduct(){
        Long productId = 2L;
        Product product = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));

        // Actualizar los atributos del producto
        product.setName("Locion");
        product.setDescription("Te un muy excelente aroma");
        product.setPrice(40000F);
        product.setQuantity(1);
        productRepository.save(product);
    }

    @Test
    public void findAllProducts(){
        List<Product> productList = productRepository.findAll();
        System.out.println("ProductsList= " + productList);
    }

    @Test
    public void findProductById(){
        Product productById = productRepository.findById(2L).orElseThrow(() -> new RuntimeException("Product not found"));;
        System.out.println("ProductsList= " + productById);
    }

    @Test
    public void deleteProduct(){
        productRepository.deleteById(4L);
    }

}