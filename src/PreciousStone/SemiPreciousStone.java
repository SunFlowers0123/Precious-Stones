package PreciousStone;
import Enumerations.NamesOfStones;
import Enumerations.Transparency;

public class SemiPreciousStone extends Stone {

	public SemiPreciousStone(double weight , double price , NamesOfStones name ,Transparency transparency ) {
		
		setWeight(weight);
		setPrice(price);
		setNamesOfStones(name);
		setTransperensy(transparency);
	
	}
	
//	@Override
//	public int getCarats() {
//		double grams = 0;
//		int carats=0;
//		for(double i=0 ; i<= getWeight(); i += 0.2) {
//			carats++;
//		}
//		return carats;
//	}
}
