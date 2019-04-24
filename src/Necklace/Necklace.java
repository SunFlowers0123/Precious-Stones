package Necklace;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Enumerations.Material;
import Factory.KyivFactory;
import PreciousStone.Stone;

public class Necklace {

	private List<Stone>listOfStone;  
	private Random rand = new Random();
	private KyivFactory factory = new KyivFactory(); // this object for creates stones
	
	private double price;
	private int numbersOfNecklase=1;
//	private Material material;
	private int randomMaterialValue;	// Enumeration value . From this atribut depends price of necklace int range 100 to 500
	private double sumOfNecklace;
	
	
	private void createNecklace() {
		randomMaterialValue =rand.nextInt(3)+1;
		System.out.println(randomMaterialValue);
		if(Material.values()[randomMaterialValue]==Material.BRONZE) {price = 100;}else
		if(Material.values()[randomMaterialValue]==Material.SILVER) {price = 250;}else 
		if(Material.values()[randomMaterialValue]==Material.GOLD) 	{price = 500;}
			
	}
	
	
	public void necklace() {		// select price of necklace and create stone objects
		createNecklace();
		numbersOfNecklase = rand.nextInt(10)+1;
		listOfStone=new ArrayList();
		for(int i=0;i< numbersOfNecklase;i++) {
//			listOfStone.add(KyivFactory.createStone());
			listOfStone.add(factory.createStone());
			
		}
	}
	
//	public void theCostOfNecklace(int selectedStone) {
//		if((selectedStone<1)&&(selectedStone>listOfStone.size())) {theCostOfNecklace(selectedStone);}
//		sumOfNecklace = sumOfNecklace + listOfStone.get(selectedStone-1).getPrice() + price;
//		System.out.println(sumOfNecklace);
//	}
	
	public double sumOfNecklace() { // The price of necklace and stones on necklace
		return price= price + sumOfNecklace;
	}
	
	public void printStonesOnNecklace() {	// the method that print stones on necklace
		for(int i=0;i<listOfStone.size();i++) {
			System.out.println(i+1 + " ) " + listOfStone.get(i).getNamesOfStones());
		}
	}
	
	public void theCostOfNecklace(int selectedStone) {
		if((selectedStone<1)&&(selectedStone>listOfStone.size())) {theCostOfNecklace(selectedStone);}
		sumOfNecklace = sumOfNecklace + listOfStone.get(selectedStone-1).getPrice() + price;
		System.out.println(sumOfNecklace);
	}
	
	
	public void printStonesWeight() { 
		double weightOfStones=0;
		for(int i=0;i<listOfStone.size();i++) {
			weightOfStones = weightOfStones + listOfStone.get(i).getWeight(); // calculate the weight of stones
		}
		weightOfStones = new BigDecimal(weightOfStones).setScale(3,RoundingMode.HALF_UP).doubleValue(); // here we round up to three decimal places

		System.out.println(weightOfStones);
	}
	
	public void printNumbersOfCarats() {
		
		for(int i=0;i<listOfStone.size();i++) {
			System.out.println( i+1 + " stone have : " + listOfStone.get(i).getCarats() + " carats"); // we calculate the numbers of carats on weight and print
		}
	}
	
	public void printParameterOfTransparency() {
		for(int i=0;i<listOfStone.size();i++) {	
			System.out.println(listOfStone.get(i)); // print transparansy of stone
		}
	}
	
	public void printSortedStonesByPrice() {
		sortStonesByPrice(listOfStone);// this method sorted objects by comparator 
		for(int i=0;i<listOfStone.size();i++) {
			System.out.println(i+1 + " ) " +"  " + listOfStone.get(i).getNamesOfStones() +"  transparency : " + listOfStone.get(i).getTransperensy()+"  price of this stone : " + listOfStone.get(i).getPrice());
		}// and here we print the sorted objects . Sort by price
	}
	///
	private static void sortStonesByPrice(List<Stone> list){
        Collections.sort(list, new Comparator<Stone>() {
            @Override
        	public int compare(Stone o1, Stone o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
	}
}
