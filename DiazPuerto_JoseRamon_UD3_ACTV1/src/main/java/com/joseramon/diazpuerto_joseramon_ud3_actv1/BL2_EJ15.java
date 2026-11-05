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
public class BL2_EJ15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero;
        long factorial = 1;

        System.out.print("Introduce un numero entre 0 y 20: ");
        numero = teclado.nextInt();

        if (numero >= 0 && numero <= 20) {
        for (int i = 1; i <= numero; i++) {
        factorial = factorial * i;
        }System.out.println("El factorial es: " + factorial);
        } else {
        System.out.println("Error: el numero debe estar entre 0 y 20");
        }
         teclado.close();
    }
    
}
