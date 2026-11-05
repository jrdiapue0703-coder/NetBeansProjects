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

public class BL1_EJ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int opcion;
        double temperatura, resultado;

        System.out.println("MENU DE TEMPERATURAS");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.println("3. Salir");

        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
        System.out.print("Introduce los grados Celsius: ");
        temperatura = teclado.nextDouble();

        resultado = temperatura * 9 / 5 + 32;

        System.out.println("Resultado: " + resultado + " Fahrenheit");
        break;
        case 2:
                System.out.print("Introduce los grados Fahrenheit: ");
                temperatura = teclado.nextDouble();

                resultado = (temperatura - 32) * 5 / 9;

                System.out.println("Resultado: " + resultado + " Celsius");
                break;

            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opcion no valida");
        }
         teclado.close();
    }
}
        
        
        
        
     
    
    

