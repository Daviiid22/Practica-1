/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkgswitch;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.print("Escribe tu nota del 0-10: ");
        nota = sc.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.print("Insuficiente");
                break;
            case 5:
                System.out.print("Suficiente");
                break;
            case 6:
                System.out.print("Be");
                break;
            case 7, 8:
                System.out.print("Notable");
                break;
            case 9, 10:
                System.out.print("Excelente");
                break;
            default:
                System.out.print("Nota Erronea");
        }
    }

}