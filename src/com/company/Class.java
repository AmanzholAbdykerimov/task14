package com.company;
public class Class {
    private int nomer;
    private String name;
    private int[]arr;
    public Class(int nomer,String name,int ... arr){
        this.name=name;
        this.arr=arr;
        this.nomer=nomer;
    }
    void Class1(){
        System.out.println(nomer);
        System.out.println(name);
        for (int i=0;i< arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
