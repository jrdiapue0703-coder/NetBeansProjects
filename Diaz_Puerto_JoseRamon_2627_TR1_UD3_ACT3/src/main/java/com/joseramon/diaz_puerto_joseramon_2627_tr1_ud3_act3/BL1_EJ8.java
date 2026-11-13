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
public class BL1_EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner teclado = new Scanner(System.in);
            
            
            
            int edad;
            int dia;
            double precio = 8;
            double descuento = 0;
            
            System.out.println("Introduce tu edad ");
            edad = teclado.nextInt();
            
            System.out.println("Introduce el deia de la semana ");
            dia = teclado.nextInt();
            
            if (edad < 0) {
                System.out.println("Edad no valida ");
        }
            else {
                
                if (edad<12){
                    descuento = 50;
                }
                else if (edad >65) {
                    descuento = 40;
                } if (dia == 3) {
                        descuento = descuento +20;
                    }
                }
            precio = precio -(precio * descuento /100);
            System.out.println("El descuento es del "+descuento+ "%");
            System.out.println("El precio de la entrada es" +precio + "€");
            
    }
    
}
