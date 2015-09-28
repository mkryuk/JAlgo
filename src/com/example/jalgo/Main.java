package com.example.jalgo;
/**
 * Created by maxim on 07.09.2015.
 */

public class Main {

    public static void main(String[] args) {

        Integer [] array = new Integer[]{59, 23, 39, 28, 25, 49, 31, 59, 59, 15};
        Quick3WaySort.sort(array);
        for(Integer item : array){
            System.out.print(item + " ");
        }

    }
}