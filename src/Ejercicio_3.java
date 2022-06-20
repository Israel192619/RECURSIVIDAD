public class Ejercicio_3 {
    public static int suma (int vector[], int n){
        if (n < 0) {
            return 0;
        }else {
            return suma(vector, n - 1) + vector[n];
        }
    }
}
