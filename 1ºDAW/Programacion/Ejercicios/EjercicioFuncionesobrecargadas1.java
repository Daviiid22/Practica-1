/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.funciones.sobrecargadas.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosFuncionesSobrecargadas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, caso;
        System.out.println("Escribe '1' si quieres 2 numeros y '2' si quieres 3 numeros");
        caso = sc.nextInt();
        switch (caso) {
            case 1: {
                System.out.println("Escribe un numero: ");
                num1 = sc.nextInt();
                System.out.println("Escribe otro numero: ");
                num2 = sc.nextInt();
                System.out.println("El numero mayor es: " + mayor(num1, num2));
                break;
            }
            case 2: {
                System.out.println("Escribe un numero: ");
                num1 = sc.nextInt();
                System.out.println("Escribe otro numero: ");
                num2 = sc.nextInt();
                System.out.println("Escribe otro numero: ");
                num3 = sc.nextInt();
                System.out.println("El numero mayor es: " + mayor(num1, num2, num3));
                break;
            }
            default:
                System.out.println("ERROR");
                break;
        }
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    static int mayor(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
