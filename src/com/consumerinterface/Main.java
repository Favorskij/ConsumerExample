package com.consumerinterface;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {


        Consumer<Long> consumer1 = x -> System.out.println(x * 2);
        consumer1.accept(2L);


        Consumer<Long> consumer2 = System.out::println;
        consumer2.accept(2L);

    }
}
