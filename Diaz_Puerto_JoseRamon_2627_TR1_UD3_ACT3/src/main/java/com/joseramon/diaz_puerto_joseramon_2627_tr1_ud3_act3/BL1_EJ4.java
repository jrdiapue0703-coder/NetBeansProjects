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
public class BL1_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        double peso;
        System.out.println("Introduce el peso del paquete ");
        
        peso = teclado.nextDouble();
        
        if (peso <0 ) {
            System.out.println("Error el peso no es valido");
        }
        else if (peso <1) {
            System.out.println("El costo de envio es de 4€");
        }
        else if (peso <5) {
            System.out.println("El costo de envio es de 7€");
        }
        else if (peso <10) {
            System.out.println("El costo de envio es de 12€");
        }
        else {
            System.out.println("El costo de envio es de 20€");
            
        }  
        teclado.close();
    }
    
}
