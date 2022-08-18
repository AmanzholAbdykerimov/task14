package com.company;

import java.util.Arrays;

public class Class {
    private int nomer;
    private String soz;
    private int[]massiv;
    public Class(int nomer,String soz,int ... massiv){
        this.soz=soz;
        this.massiv=massiv;
        this.nomer=nomer;
    }

    @Override
    public String toString() {
        return "nomer=" + nomer +
                ", soz='" + soz + '\'' +
                ", massiv=" + Arrays.toString(massiv) ;
    }
}
