package PreciousStone;
import Enumerations.NamesOfStones;
import Enumerations.Transparency;

public class PreciousStone extends Stone {
	
	public PreciousStone(double weight ,double price, NamesOfStones name , Transparency transparency) {
		
		setWeight(weight);
		setPrice(price);
		setNamesOfStones(name);
		setTransperensy(transparency);
		
	}
	
//	@Override
//	public int getCarats() {
//		int carats=0;
//		for(double i=0.2 ; i<= getWeight(); i += 0.2) {
//			carats++;
//		}
//		return carats;
//	}
}
