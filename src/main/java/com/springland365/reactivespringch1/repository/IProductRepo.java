package com.springland365.reactivespringch1.repository;

import com.springland365.reactivespringch1.model.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IProductRepo extends ReactiveCrudRepository<Product , Integer> {
}
