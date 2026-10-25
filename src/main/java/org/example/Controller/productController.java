package org.example.Controller;

import org.example.Model.Product;
import org.example.Service.productServiceimpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class productController {

    //me full methods valata kiyanava APIs Kiyala

    @GetMapping("get-products")  //mekata kiyann me method ekak me anootation eken decorate kala kiyala kiyanava
    List<Product> getProduct(){
        productServiceimpl service = new productServiceimpl();
        List<Product> productList = service.getProductAll();
        return productList;
    }
}
