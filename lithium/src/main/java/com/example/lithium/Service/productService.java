package com.example.lithium.Service;

import com.example.lithium.Entity.Product;

import java.util.List;

public interface productService {

    public List<Product> consultarProduct();

    public Product crearProduct(Product product);

    public Product modificarProduct(Product product);

    public Product buscarProduct(int id);

    public List<Product> getProductByCategory(String category);

    public void eliminarProduct(int id);
}
