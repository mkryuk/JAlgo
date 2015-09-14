package com.example.jalgo;
/**
 * Created by maxim on 07.09.2015.
 */

public class Main {
    public static void main(String[] args) {
        WeightedQuickUnion quickFind = new WeightedQuickUnion(10);

        quickFind.union(2,7);
        quickFind.union(8,1);
        quickFind.union(8,2);
        quickFind.union(5,9);
        quickFind.union(5,4);
        quickFind.union(5,0);
        quickFind.union(5,3);
        quickFind.union(5,6);
        quickFind.union(8,5);


        quickFind.printArr();
    }
}