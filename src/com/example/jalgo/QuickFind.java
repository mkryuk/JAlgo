package com.example.jalgo;

import java.util.NavigableMap;

/**
 * Created by maxim on 08.09.2015.
 */
public class QuickFind extends Printable{

    public QuickFind(int N){
        super(N);
    }
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
    }
}
