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
public class BL1_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce el primer número: ");
    int numero1 = teclado.nextInt();

    System.out.print("Introduce el segundo número: ");
    int numero2 = teclado.nextInt();

    System.out.print("Introduce el tercer número: ");
    int numero3 = teclado.nextInt();


    if (numero1 >= numero2 && numero1 >= numero3) {
    System.out.println("El mayor es: " + numero1);
    } else if (numero2 >= numero1 && numero2 >= numero3) {
    System.out.println("El mayor es: " + numero2);
    } else {
    System.out.println("El mayor es: " + numero3);
    }

    teclado.close();
    }
    
}
