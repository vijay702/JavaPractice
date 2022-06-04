package recursion;

public class FibaonacciNumbers {

    public static void main(String[] args) {

        // 0 1   1 2  3  5   8   13  21   34

        int a =0;
        int b =1;
        int temp =0;
        int target =15;

        System.out.println(a+"  "+b );

        for(int i=2; i<=target ; i++){

            temp =a+b;//1
            System.out.println(temp);

            a=b;
            b=temp;






        }

    }
}
