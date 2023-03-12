package Game;

import java.awt.Point;
import java.util.ArrayList;

import Actions.Collision;
import Gui.Gui;

public class Snake {
	/**
	 * LES VARIABLES
	 */
    public static Personnage head1 = new Personnage(7,15);
	public static boolean waitToMove = false;

    public static Head head = new Head(0, 0); 			//coordonnée tete

    public static ArrayList<Tail> tails = new ArrayList<>();

    public static Fraise pickup = new Fraise();
    
    public static Bois bois = new Bois();

    public static Myrtille myrtille = new Myrtille();

    public static Piece piece = new Piece();

    public static Corps corps2 = new Corps(0,0);
    
    public static int compteur =1 ;
   
    
    /**
     * CONSTRUCTOR
     */
	public static void addTail() {
		
        if (tails.size() < 1) {
        	
            tails.add(new Tail(head.getX(), head.getY()));
        } 
        
        else {
        
        	tails.add(new Tail(tails.get(tails.size() - 1).x, tails.get(tails.size() - 1).y));
        
        }
    }

	/**
	 * METHODE INTERMEDIAIRE QUI VERIFIER SI LE TIR 
	 * TOUCHE  LE CORPS DU SNAKE
	 * @param x
	 * @param y
	 * @return boolean true || false
	 */
    public static boolean atoucher(int x , int y) {
    	
		boolean var=false;
		
    	for (int i = 0; i < Snake.tails.size(); i++) {
    		
			if (Snake.tails.get(i).getX()==x && Snake.tails.get(i).getY()==y) {
				
				var=true;
					break;				
			} 

		}
    	
		return var;   	
    }
  
    
    /**
     * PERMET D'ACTIVER LE MODE INVICIBLE DU SNAKE LORSQU'ON Y A COLLISION AVEC 
     * L'OBSTACLE PIECE
     */
    public  static void touchserpent() {			 
									
    		for (int i = 0; i <  PersonnageTir.Tir.size(); i++) {  
    		
    			if(compteur<=0) {								
	
    				if (atoucher(PersonnageTir.Tir.get(i).getX(), PersonnageTir.Tir.get(i).getY())) {
		
						Snake.tails.remove(Snake.tails.size()-1);
						
						PersonnageTir.Tir.remove(i);
						
						System.out.println("MODE INVISIBLE DESACTIVE !");
		    		}
    			}				
    		
    			if (compteur>0) {
        		compteur--;
    			}
    		}	
    }
    
    /*
     * PERMET D'INITIALISER LE CORPS DU SNAKE
     * ICI C'EST 8.
     */
    public static void nbcorpinit() {  
    	
    	for (int i = 0; i < 8; i++) {
    		
    		tails.add(new Tail(corps2 .getX(),corps2.getY()));
    	}
    }
    
    /**
     * PERMET DE BOUGER LE SNAKE À DROITE
     */
    public static void move() {
        //Move Tails
        if (tails.size() >= 2) {
            for (int i = tails.size() - 1; i >= 1; i--) {
                if (tails.get(i).isWait()) {
                    tails.get(i).setWait(false);
                } else {
                    tails.get(i).setX(tails.get(i - 1).getX());
                    tails.get(i).setY(tails.get(i - 1).getY());
                }
            }
        }

        //Move first Tail to Head
        if (tails.size() >= 1) {
            if (tails.get(0).isWait()) {
                tails.get(0).setWait(false);
            } else {
                tails.get(0).setX(head.getX());
                tails.get(0).setY(head.getY());
            }
        }
     
        //Move Head
        switch (head.getDir()) {
            case RIGHT:
                head.setX(head.getX() + 1);
                break;
            case UP:
                head.setY(head.getY() - 1);
                break;
            case LEFT:
                head.setX(head.getX() - 1);
                break;
            case DOWN:
                head.setY(head.getY() + 1);
                break;
        }

    }

    /**
     * PERMET DE BOUGER LE SNAKE À GAUCHE
     */
    public static void moveleft() {  //Move Head 	
    	//Move Tails
        if (tails.size() >= 2) {
            for (int i = tails.size() - 1; i >= 1; i--) {
                if (tails.get(i).isWait()) {
                    tails.get(i).setWait(false);
                } else {
                    tails.get(i).setX(tails.get(i - 1).getX());
                    tails.get(i).setY(tails.get(i - 1).getY());
                }
            }
        }

        //Move first Tail to Head
        if (tails.size() >= 1) {
            if (tails.get(0).isWait()) {
                tails.get(0).setWait(false);
            } else {
                tails.get(0).setX(head.getX());
                tails.get(0).setY(head.getY());
            }
        }

    	
       switch (head.getDir1()) {
        case RIGHT:
            head.setX(head.getX() + 1);
            break;
        case UP:
            head.setY(head.getY() - 1);
            break;
        case LEFT:
            head.setX(head.getX() - 1);
            break;
        case DOWN:
            head.setY(head.getY() + 1);
            break;
    }
        }
        
    /**
     * PERMET DE DESCNEDRE EN BAS
     */
    public static void movedown() {  //Move Head
        	
        	//Move Tails
            if (tails.size() >= 2) {
                for (int i = tails.size() - 1; i >= 1; i--) {
                    if (tails.get(i).isWait()) {
                        tails.get(i).setWait(false);
                    } else {
                        tails.get(i).setX(tails.get(i - 1).getX());
                        tails.get(i).setY(tails.get(i - 1).getY());
                    }
                }
            }

            
            //Move first Tail to Head
            if (tails.size() >= 1) {
                if (tails.get(0).isWait()) {
                    tails.get(0).setWait(false);
                } else {
                    tails.get(0).setX(head.getX());
                    tails.get(0).setY(head.getY());
                }
            }

        	
        switch (head.getDir3()) {
            case RIGHT:
                head.setX(head.getX() + 1);
                break;
            case UP:
                head.setY(head.getY() - 1);
                break;
            case LEFT:
                head.setX(head.getX() - 1);
                break;
            case DOWN:
                head.setY(head.getY() + 1);
                break;
                }
        }
     
    /*
     * PERMET DE BIEN POSITIONNER LE  X ET Y 
     * DE CORDONNEES DANS LA GRILLE
     */
    public static Point ptc(int x, int y) {
        Point p = new Point(0, 0);
        p.x = x * 32 + Gui.xoff;
        p.y = y * 32 + Gui.yoff;

        return p;
    }
}
