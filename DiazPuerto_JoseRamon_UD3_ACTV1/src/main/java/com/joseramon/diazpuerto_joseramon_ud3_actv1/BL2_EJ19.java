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
public class BL2_EJ19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        int secreto = 45;
        int numero, intentos = 0;

        System.out.print("Adivina el numero (entre 1 y 100): ");
        numero = teclado.nextInt();

        while (numero != secreto) {
        intentos++;
        if (numero < secreto) {
        System.out.println("El numero secreto es mayor");
        } else {
        System.out.println("El numero secreto es menor");
        }
        System.out.print("Intentalo de nuevo: ");
        numero = teclado.nextInt();
        }intentos++;
        System.out.println("¡Has acertado!");
        System.out.println("Numero de intentos: " + intentos);
        
         teclado.close();
    }
    
}
