public class EjerciciosArray3 {

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
        for (int i = num-1; i >= 0; i--) {
            System.out.println(Array[i]);
        }
    }

}