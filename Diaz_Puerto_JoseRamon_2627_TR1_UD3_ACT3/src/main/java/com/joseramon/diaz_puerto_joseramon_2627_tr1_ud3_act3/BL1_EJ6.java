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
public class BL1_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
       double horas;
       
        System.out.println("Introduce las horas de aparacamineto ");
        horas = teclado.nextDouble();
        
      
        if (horas <0 ) {
            System.out.println("Error el peso no es valido");
        }
        else if (horas <1) {
            System.out.println("El costo de aparcamiento es de 2€");
        }
        else if (horas<4) {
            System.out.println("El costo de aparcamiento es de 1,50€ por hora ");
        }
        else if (horas <5) {
            System.out.println("El costo de aparcamiento es de 1€ por hora");
        }
        else {
            System.out.println("El costo de aparcamiento es de 15€");
            
        }  

    }
    
}
