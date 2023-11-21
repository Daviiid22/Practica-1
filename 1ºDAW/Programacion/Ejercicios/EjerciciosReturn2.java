/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgreturn.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosReturn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int h, m, s;
        System.out.println("Escribe las horas: ");
        h = sc.nextInt();
        System.out.println("Escribe los munitos: ");
        m = sc.nextInt();
        System.out.println("Escribe los segundos: ");
        s = sc.nextInt();
        Boolean comp = comp(h, m, s);
        System.out.println("La hora " + h + ":" + m + ":" + s + ". Es "+comp);
    }

    static Boolean comp(int h, int m, int s) {
        return !(h > 24 || m > 60 || s > 60);
    }
}
