package Cloks;

import Actions.Collision;
import Actions.KeyHandler;
import Game.Dir;
import Game.PersonnageTir;
import Game.Snake;
import Gui.Draw;
import Gui.Gui;
import Menu.LaunchPage;


public class GameClock extends Thread{
	/**
	 * VARIABLE running & PAUSE
	 */
    public static boolean running = true;
    private int pause=50;

    @Override
    public void run(){
    	//METHODE PERMETTANT D'AFFICHER LE SNAKE AVEC UNE TAILLE >1
        Snake.nbcorpinit();
        
        	while(running){
        		try {

                /*===============COLLISION PERSONNAGE==================*/
    				for (int i = 0; i < 15; i++) {		/*--PERMET D'ALLER À DROITE--*/
    					Collision.collideFraise();
    					Collision.collideBois();
    					Collision.collideMyrtille();
    					Collision.collidePiece();
                 	
    					sleep(pause);
    					Snake.move();				
                 	
    					if (Snake.head.getY()==15) {	/*--CONDITION d'ARRET--*/
    						System.out.println("GAMEOVER");
    						running=false;
    						
    					}else {
    						if(Snake.tails.size() == 0) {
    							Snake.head.setX(Snake.head.getX() *0);
    							System.out.println("WIN");
    							running=false;
    							
    						}
    					}
    				}         
                 
    				/*--PERMET DE DESCENDRE */
        				Snake.movedown();
                 
                 		for (int i = 0; i < 15; i++) {	
                 			Collision.collideFraise(); /*---POUR ALLER À GAUCHE---*/
                 			Collision.collideBois();
                 			Collision.collideMyrtille();
                 			Collision.collidePiece();
                     
                 			sleep(pause);
                 			Snake.moveleft();
                 			
                 			
          
                 			if (Snake.head.getY()==15) {		/*CONDITION D'ARRET*/
                  				System.out.println("GAMEOVER");
                  			
                  				 running=false;
                  				
                  			}else {
        						if(Snake.tails.size() == 0) {
        							Snake.head.setX(Snake.head.getX()*0);
        							System.out.println("WIN");
        							running=false;
        							
        						}
        					}
                     
                 		}
                 Snake.movedown();
               
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}
        	}
        	
        }
   
}
