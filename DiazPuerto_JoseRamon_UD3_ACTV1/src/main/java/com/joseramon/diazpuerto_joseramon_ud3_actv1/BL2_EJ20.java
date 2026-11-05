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
public class BL2_EJ20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.print("Introduce el primer numero: ");
        a = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        b = teclado.nextInt();
        if (a > 0 && b > 0 && a < b) {
        for (int i = a; i <= b; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i);
         }
        }
        } else {
        System.out.println("Error: los numeros deben ser positivos y A debe ser menor que B");
        }
         teclado.close();
    }
    
}
