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
        System.out.println("Introduce tu altura para saber si puedes pasar ");
        int altura = teclado.nextInt();
        
        if (altura <0) {
        System.out.println("Error,la edad no puede ser negativo");        
        }else {
        if (altura >= 140) {
        System.out.println("Acceso permitido");
        }else {
        System.out.println("Acceso denegado");
            }
        }
        
       teclado.close();
    }
    
}
