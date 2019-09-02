package springBoot.services;

import springBoot.models.Products;

public interface ProductsService {

    public String addProduct(Products product);

    public String deleteProduct();

    public String updateProduct();

    public String getProduct();
}
