package Game;

import java.awt.Point;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Piece {
	/**
	 * LES VARIABLES
	 */
	 public static int x, y;
	 Point p;
	 
	 /**
	  * CONSTRUTOR
	  * PERTMET D'INITIALISER LE X ET Y AVEC UNE POSITION RANDOM
	  */
	 	public Piece(){
		  
		 	this.x = ThreadLocalRandom.current().nextInt(0,15);
		 	this.y = ThreadLocalRandom.current().nextInt(0,15);
	 	}
	 	
	 	/**
	 	 * PERMET DE DE FAIRE UN RESET DE LA POSITION INITIALE
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
