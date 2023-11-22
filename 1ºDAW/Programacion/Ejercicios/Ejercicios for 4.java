/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgfor.pkg4;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosFor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here7
        Scanner sc = new Scanner(System.in);
        int numero, factorial = 1;
        System.out.println("Escribe un numero: ");
        numero = sc.nextInt();
        for (; numero > 0; numero--) {
            factorial *= numero;
        }
        System.out.println("el factorial es: " + factorial);
    }

}
