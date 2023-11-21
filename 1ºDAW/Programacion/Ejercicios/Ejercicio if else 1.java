/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float numero;
        System.out.println("Introduce un numero: ");
        numero = sc.nextFloat();

        if (numero > -1 && numero < 1 && numero != 0) {
            System.out.println("Correcto");
        } else {
            System.out.println("ERROR");
        }

    }
}
