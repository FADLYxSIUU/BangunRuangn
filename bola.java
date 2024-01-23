/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author EBOOK123
 */
public class bola extends BangunRuang{
    float r;
    
    @Override
    float Volume(){
          float volume = 4/3*22/7*r*r*r;
          System.out.println("Volume bola = " + volume);
          return volume;
    }
}
    

