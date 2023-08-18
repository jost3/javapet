/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Mavenproject5 {
 
    public static void main(String[] args) {
        
        //lammas el scanner
        Scanner burb1 = new Scanner(System.in);
        
        System.out.println("ingresa el primer numero: ");
        int n1 = burb1.nextInt();
        System.out.println("ingresa el segundo numero: ");
        int n2 = burb1.nextInt();
        System.out.println("ingresa el tercer nummero: ");
        int n3 = burb1.nextInt();
        System.out.println("ingresa el cuarto nummero: ");
        int n4 = burb1.nextInt();
        System.out.println("ingresa el quinto nummero: ");
        int n5 = burb1.nextInt();
        int[] arr = {n1,n2,n3,n4,n5};
        menormayor(arr);
        System.out.println("Arreglo ordenado:");
        arreglo(arr);
        
        
    }
    public static void menormayor(int[] arr) {
          int n = arr.length;
                  for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            int temp = arr[indiceMenor];
            arr[indiceMenor] = arr[i];
            arr[i] = temp;
        }
    }
     public static void arreglo(int[] arr) {
         
     }
}
