/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author EBOOK123
 */
    public class kubus extends BangunRuang {
    float sisi;
    
    @Override
    float Volume(){
        float volume = sisi*sisi*sisi;
        System.out.println("Volume kubus = "+ volume);
        return volume;
    }
}
    

