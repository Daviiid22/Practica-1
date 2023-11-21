/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgwhile.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad, sedad = 0, voltes = 0, majores = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la edad del alumno: ");
        edad = sc.nextInt();
        while (edad >= 0) {
            sedad += edad;
            voltes++;
            if (edad >= 18) {
                majores++;
            }
            Scanner sca = new Scanner(System.in);
            System.out.print("Escribe otra edad: ");
            edad = sca.nextInt();
        }
        System.out.println("\nLa suma de las edades es: "+ sedad);
        System.out.println("La media de las edades es: "+ ((float)sedad/(float)voltes));
        System.out.println("El numero de alumnos es: "+ voltes);
        System.out.println("Hay "+ majores + " mayores de edad.");
    }

}
