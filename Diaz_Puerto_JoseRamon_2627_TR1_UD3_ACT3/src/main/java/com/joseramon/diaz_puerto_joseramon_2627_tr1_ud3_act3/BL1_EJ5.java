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
public class BL1_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double salariobase;
        int horasextras;
        double preciohora;
        double salariototal;
        
        System.out.println("Introduce el salario base ");
        salariobase = teclado.nextDouble();
        
        System.out.println("Introduce las horas extras ");
        horasextras = teclado.nextInt();
        
        if (salariobase >2000) {
            preciohora = 18;
        }
        else{
        preciohora=15;    
        }
        salariototal= salariobase +(horasextras*preciohora);
        System.out.println("El salario total es " +salariototal +"€");
                
        teclado.close(); 
    }
            
}
