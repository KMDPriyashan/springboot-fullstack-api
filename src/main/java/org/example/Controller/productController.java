package org.example.Controller;

import org.example.Model.Product;
import org.example.Service.productServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class productController {

    @Autowired
    productServiceimpl service ; //dipendancy injection use karala thiyanne methana

    //me full methods valata kiyanava APIs Kiyala

    @GetMapping("get-products")  //mekata kiyann me method ekak me anootation eken decorate kala kiyala kiyanava
    List<Product> getProduct(){
        List<Product> productList = service.getProductAll();
        return productList;
    }

    @PostMapping("/create-products")
    public void createProduct(@RequestBody Product product){
        service.createProduct(product);
    }
}
