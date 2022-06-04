package YotubeDsProblems.src.problem1;

import java.util.Scanner;

public class WaterBottleProblem1 {



//we have a nine bottles ,, after drunk empty 10 bottles

//10 empty bottles to 3 full botles  we can exchange , for 3 empty 1 full bottle

//	and left we have a one empty battle and 3 full bottle

//after compltes a 3 full bottle we have a 4 empty bottle ,

// now we can change 3 and get 1 full bottle , and we have 1  empty

// after drunk a last full bottle we have 2 empty bottles , but now its not possible to exchange

// we need a three empty bottles to exchange .

	public static void main(String[] args) {



	int noOfBt = 10;
	int exchangeBt =3;


	int afterExchangeBottle=0;
	int drunkenBottles = noOfBt;

	while (noOfBt>=exchangeBt){

		//exchange the empty bottles
		afterExchangeBottle = noOfBt/exchangeBt;

		drunkenBottles = drunkenBottles+afterExchangeBottle;

		noOfBt = afterExchangeBottle+(noOfBt%exchangeBt);



	}
		System.out.println(drunkenBottles);







	}
	
			
	


			
		
		
	

}
