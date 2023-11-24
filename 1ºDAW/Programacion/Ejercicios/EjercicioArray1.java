public class EjerciciosArrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Array[] = new int[10];
        int suma = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 100 + 1);
            suma += Array[i];
        }
        System.out.println("La suma es: " + suma);
    }

}