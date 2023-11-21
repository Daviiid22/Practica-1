/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkgreturn.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjercicioReturn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Escribe un numero: ");
        num1 = sc.nextInt();
        System.out.println("Escribe otro numero: ");
        num2 = sc.nextInt();
        int mayor = mayor(num1, num2);
        System.out.println("El numero mas grande es: " + mayor);
    }

    static int mayor(int grande, int peque) {
        if (grande > peque) {
            return grande;
        } else {
            return peque;
        }
    }
}
