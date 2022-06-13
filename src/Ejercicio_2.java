public class Ejercicio_2 {
    static int MCD (int a, int b){
        if(a==0 || b==0){
            return 0;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return MCD(a-b,b);
        }else{
            return MCD(a,b-a);
        }
    }
}
