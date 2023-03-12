package Actions;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import Game.PersonnageTir;
import Game.Fraise;
import Game.Snake;



public class Collision {
	
	
	/**
	 * COLLISION EN GENERAL
	 * PERMET DE FAIRE UNE COLLISION GENRERALE
	 * @return Boolean 
	 */
    public static boolean collideWall() {
        return (Snake.head.getX() < 0 || Snake.head.getX() > 15 || Snake.head.getY() < 0 || Snake.head.getY() > 15);
     
    }
    
    /**
     * COLLISION FRAISE
     * PERTMET DE FAIRE LA COLLISION AVEC L'OBSTACLE FRAISE.
     */
    
    public static void collideFraise() {
        if (Snake.head.getX() == Snake.pickup.getX() && Snake.head.getY() == Snake.pickup.getY()) {
            Snake.pickup.reset();
            Snake.addTail();
        	System.out.println("COLLISION FAITE AVEC L'OBSTACLE FRAISE !");
        }
    }
    
    /**
     * COLLISION BOIS
     * PERMET DE FAIRE UNE COLLISION AVEC L'OBSTACLE BOIS.
     */
    
    public static void collideBois() {		
       
    	if (Snake.head.getX() == Snake.bois.getX() && Snake.head.getY() == Snake.bois.getY()) {
        	System.out.println("COLLISION FAITE AVEC LE BOIS");
        	
        	Snake.head.setY(Snake.head.getY()+1);
        	}
    	
    }
    
    /**
     * COLLISION PIECE
     * PERMET DE FAIRE UNE COLLISION AVEC L'OBSTACLE PIECE.
     */
  
    public static void collidePiece() {		
    	
	  if (Snake.head.getX() == Snake.piece.getX() && Snake.head.getY() == Snake.piece.getY()) {
      	System.out.println("COLLISION FAITE AVEC MA PIECE");
      	
      		Snake.pickup.reset();
      		Snake.bois.reset();
      		Snake.myrtille.reset();
      		Snake.piece.reset();	
	  }
	}
    
    
    /**
     * COLLISION MYRTILLE
     * PERMET DE FAIRE UNE COLLISION AVEC L'OBSTACLE MYRTILLE.
     */
    
    public static void collideMyrtille() {
	 
	  if (Snake.head.getX() == Snake.myrtille.getX() && Snake.head.getY() == Snake.myrtille.getY()) {
      	System.out.println("COLLISION FAITE AVEC LA MYRTILLE");
 
      	 Snake.compteur=5000/2;			/*---TEMPS D'INVICIBILITE---*/
      	 
 		System.out.println("INVINCIBLE");
	  }
	  
    }
    
    /**
     * COLLISION FAITE À GAUCHE
     */
    public static  void collideWalltoutagauche() {
    	if( Snake.head.getX() > 15 ) {
    		int i=0;
    		if (i<1) {
        		Snake.head.setY(1);
        		i++;
        	}
    	}
    }
    
}

  
    
    

