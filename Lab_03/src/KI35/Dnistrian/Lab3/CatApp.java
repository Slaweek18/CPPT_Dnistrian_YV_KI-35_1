/**
 * lab 3 package
 */
package KI35.Dnistrian.Lab3;
import java.io.*;

/**
 * Cat Application class implements main method for Cat class possibilities demonstration
 * @author Slaweek
 * @version 1.0
 */
public class CatApp {

	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException{

		Cat tom=new Cat(Eyes.Regime.dilated,"Blue",100.0F,13.5F,Paws.clawCondition.within,"Gray",4);
		
		tom.colorCat(tom.getColorEyeCat(),tom.getColorFurCat());
		tom.typeOfCatFur(tom.getLengthFurCat());
		tom.pet(tom.getVision(),tom.getClawCondition());
		
		if(tom.getVision()==Eyes.Regime.dilated && tom.getClawCondition()==Paws.clawCondition.out) 
		tom.timeToEat(tom.getSpeedCat(), tom.getDistanceToPreyCat());
		else if(tom.getVision()==Eyes.Regime.narrow && tom.getClawCondition()==Paws.clawCondition.out)
		tom.numberOfScratches();
		else
		tom.catPettingTime();
		
		tom.dispose();
	}

}

