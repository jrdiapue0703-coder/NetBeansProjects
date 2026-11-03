/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.joseramon.diazpuerto_joseramon_ud3_actv1;

/**
 *
 * @author jrdiapue0703
 */
import java.util.Scanner;

public class BL1_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    Scanner teclado = new Scanner(System.in);


    System.out.print("Introduce un número entero: ");
    int numero = teclado.nextInt();


    if (numero % 2 == 0) {
    System.out.println("El número es par.");
    } else {
    System.out.println("El número es impar.");
     }
    teclado.close();
    
    }
    
}
