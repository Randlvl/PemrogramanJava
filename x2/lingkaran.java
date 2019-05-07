package com.x2;


public class lingkaran extends BangunDatar {

    //    Jari2 lingkaran
    float r;


    @Override
    float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran " + luas);
        return luas;

    }

    @Override
    void luasBaru() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling lingkaran " + keliling);


    }
}