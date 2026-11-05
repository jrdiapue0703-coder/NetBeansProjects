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
public class BL3_EJ21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        int ceros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numeoro " + i + ":");

            int numero = teclado.nextInt();
            if (numero > 0) {
                System.out.println("Es positivo ");
                positivo++;
            } else if (numero < 0) {
                negativo++;
                System.out.println("Es negativo ");
            } else{
                ceros++;
                System.out.println("Es cero ");
            }

            System.out.println("Resultado");
            System.out.println("Numeros positivos " + positivo);
            System.out.println("Numeros negativos " + negativo);
            System.out.println("Ceros: " + ceros);

        }

    }

}
