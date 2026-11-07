package org.example.Service;

import org.example.Model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class productServiceimpl {

    public List<Product> getProductAll(){
        return Arrays.asList(
                new Product(
                        "T-shirt",
                        "A mens t-shirt",
                        1200.00,
                        "https://tse2.mm.bing.net/th/id/OIP.5cN_zvKz3OajU_cv0ZJJAQHaE7?r=0&rs=1&pid=ImgDetMain&o=7&rm=3"),
                new Product(
                        "T-shirt Red",
                        "A mens t-shirt modern color",
                        1200.00,
                        "https://tse2.mm.bing.net/th/id/OIP.5cN_zvKz3OajU_cv0ZJJAQHaE7?r=0&rs=1&pid=ImgDetMain&o=7&rm=3")
        );

    }

    public void createProduct(Product product){
        System.out.println(product);

    }
}
