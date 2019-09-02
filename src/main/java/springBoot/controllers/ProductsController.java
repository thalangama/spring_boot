package springBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springBoot.models.Products;
import springBoot.services.ProductsService;

@RestController
@RequestMapping("product")
public class ProductsController {
    @Autowired
    private ProductsService productsServices;

    @PostMapping("add")
    public String addProduct(@RequestBody Products product){
        productsServices.addProduct(product);
        return  "add";
    }
}
