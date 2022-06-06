package eminds.daily;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class abc{




    public static void mergeArrays(int a[] , int b [] , int len1 ,int  len2, Integer c[]) {
        int k = 0;
        int i = 0;
        int j = 0;


        while (i < len1 && j < len2) {

            if (a[i] < b[j]) {

                c[k++] = a[i++];


            } else {

                c[k++] = b[j++];
            }

        }
        while (i < len1) {

            c[k++] = a[i++];
        }
        while (j < len2) {


            c[k++] = b[j++];
        }


    }


    public static void main(String[] args) {


        int a[]= {10,20,30,40,50, 89,102};
        int len1 = a.length;
        int b[]= {12, 13,13,15,25,36,67};
        int len2 = b.length;

        Integer c[] = new Integer[len1+len2];

        mergeArrays(a,b,len1,len2,c);



        System.out.println("**************");

        for (int i=0; i<c.length; i++) {
            Arrays.sort(c, Collections.reverseOrder());
            System.out.println(c[i] "");
        }




    }


}


