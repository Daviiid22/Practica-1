/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgwhile.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1-100");
        int nsecret, nusuario=0;
        nsecret = (int) (Math.random() * 100 + 1);
        while (nsecret != nusuario) {
            System.out.println("Escribe un numero: ");
            nusuario = sc.nextInt();
            if (nsecret > nusuario) {
                System.out.println("\nEl numero es mayor.");
            } else {
                System.out.println("\nEl numero es menor");
            }
        }
        System.out.println("HAS ACERTADO");
    }

}
