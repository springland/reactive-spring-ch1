package com.springland365.reactivespringch1.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Product {

    @Id
    Integer id ;

    String name ;
}
