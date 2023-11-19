/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihansepedamotor;

/**
 *
 * @author WINDOWS 10
 */
class SepedaMotor{
    String merk;
    String jenis;
    String warna;
    
}
public class LatihanSepedaMotor {

    public static void main(String[] args) {
        SepedaMotor SepedaMotorAmel= new SepedaMotor();
        SepedaMotorAmel.merk="Beat";
        SepedaMotorAmel.jenis="Metic";
        SepedaMotorAmel.warna="Putih";
        
        System.out.println("Merk "+SepedaMotorAmel.merk);
        System.out.println("jenis "+SepedaMotorAmel.jenis);
        System.out.println("warna "+SepedaMotorAmel.warna);
    }
}
