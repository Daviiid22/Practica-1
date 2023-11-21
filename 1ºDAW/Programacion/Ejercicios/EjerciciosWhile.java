/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        double potencia;
        System.out.print("Escribe un numero: ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero no es par");
            }
            if (numero > 0) {
                System.out.println("El numero es positivo");
            } else {
                System.out.println("El numero no es positivo");
            }
            potencia = Math.pow(numero,2);
            
            System.out.println("Su cuadrado es: "+ potencia);
            
            Scanner sca = new Scanner(System.in);
            System.out.print("Escribe otro numero: ");
            numero = sca.nextInt();
        }
    }

}
