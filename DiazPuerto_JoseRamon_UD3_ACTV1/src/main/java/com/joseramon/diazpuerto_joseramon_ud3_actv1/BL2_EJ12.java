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
public class BL2_EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int inicio, fin;

    System.out.print("Introduce el primer numero: ");
    inicio = teclado.nextInt();

     System.out.print("Introduce el segundo numero: ");
    fin = teclado.nextInt();

    if (inicio > fin) {
    int aux = inicio;
    inicio = fin;
    fin = aux;
    }for (int i = inicio; i <= fin; i++) 
    {if (i % 2 == 0) {
    System.out.println(i);
    }
    }
     teclado.close();
    }
    
}
