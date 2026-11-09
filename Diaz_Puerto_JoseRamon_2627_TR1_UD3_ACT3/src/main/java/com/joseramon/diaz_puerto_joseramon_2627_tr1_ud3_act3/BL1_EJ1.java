/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.joseramon.diaz_puerto_joseramon_2627_tr1_ud3_act3;

import java.util.Scanner;

/**
 *
 * @author jrdiapue0703
 */
public class BL1_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introducir el primer numero ");
        int num1= teclado.nextInt();
        System.out.println("Introducir el segundo numero");
        int num2= teclado.nextInt();
        System.out.println("Introduce el tercer numero ");
        int num3= teclado.nextInt();
        
        if ((num1 > num2  && num1 < num3)||(num1 < num2 && num1 > num3)) {
            System.out.println("El numero intermedio es " +num1);
        }else if ((num2 > num1 && num2 < num3)||(num2 < num1 && num2 >num3)) {
         System.out.println("El numero intermedio es " +num2);
        }else   
        System.out.println("El numero intermedio es "+num3);
        
        teclado.close();
             
    }
    
}
