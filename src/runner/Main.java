package runner;
import java.util.Scanner;

import Necklace.Necklace;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Necklace necklace = new Necklace();
		int chooseStones=0;
		necklace.necklace();
		
		System.out.println("\tJewelry Store 'Gold age'");
		System.out.println("Our catalog : ");necklace.printStonesOnNecklace();
		System.out.print("The sum of weight of this stones : "); necklace.printStonesWeight();
		System.out.println("Numbers of carats of this stones : ");necklace.printNumbersOfCarats();
		System.out.println("\n\n");
		
		System.out.println("Sorted stones by price : "); necklace.printSortedStonesByPrice();
		
		for(;;) {
			System.out.print("Choose the stones that you want to see in your necklace : ");
			chooseStones=scan.nextInt();
			necklace.theCostOfNecklace(chooseStones);
			System.out.println("Press 'Y' to pay or 'N' to continue add stone to necklace : ");
			String YesNo=scan.next();
			if((YesNo.equals("y"))||(YesNo.equals("Y"))) { System.out.println("The price of necklace and stones : "+necklace.sumOfNecklace());  break;}
		}
		
	}
		
}

