package Game;

import java.awt.Point;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Bois {
	/**
	 * LES VARIABLES
	 */
	public static int x, y;
		Point p;
	    
		/**
		 * CONSTRUCTOR
		 * PERMET D'INITIALISER LE x ET y PAR DES VALEURS RANDOM
		 */
		public Bois(){
	    	
	    	this.x = ThreadLocalRandom.current().nextInt(0,15);
	        this.y = ThreadLocalRandom.current().nextInt(0,15);
	    }
		
		/**
		 * PERMET DE REINITIALISER LA VALEUR DE X ET Y 
		 * AVEC DES VALEURS RANDOM.
		 */

	    public void reset(){
	        this.x = ThreadLocalRandom.current().nextInt(0,15);
	        this.y = ThreadLocalRandom.current().nextInt(0,15);
	    }

	    public static int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public static int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }
}
