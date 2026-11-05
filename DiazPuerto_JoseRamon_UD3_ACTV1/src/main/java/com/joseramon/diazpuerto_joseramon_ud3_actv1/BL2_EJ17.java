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
public class BL2_EJ17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero, contador = 0, suma = 0;
        double media;

        System.out.print("Introduce un numero (0 para terminar): ");
        numero = teclado.nextInt();

        while (numero != 0) {
        suma = suma + numero;
        contador++;

        System.out.print("Introduce otro numero: ");
        numero = teclado.nextInt();
        }
        System.out.println("Cantidad de numeros: " + contador);
        System.out.println("Suma: " + suma);

        if (contador > 0) {
        media = (double) suma / contador;
        System.out.println("Media: " + media);
        } else {
        System.out.println("No se han introducido numeros");
        }
         teclado.close();
    }
    
}
