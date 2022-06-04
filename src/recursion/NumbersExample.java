package recursion;

public class NumbersExample {

    //print numbers : 1 2 3 4 5


    static void print(long n){

        if(n==100){
            System.out.println(n);

            return;
        }

        //calling a same function again and again
        print(n+1);
    }


    public static void main(String[] args) {

       print(1);

    }
}
