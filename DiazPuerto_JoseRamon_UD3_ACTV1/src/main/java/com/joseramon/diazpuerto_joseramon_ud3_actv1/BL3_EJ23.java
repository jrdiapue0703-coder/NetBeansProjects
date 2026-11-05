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
public class BL3_EJ23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);

        double nota, suma = 0, media;
        double mayor = 0, menor = 10;
        int aprobados = 0, suspensos = 0;

        for (int i = 1; i <= 15; i++) {
        System.out.print("Introduce la nota del alumno " + i + ": ");
        nota = teclado.nextDouble();

        while (nota < 0 || nota > 10) {
        System.out.println("Nota incorrecta. Debe estar entre 0 y 10");
        System.out.print("Introduce la nota de nuevo: ");
        nota = teclado.nextDouble();
        }

        suma = suma + nota;
        if (nota > mayor) {
        mayor = nota;
        }if (nota < menor) {
        menor = nota;
        }if (nota >= 5) {
        aprobados++;
        } else {
        suspensos++;
        }
        }
        media = suma / 15;
        System.out.println("Nota media: " + media);
        System.out.println("Nota mas alta: " + mayor);
        System.out.println("Nota mas baja: " + menor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        
         teclado.close();
    }
    
}
