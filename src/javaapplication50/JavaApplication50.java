/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Bienvenido a la Aplicacion Total Factura");
        System.out.println();
        
        // Crear un objeto tipo Scanner con identificador sc
        Scanner sc = new Scanner(System.in);
        
        // Obtener el subtotal del usuario 
        System.out.println("Ingrese Subtotal:   ");
        double subtotal = sc.nextDouble();                
        double impuesto = subtotal * 0.25;        
        double total = subtotal + impuesto;
        
        // Mostrar el total de factura 
        String mensaje = "Total Factura:    " + total + "\n";
        System.out.println(mensaje);        
    }
    
}
