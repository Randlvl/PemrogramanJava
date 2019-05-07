package com.x2;


public class persegi1 extends BangunDatar {
    //sisi persegi
    float sisi;




    @Override
    float luas() {
        float luas = sisi * sisi;
        System.out.println("Luas Persegi "+luas);
        return luas;

    }

/*  @Override
    void luasBaru(){
        float luas = sisi*sisi;
        System.out.println("Void Luas persegi " +luas);


    }*/

   @Override
    void keliling(){
        double keliling = 4*sisi;
        System.out.println("Void keliling persegi " +keliling);


    }
}
