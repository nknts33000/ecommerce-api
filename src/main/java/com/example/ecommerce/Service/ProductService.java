package com.example.ecommerce.Service;

import com.example.ecommerce.Exceptions.ProductNotFoundException;
import com.example.ecommerce.JPArepo.ProductRepo;
import com.example.ecommerce.Model.Product;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ProductService {
    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(Product product){
        product.setProduct_code(UUID.randomUUID().toString());
        return productRepo.save(product);
    }

    public List<Product> findAllProducts(){
        return productRepo.findAll();
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public Product findProductById(long id){
        return productRepo.findProductById(id).orElseThrow(() -> new ProductNotFoundException("Product by id "+ id + " was not found." ));
    }
    public void deleteProduct(long id){
        productRepo.deleteProductById(id);
    }

}
