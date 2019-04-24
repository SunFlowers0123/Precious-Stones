package Factory;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import Enumerations.NamesOfStones;
import Enumerations.Transparency;
import PreciousStone.PreciousStone;
import PreciousStone.SemiPreciousStone;
import PreciousStone.Stone;

public class KyivFactory {
	
	/*
	 * 
	 */
	
	private Random rand = new Random();
	private int randomStone;		// atribut that points to stone . This atribut implements in random generator. 
	private int randomValueTransparency; // atribut that points to Transparency of stone . This atribut implements in random generator.
											// From Transparency of stone depends price of stone and necklace
	private int randomValueName ; // this atribut points to name RUBy , Diamond or Saphire and the price depends the name
	private double weight;	// 
	private int price;	
	private Stone preciousStone; // the most expensive type of stones . This object have
	private Stone semiPreciousStone; // the less expensive
	  
	  Transparency transparency ;
	  NamesOfStones name;
	 {
		randomValueName=rand.nextInt(Transparency.values().length);
		price=rand.nextInt()+300;
	}
	
	  private int getPricePreciousStone() {		// in this method you can get price of your chooce stone
		if(Transparency.values()[randomValueTransparency]==Transparency.TRANSPARENT) {price=+250;}else
		if(Transparency.values()[randomValueTransparency]==Transparency.SEMITRANSPARENT) {price=+500;}else
		if(Transparency.values()[randomValueTransparency]==Transparency.COLORED) {price=+950;}
		
		if(NamesOfStones.values()[randomValueName]==NamesOfStones.DIMOND) {price=price+200;}else
		if(NamesOfStones.values()[randomValueName]==NamesOfStones.RUBY) {price=price+500;}else
		if(NamesOfStones.values()[randomValueName]==NamesOfStones.SAPHIRE) {price=price+700;}
		
		return price;
	}
	
	  private int getPriceSemiPreciousStone() { // in this method you can get price of your chooce stone
			if(Transparency.values()[randomValueTransparency]==Transparency.TRANSPARENT) {price=+900;}else
			if(Transparency.values()[randomValueTransparency]==Transparency.SEMITRANSPARENT) {price=+1500;}else
			if(Transparency.values()[randomValueTransparency]==Transparency.COLORED) {price=+2100;}
			
			if(NamesOfStones.values()[randomValueName]==NamesOfStones.DIMOND) {price=price+1400;}else
			if(NamesOfStones.values()[randomValueName]==NamesOfStones.RUBY) {price=price+1800;}else
			if(NamesOfStones.values()[randomValueName]==NamesOfStones.SAPHIRE) {price=price+3700;}
			
			return price;
	}
	
	
	public   Stone createStone() { // this method create object of stone and gives random atributes this object
		randomStone=rand.nextInt(2)+1;
		weight=rand.nextDouble()*15; // the weight of stone in range from 1 to 15 gram
		weight = new BigDecimal(weight).setScale(3, RoundingMode.UP).doubleValue();
		randomValueName=rand.nextInt(Transparency.values().length);
		randomValueTransparency=rand.nextInt(Transparency.values().length);
		
		if(randomStone==1) {//create Precious stone object
			preciousStone = new PreciousStone(weight, getPricePreciousStone(),NamesOfStones.values()[randomValueName],Transparency.values()[randomValueTransparency]);
		return preciousStone;	
		}
		else if(randomStone==2) {//create SemiPrecious stone object
			semiPreciousStone = new SemiPreciousStone(weight, getPriceSemiPreciousStone() ,NamesOfStones.values()[randomValueName],Transparency.values()[randomValueTransparency]);
		return semiPreciousStone;
		}
		return semiPreciousStone;
	}
	
	
	}
	

