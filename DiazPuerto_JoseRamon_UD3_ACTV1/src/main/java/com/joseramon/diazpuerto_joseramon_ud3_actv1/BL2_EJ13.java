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
public class BL2_EJ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);

    int numero;
    System.out.print("Introduce un numero: ");
    numero = teclado.nextInt();

    for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x " + i + " = " + (numero * i));
    }
     teclado.close();
    }
    
}
