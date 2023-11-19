/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menghitugbidang;

/**
 *
 * @author WINDOWS 10
 */
public class Balok {
    int panjang, tinggi, lebar, luasBalok, volumeBalok, kelilingBalok;
    
    void HitungLuasBalok(){
        luasBalok = 2 *(panjang*lebar) + 2*(panjang*tinggi)+2*(lebar*tinggi);
        System.out.println("Pajang Balok : "+panjang);
        System.out.println("Tinggi Balok : "+tinggi);
        System.out.println("Lebar Balok : "+lebar);
        System.out.println("====================");
    System.out.println("Luas Balok : "+luasBalok);
    }
    void HitungVolumeBalok(){
        volumeBalok = panjang*lebar*tinggi;
    System.out.println("Volume Balok : "+volumeBalok);
    }
    void HitungKelilingBalok(){
        kelilingBalok = 4 *(panjang+lebar+tinggi);
    System.out.println("Keliling Balok : "+kelilingBalok);
    }
}
