package recursion;

public class Fib {


    public static void main(String[] args) {

        fibo(4);

    }


    static int fibo(int n){

        System.out.println(n);


        int fib = (n-1) +(n-2);
        return n ;


    }
}
