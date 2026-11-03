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
public class BL1_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    System.out.println("Altura del usuario");
    
    double altura= teclado.nextDouble();
    if (altura <0) {
    System.out.println("Error,No admiten alturas negativas");
    }else if (altura <140) {
    System.out.println("Denegar acceso");
    }else {
    System.out.println("Aprobar acceso");
    }
    
    
    teclado.close();
    }
    
}
