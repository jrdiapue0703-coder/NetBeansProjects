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
public class BL1_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce lanota(0-10)");
    double nota = teclado.nextDouble();
    
    if (nota < 5){
        System.out.println("Suspensso");
    }else if (nota <6) {
    System.out.println("Aprobado");
    }else if (nota <7) {
    System.out.println("Bien");
    }else if (nota <9){
    System.out.println("Notable");
    }else if (nota <10) {
    System.out.println("Sobresaliente");
    }
    teclado.close();
    }  
}
