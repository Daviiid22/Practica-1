/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.pkgfor.pkg5;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosFor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nalumnos;
        System.out.println("Escribe el numero de alumnos: ");
        nalumnos = sc.nextInt();
        
        int aprobados=0;
        int suspendidos=0;
        double sumanotas=0;
        
        for(int i=1; i<=nalumnos; i++){
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            double nota=sc.nextDouble();
            if (nota >= 5.0) {
                aprobados++;
            } else {
                suspendidos++;
            }
            sumanotas += nota;             
        }
        
        double notamedia = sumanotas / nalumnos;

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspendidos);
        System.out.println("Nota media: " + notamedia);
    }
    
}
