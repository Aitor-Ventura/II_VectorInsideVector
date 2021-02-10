public class Excercise {
    //Método auxiliar
    public static int aux(double[] vector, double[] a2, int c){
        for (int i = 0; i < a2.length; i++){
            if (a2[i] == vector[i]){
                c++;
            }
        }
        return c;
    }
    
    //Método principal
    public static int match(double[] a1, double[] a2) {
        int x = -1;
        int c = 0;
        double[] res = new double[a2.length];
        if (a2.length <= a1.length){
            for (int i = 0; i < a1.length - a2.length + 1; i++){
                for (int j = 0; j < a2.length; j++){
                    res[j] = a1[i + j];
                }
                c = aux(res, a2, c);
                if (c == a2.length){
                    x = i;
                    break;
                } else {
                    c = 0;
                }
            }
        }
        return x;
    }
}