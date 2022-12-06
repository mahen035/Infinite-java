package com.training.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ElecProduct {

    public static void main(String... args){
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1,"Laptop", "Electronics", 450));
        productList.add(new Product(2,"Desktop", "Electronics", 550));
        productList.add(new Product(3,"t-shirt", "Apparel", 150));

        Stream<Product> productStream = productList.stream();
       // double  sum = productStream.filter(x->x.getCategory().equalsIgnoreCase("electronics"))
                //.mapToDouble(a->a.getPrice()).sum();

        double sum = productStream.filter(x->x.getCategory().equalsIgnoreCase("electronics"))
                        .map(a->a.getPrice()).reduce(0.0,(m,n)->m+n);


        System.out.println("Sum of all the electronics item is: "+sum);

    }
}
