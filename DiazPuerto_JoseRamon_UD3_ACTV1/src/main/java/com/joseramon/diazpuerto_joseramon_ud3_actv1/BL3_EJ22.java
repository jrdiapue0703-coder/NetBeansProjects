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
public class BL3_EJ22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int opcion;
        double num1, num2;
        do {
        System.out.println("MENU CALCULADORA");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        System.out.print("Elige una opcion: ");
        opcion = teclado.nextInt();

        switch (opcion) {
        case 1:
        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();
        System.out.println("Resultado: " + (num1 + num2));
        break;
        
        case 2:
        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();
        System.out.println("Resultado: " + (num1 - num2));
        break;

        case 3:
        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();

        System.out.println("Resultado: " + (num1 * num2));
        break;

        case 4:
        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();
        if (num2 != 0) {
        System.out.println("Resultado: " + (num1 / num2));
        } else {
        System.out.println("No se puede dividir entre cero");
        }
        break;
        case 5:
            
        System.out.println("Saliendo de la calculadora...");
            break;
        default:
        System.out.println("Opcion no valida");
            }

        } while (opcion != 5);
        
         teclado.close();
        
    }
    
}
