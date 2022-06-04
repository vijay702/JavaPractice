package YotubeDsProblems.src.com.eminds.problem;

public class Top10ElementsFromTwoArray {


    public static void  mergeArrays(int a[], int b[], int length1, int lenght2, int c[]){

        int i =0;
        int j =0;
        int k =0;

        while(i < length1 && j < lenght2 ){

           if(a[i] < a[j]){

               a[k] = a[i];
               k++;
               i++;
           }else{
               a[k] = a[j];
               k++;
               j++;
           }

        }
    }



    public static void main(String[] args) {


        int a[] = {10,20,30,40,50, 89,102};
        int length1 = a.length-1;
        int b[] = {12, 13,13,15,25,36,67};
        int length2 = b.length-1;

        int c[] = new int[length1+length2];

        mergeArrays(a,b,length1,length2,c);

        for(int i=0 ; i<length1+length2; i++){

            System.out.println(c[i]);
        }


    }
}
