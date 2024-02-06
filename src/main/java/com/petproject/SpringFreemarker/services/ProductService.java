package com.petproject.SpringFreemarker.services;

import com.petproject.SpringFreemarker.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private long id = 0;

    {
        products.add(new Product(++id,"PlayStation", "short description", 67000, "Mos", "Andrew"));
        products.add(new Product(++id,"Iphone", "short description", 30000, "Mos", "Alex"));
    }

    public List<Product> listProducts() {return products;}

    public void saveProduct(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }
}
