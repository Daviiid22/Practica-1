/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.condicionales;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        System.out.print("Escribe el dia(1-31): ");
        dia = sc.nextInt();

        System.out.print("Escribe el mes(1-12): ");
        mes = sc.nextInt();

        System.out.print("Escribe el año(1 o superior) ");
        año = sc.nextInt();

        if (año == 0 || mes < 1 || mes > 12 || dia < 1) {
            System.out.print("Fech erronea. ");
        } else {
            if (mes == 2 && dia > 28) {
                System.out.print("Fecha erronea");
            }
              else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia > 31) {
                System.out.print("Fecha erronea");
            } else if (mes == 4 || mes == 5 || mes == 8 || mes == 11 && dia > 30) {
                System.out.print("Fecha erronea");
            } else {
                System.out.print("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
            } 
        }
    }

}
