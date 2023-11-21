/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciofunciones3;

import java.util.Scanner;

/**
 *
 * @author alumnat
 */
public class EjercicioFunciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        double radio, altura ;
        System.out.println("Escribe el radio: ");
        radio = sc.nextDouble();
        System.out.println("Escribe la altura: ");
        altura = sc.nextDouble();
        System.out.println("Escribe '1' si quieres calcular el area y '2' si quieres calcular el volmen.");
        num = sc.nextInt();
        aov(num, radio, altura);
    }

    static void aov(int num, double radio, double altura) {
        switch (num) {
            case 1: {
                double area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El area es: " + area);
                break;
            }
            case 2: {
                double volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen es: " + volumen);
                break;
            }
            default:
                System.out.println("ERROR");
                break;
        }
    }

}
