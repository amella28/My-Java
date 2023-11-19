/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menghitugbidang;

/**
 *
 * @author WINDOWS 10
 */
public class MenghitugBidang {

    public static void main(String[] args) {
        Balok Balokku = new Balok();
        Balokku.panjang=14;
        Balokku.tinggi=9;
        Balokku.lebar=7;
        
        Balokku.HitungLuasBalok();
        
        Balokku.HitungVolumeBalok();
  
        Balokku.HitungKelilingBalok();
    }
}
