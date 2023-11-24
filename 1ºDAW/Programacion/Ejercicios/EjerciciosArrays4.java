public class EjerciciosArray4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a introducir: ");
        int num = sc.nextInt();
        int Array[] = new int[num];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Valor en la posicion " + i + ": ");
            Array[i] = sc.nextInt();
        }
        int mayor = Array[0];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > mayor) {
                mayor = Array[i];
            }
        }
        System.out.println("El valor mas grande es: " + mayor);
    }

}