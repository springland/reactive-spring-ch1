package com.springland365.reactivespringch1.service;

import com.springland365.reactivespringch1.model.Product;
import com.springland365.reactivespringch1.repository.IProductRepo;


import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

    IProductRepo  repo ;

    public ProductService(IProductRepo repo){
        this.repo = repo ;
    }

    public Flux<Product>  getProducts(){

        return repo.findAll().delayElements(Duration.ofSeconds(2));
    }

}
