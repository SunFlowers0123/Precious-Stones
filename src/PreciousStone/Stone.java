package PreciousStone;
import Enumerations.NamesOfStones;
import Enumerations.Transparency;

public abstract class Stone {
	
	private Transparency transperensy; // enumeration that point out Transperensy of stone .From transperensy depends on the price
	private NamesOfStones namesOfStones; // enumeration that points out in type of stone . From type depends  the price
	private double price; // price of stone
	private double weight; // From weight depends the price , from weight depends carats
	private int carats;	
	
	
	public NamesOfStones getNamesOfStones() {
		return namesOfStones;
	}
	public void setNamesOfStones(NamesOfStones namesOfStones) {
		this.namesOfStones = namesOfStones;
	}
	
	public Transparency getTransperensy() {
		return transperensy;
	}
	public void setTransperensy(Transparency transperensy) {
		this.transperensy = transperensy;
	}
	
	public int getCarats() {  // here we calculate the numbers of carats on weight
		double grams = 0;
		int carats=0;
		for(double i=0 ; i<= getWeight(); i += 0.2) {
			carats++;
		}
		return carats; 
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

}
