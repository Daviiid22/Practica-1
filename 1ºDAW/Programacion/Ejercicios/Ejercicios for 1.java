/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgfor.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero: ");
        numero = sc.nextInt();
        
        for(int n2 = 1; n2 <= numero; n2++ ){
            System.out.println("Los numeros son: "+n2);
        }
    }
    
}
