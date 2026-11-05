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
public class BL1_EJ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int anio = 0;
        System.out.print("Introduce un año: ");
        anio=teclado.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
        System.out.println("El año es bisiesto");
        } else {
        System.out.println("El año no es bisiesto");
        }
        
        teclado.close();
    }
    
}
