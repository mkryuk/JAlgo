package com.example.jalgo;

/**
 * Created by maxim on 08.09.2015.
 */
public class Printable {
    int []id;
    public Printable(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public void printArr(){
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
    }
}
