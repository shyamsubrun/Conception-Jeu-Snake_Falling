package Actions;


import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Game.Head;
import Game.PersonnageTir;
import Game.Snake;
import Game.Tail;
public class KeyHandler implements KeyListener {
	
	@Override
	public void keyTyped(KeyEvent e) {
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {

		switch (e.getKeyCode()) {
		
	         case KeyEvent.VK_LEFT:
	                 Snake.head1.setX(Snake.head1.getX()-1);
	                 if( Snake.head1.getX() == -1) {
		            	 Snake.head1.setX(Snake.head1.getX()+16);
		             }
	                 break;
	
	         case KeyEvent.VK_RIGHT:
	             Snake.head1.setX(Snake.head1.getX()+1);
	             if( Snake.head1.getX() == 16) {
	            	 Snake.head1.setX(Snake.head1.getX()-16);
	             }
	                
	             break;
	             
	         case KeyEvent.VK_SPACE:															//ARRAYLIST POUR TIRER
		        	PersonnageTir.Tir.add(new Tail(Snake.head1.getX(),Snake.head1.getY() ));
		        	 break;	
         }
         
    }

}
