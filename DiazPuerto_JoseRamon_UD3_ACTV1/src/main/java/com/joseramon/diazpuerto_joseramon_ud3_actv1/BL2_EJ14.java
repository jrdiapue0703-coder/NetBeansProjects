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
public class BL2_EJ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int n, suma = 0;

    System.out.print("Introduce un numero positivo: ");
    n = teclado.nextInt();

    if (n > 0) {
    for (int i = 1; i <= n; i++) {
    suma = suma + i;
    }System.out.println("La suma es: " + suma);
    } else {
    System.out.println("El numero debe ser positivo");
    }
     teclado.close();
    }
    
}
