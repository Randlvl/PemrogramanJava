package com.x2;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        //objek bangun datar
        BangunDatar mBangunDatar = new BangunDatar();
        //membuat objek persegi dan mengisi properti
        persegi1 mpersegi = new persegi1();
        lingkaran mlingkaran = new lingkaran();
        persegipanjang mpersegipanjang = new persegipanjang();
        segitiga msegitiga = new segitiga();


        //menampilkasn hasil dengan return
//        mpersegi.sisi=5;
        System.out.print("Masukan sisi persegi: ");
        mpersegi.sisi=input.nextInt();
        System.out.print("Masukan panjang persegi : ");
        mpersegi.p=input.nextInt();
        System.out.print("Masukan lebar persegi: ");
        mpersegi.l=input.nextInt();
        //menampilkasn hasil dengan void
        mpersegi.luas();
        /*mpersegi.luasBaru();*/
        mpersegi.keliling();



        System.out.print("Masukan jari-jari : ");
        mlingkaran.r=input.nextInt();
        //menampilkasn hasil dengan void
        mlingkaran.luas();
        mlingkaran.luasBaru();




        System.out.print("Masukan sisi persegi panjang: ");
        mpersegipanjang.sisi=input.nextInt();
        System.out.print("Masukan panjang dari persegi panjang : ");
        mpersegipanjang.p=input.nextInt();
        System.out.print("Masukan lebar persegi panjang: ");
        mpersegipanjang.l=input.nextInt();
        //menampilkasn hasil dengan void
        mpersegipanjang.luas();
        /*mpersegi.luasBaru();*/
        mpersegipanjang.keliling();

        System.out.print("Masukan sisi a segitiga: ");
        msegitiga.a=input.nextInt();
        System.out.print("Masukan sisi b segitiga : ");
        msegitiga.b=input.nextInt();
        System.out.print("Masukan sisi c segitiga: ");
        msegitiga.c=input.nextInt();

        System.out.print("Masukan alas segitiga: ");
        msegitiga.alas=input.nextInt();
        System.out.print("Masukan tinggi segitiga: ");
        msegitiga.tinggi=input.nextInt();
        //menampilkasn hasil dengan void

        msegitiga.luas();
        /*mpersegi.luasBaru();*/
        msegitiga.keliling();




    }
}