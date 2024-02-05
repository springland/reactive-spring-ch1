package com.springland365.reactivespringch1.controller;

import com.springland365.reactivespringch1.model.Product;
import com.springland365.reactivespringch1.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    ProductService  service ;

    public ProductController(ProductService service){
        this.service = service ;
    }


    @GetMapping(  produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Product>  getProducts(){

        return service.getProducts() ;
    }
}
