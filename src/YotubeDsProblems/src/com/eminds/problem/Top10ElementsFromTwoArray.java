package YotubeDsProblems.src.com.eminds.problem;

public class Top10ElementsFromTwoArray {




    public static void mergeArrays(int a[] , int b [] , int len1 ,int  len2, int c[]) {
        int k = 0;
        int i = 0;
        int j = 0;


        while (i < len1 && j < len2) {

            if (a[i] < b[j]) {

                c[k] = a[i];
                k++;
                i++;

            } else {

                c[k] = b[j];
                k++;
                j++;

            }

        }
        while (i < len1) {

            c[k] = a[i];
        }
        while (j < len2) {


            c[k] = b[j];
        }


    }


    public static void main(String[] args) {


        int a[]= {10,20,30,40,50, 89,102};
        int len1 = a.length;
        int b[]= {12, 13,13,15,25,36,67};
        int len2 = b.length;

        int c[] = new int[len1+len2];

        mergeArrays(a,b,len1,len2,c);


        for (int i=0; i < len1+len2; i++)
            System.out.print(c[i] + " ");


    }


}


