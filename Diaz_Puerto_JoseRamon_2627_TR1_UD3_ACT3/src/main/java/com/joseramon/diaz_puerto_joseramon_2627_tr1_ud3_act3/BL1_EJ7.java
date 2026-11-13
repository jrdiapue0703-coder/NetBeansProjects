/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.joseramon.diaz_puerto_joseramon_2627_tr1_ud3_act3;

import java.util.Scanner;

/**
 *
 * @author jrdiapue0703
 */
public class BL1_EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
       double Kwh;
       double precioKwh = 0;
       
        System.out.println("Introduce las horas de aparacamineto ");
        Kwh = teclado.nextDouble();
      
        if (Kwh <0 ) {  
        }
        else if (Kwh <100) {
        precioKwh = Kwh * 0.10;
        }
        else if (Kwh<=300) {
        precioKwh = Kwh * 0.10;        
        }
        else if(Kwh >300){
        precioKwh = Kwh * 0.10;
        }  
        
        System.out.println("El consumo de Kwh ha constado "+precioKwh+"€ ");
        teclado.close(); 
        
        
        
        
        
      
    }
    
    
}
