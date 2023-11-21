/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.voluntarios.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosVoluntarios22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num, resultado;
        System.out.println("Calcular valor absoluto de un numero.");
        System.out.println("Escribe un numero: ");
        num = sc.nextInt();
        resultado = (num < 0) ? -num : num;
        System.out.println("El valor absoluto de " + num + " es: " + resultado);
    }

}
