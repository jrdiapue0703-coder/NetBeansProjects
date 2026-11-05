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
public class BL2_EJ16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un numero positivo: ");
    numero = teclado.nextInt();
    while (numero < 0) {
    System.out.print("Introduce un numero positivo: ");
    numero = teclado.nextInt();
    }while (numero >= 0) {
    System.out.println(numero);
    numero--;
    }
    System.out.println("¡Despegue!");
    
     teclado.close();
    }
    
}
