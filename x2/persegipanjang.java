package com.x2;

public class persegipanjang extends BangunDatar {


    float kll,p,l;



    @Override
    float luas() {
        float luas = p * l;
        System.out.println("Luas Persegi panjang "+luas);
        return luas;

    }

/*  @Override
    void luasBaru(){
        float luas = sisi*sisi;
        System.out.println("Void Luas persegi " +luas);


    }*/

    @Override
    void keliling(){
        double keliling = (2*p)+(2*l);
        System.out.println("Keliling persegi panjang " +keliling);


    }
}
