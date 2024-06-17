package com.example.layeredarchitecture.dao;

public class Sample {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.example();
    }

    public void example(int ... x){
        System.out.println("example");

        for (int a : x){
            System.out.println(a);
        }
    }
}
