/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.funciones2;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjercicioFunciones2 {

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
        if (num1 > num2) {
            ent(num1, num2);
        } else {
            ent(num2, num1);
        }
    }

    static void ent(int mayor, int menor) {
        System.out.println("Numeros entre " + mayor + " y " + menor + " de mayor a menor:");
        for (int i = mayor - 1; i > menor;i--) {
            System.out.println(i);
        }
    }

}
