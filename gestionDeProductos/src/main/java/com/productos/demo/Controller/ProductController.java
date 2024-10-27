package com.productos.demo.Controller;

import com.productos.demo.Entity.Product;
import com.productos.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/findAllProducts")
    public List<Product>  findAllProducts(){
        return productService.findAllProducts();
    }

    @GetMapping("/findProductById/{id}")
    public Product findProductById(@PathVariable Long id){
        return productService.findProductById(id);
    }

    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PutMapping("/updateProduct/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product){
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "Product deleting successfully";
    }
}
