/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datos;

/**
 *
 * @author 
 */
public class Datos {

    
    static int contador = 0;

    public static void main(String[] args) {
        
        
        int a = 10;
        int b = 5;
        int resultado = sumar(a, b);
        
        
        System.out.println("El resultado es: " + resultado);
        
        
        contador++;
        
        
        System.out.println("El valor del contador es: " + contador);
    }
    
    
    public static int sumar(int x, int y) {
        int suma = x + y;
        return suma;
    }
}

