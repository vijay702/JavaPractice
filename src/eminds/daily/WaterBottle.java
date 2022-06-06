package eminds.daily;

import java.util.Scanner;

public class WaterBottle {


    public static void main(String[] args) {


        int numofbottle ;
        int numofexchange;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of battle value ");
        numofbottle=sc.nextInt();

        System.out.println(" enter a no of exchange");
        numofexchange=sc.nextInt();


        //remaining bottles
        int res = numofbottle;

    while(numofbottle>=numofexchange){

        int exchangeRemain = numofbottle/numofexchange;
        res = exchangeRemain +res;


        numofbottle = exchangeRemain + (numofbottle%numofexchange);


    }

        System.out.println(res);



    }


}
