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
public class BL3_EJ26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado = new Scanner(System.in);

        int numero, cifra, invertido = 0;

        System.out.print("Introduce un numero positivo: ");
        numero = teclado.nextInt();

        while (numero <= 0) {
        System.out.print("Introduce un numero positivo: ");
        numero = teclado.nextInt();
        }while (numero > 0) {
        cifra = numero % 10;
        invertido = invertido * 10 + cifra;
        numero = numero / 10;
        }
        System.out.println("Numero invertido: " + invertido);
        
         teclado.close();
    }
    
}
