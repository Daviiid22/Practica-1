public class EjerciciosArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int Array[] = new int[5];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("Valor en la posicion " + i + ": ");
            Array[i] = sc.nextInt();
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        /*for (int valor: Array) {
            System.out.println(valor);
        }*/
              
    }
    
}