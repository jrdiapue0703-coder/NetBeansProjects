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
public class BL1_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer lado ");
        int lado1 = teclado.nextInt();
        System.out.println("Introduce el segundp lado ");
        int lado2 = teclado.nextInt();
        System.out.println("Introduce el tercer lado");
        int lado3 = teclado.nextInt();

        if (lado1 > 0 && lado2 > 0 && lado3 > 0 && ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2)) {

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Es equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Es Isoceles");
            } else {
                System.out.println("Es escaleno");
            }
        } else {
            System.out.println("Error,no forma un triángulo");
        }
        teclado.close();
    }
}
