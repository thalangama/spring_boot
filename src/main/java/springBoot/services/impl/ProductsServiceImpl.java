package springBoot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.models.Products;
import springBoot.repositeries.ProductRepo;
import springBoot.services.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public String addProduct(Products product) {
        productRepo.save(product);
        return "save";
    }

    @Override
    public String deleteProduct() {
        return null;
    }

    @Override
    public String updateProduct() {
        return null;
    }

    @Override
    public String getProduct() {
        return null;
    }
}
