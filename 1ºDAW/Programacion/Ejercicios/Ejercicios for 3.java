/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgfor.pkg3;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosFor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresa el numero #" + i + (": "));
            numero = sc.nextInt();
            suma += numero;
        }
        int media = suma / 10;
        System.out.println("La media de los numeros es: " + media);
    }
}
