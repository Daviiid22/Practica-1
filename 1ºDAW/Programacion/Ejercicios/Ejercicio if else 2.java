/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkgif.pkgelse.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjercicioIfElse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, grande, peque;
        
        System.out.print("Introduce un numero: ");
        numero1 = sc.nextInt();
        
        System.out.print("Introduce otro numero: ");
        numero2 = sc.nextInt();
        
        peque = (numero1 < numero2) ? numero1 : numero2;
        grande = (numero1 < numero2) ? numero2 : numero1;
        
        System.out.println("Ordenados: "+ grande+", es mayor que "+ peque);
    }
    
}
