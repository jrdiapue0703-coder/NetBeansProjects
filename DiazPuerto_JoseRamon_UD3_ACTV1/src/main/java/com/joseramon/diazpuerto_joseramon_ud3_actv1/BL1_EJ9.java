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
public class BL1_EJ9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double num1, num2;
        char operacion;

        System.out.print("Introduce el primer numero: ");
        num1 = teclado.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        num2 = teclado.nextDouble();

        System.out.print("Introduce una operacion (+, -, *, /): ");
        operacion = teclado.next().charAt(0);

        switch (operacion) {
        case '+':
        System.out.println("Resultado: " + (num1 + num2));
        break;

        case '-':
        System.out.println("Resultado: " + (num1 - num2));
        break;

        case '*':
        System.out.println("Resultado: " + (num1 * num2));
        break;

        case '/':
        if (num2 != 0) {
        System.out.println("Resultado: " + (num1 / num2));
        } else {
        System.out.println("Error: no se puede dividir entre cero");
         }
        break;
        default:
        System.out.println("Operacion no valida");
        }
        
     teclado.close();
    }
    
}
