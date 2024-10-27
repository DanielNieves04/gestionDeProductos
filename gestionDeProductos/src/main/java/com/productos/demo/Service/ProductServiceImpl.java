package com.productos.demo.Service;

import com.productos.demo.Entity.Product;
import com.productos.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product findProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product productUpdate = productRepository.findById(id).get();
        if(Objects.nonNull(product.getName()) && !"".equalsIgnoreCase(product.getName())){
            productUpdate.setName(product.getName());
        }
        productUpdate.setDescription(product.getDescription());
        if(product.getPrice()>0){
            productUpdate.setPrice(product.getPrice());
        }
        if(product.getQuantity()>=0){
            productUpdate.setQuantity(product.getQuantity());
        }
        return productRepository.save(productUpdate);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
