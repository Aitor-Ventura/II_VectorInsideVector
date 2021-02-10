import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Crea vector1 leyendo sus elementos
        double[] vector1 = Internal.loadDoubleArray(input);
        
        // Crea vector2 leyendo sus elementos
        double[] vector2 = Internal.loadDoubleArray(input); 

        int pos = Excercise.match(vector1, vector2);
        System.out.print("La posición es: " + pos);
    }
}