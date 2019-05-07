package com.x2;

public class segitiga extends BangunDatar{

    float alas,tinggi;
    double a,b,c,k;

    @Override
    float luas() {
        float luas = 1/2* alas * tinggi;
        System.out.println("Luas segitiga "+luas);
        return luas;

    }

    @Override
    void keliling(){
        double k = a+b+c;
        System.out.println("Keliling segitiga " +k);


    }




}
