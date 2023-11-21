/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.funciones.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosFunciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Escribe un numero: ");
        num = sc.nextInt();
        eco(num);
    }

    static void eco(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("ECO...");
        }
    }

}
