package eminds.daily;

public class ArrayThirdSum {



 public static void arrayNegativeValues(int a[], int len) {



     int result[] = new int[len];
     int j = 0;// index of result

     for (int i = 0; i < len; i++) {

         if (a[i] >= 0) {

             result[j++] = a[i];
         }


     }
     if (j == len || j == 0) {

         return;
     }

     //store - values to array
     for (int i = 0; i < len; i++) {
         if (a[i] < 0) {
             result[j++] = a[i];
         }

     }
     //print the answer
     for (int i = 0; i < len; i++) {
         a[i] = result[i];
     }
 }

    public static void main(String[] args) {

            int a[] ={2, -2, 4, -3, 6, -5, 11};
            int len = a.length;


            arrayNegativeValues(a,len);

            for(int i=0 ; i<len ; i++)
                System.out.println(a[i] + "");

    }
    }






