/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.voluntarios.pkg2.pkg1;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjerciciosVoluntarios21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int base, altura, area;
        System.out.println("Calcular el area de un triangulo.");
        System.out.println("Escribe la base: ");
        base = sc.nextInt();
        System.out.println("Escribe la altura: ");
        altura = sc.nextInt();
        if (base < 0 || altura < 0) {
            System.out.println("ERROR");
        } else {
            area = base * altura;
            System.out.println("El area es: " + area);
        }

    }

}
