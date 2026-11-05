/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.joseramon.diazpuerto_joseramon_ud3_actv1;

import java.util.Scanner;

/**
 *
 * @author jrdiapue0703
 */
public class BL3_EJ24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero;
        boolean primo = true;

        System.out.print("Introduce un numero positivo: ");
        numero = teclado.nextInt();

        if (numero < 2) {
        primo = false;
        } else {
        for (int i = 2; i < numero; i++) {
        if (numero % i == 0) {
        primo = false;
         break;
        }
        }
        }

        if (primo) {
        System.out.println("El numero es primo");
        } else {
        System.out.println("El numero no es primo");
        }
        
         teclado.close();
    }
    
}
