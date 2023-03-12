package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import Actions.Collision;
import Gui.Gui;

public class PersonnageTir {
	/**
	 * LES VARIABLES
	 */
	private int xPos; 
	
	private int yPos; 
	
	private int dx, dy;
	
	public boolean pretATirer =false;
	
	private boolean personnageLanceTir = false; 
	
	private static final int HAUTEUR_TIR=32;
	
	private static final int LARGEUR_TIR=32;
	
	public static final int LARGEUR=15;
	
	public static final int HAUTEUR=15;
	
	private static final int DY_TIR_PERSONNAGE=2;
	
    public static ArrayList<Tail> Tir = new ArrayList<>();
    
    Snake snake = new Snake();
    
    
    
    /**
     * CONSTRUCTOR
     * PERMET D'INITIALISER LA POSITION DE xPOS À ZERO (0)
     * yPOS, PAR LA DIFFERENCE ENTRE LA HAUTEUR DU TIR ET LA TËTE
     */
	public PersonnageTir(){
		
		this.xPos = 0;
		this.setyPos(Snake.head1.getY() - HAUTEUR_TIR);
		this.dx = 0;
		this.dy = DY_TIR_PERSONNAGE;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	/**
	 * 
	 * @return
	 */
	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isPersonnageLanceTir() {
		return personnageLanceTir;
	}


	public void setPersonnageLanceTir(boolean personnageLanceTir) {
		this.personnageLanceTir = personnageLanceTir;
	}
	
	/**
	 * DEPLACEMENT DU TIR PERSONNAGE
	 * 
	 * ET COLLISION DES OBJET MISSILE
	 * @return
	 */
	
	public  void deplacementTirPersonnage() {
		
		for (int i = 0; i < Tir.size(); i++) {
			
			if (Tir.get(i).getY()>=0) {

				try {
					Thread.sleep(10);
				} 
				catch (InterruptedException e) {
					
					e.printStackTrace();
				}

				Tir.get(i).setY(Tir.get(i).getY()-1);
				
				snake.touchserpent();


			}else {
				
				Tir.remove(i);
			}
			try {
				
				if(Fraise.getX()==PersonnageTir.Tir.get(i).getX() && Fraise.getY()==PersonnageTir.Tir.get(i).getY() ) {
					Snake.pickup.reset();
					Tir.remove(i);
				}
			 if (Bois.getX()==PersonnageTir.Tir.get(i).getX() && Bois.getY()==PersonnageTir.Tir.get(i).getY() ) {
				 Snake.bois.reset();
				 Tir.remove(i);
			}
			 if (Myrtille.getX()==PersonnageTir.Tir.get(i).getX() && Myrtille.getY()==PersonnageTir.Tir.get(i).getY() ) {
				 Snake.myrtille.reset();
				 Tir.remove(i);
			}
			 if (Piece.getX()==PersonnageTir.Tir.get(i).getX() && Piece.getY()==PersonnageTir.Tir.get(i).getY() ) {
				 Snake.piece.reset();
				 Tir.remove(i);
			}
				
			} catch (Exception e) {
				// TODO: handle exception
			}

			 
		}
	}
	
	/**
	 * DESSINE LE TIR DU PERSONNAGE
	 * @param g
	 */
	public static void dessinTirPersonnage(Graphics2D g) {
		for (int i = 0; i < Tir.size(); i++) {
		 	g.setColor(Color.magenta);
			g.fillRect(Tir.get(i).getX(),Tir.get(i).getY(), 32, 32);
		}
	}
	
	/**
	 * PLACE LE POINT DANS LA GRILLE
	 * @param x
	 * @param y
	 * @return
	 */
	public static Point ptc(int x, int y) {
        Point p = new Point(0, 0);
        p.x = x * 32 + Gui.xoff;
        p.y = y * 32 + Gui.yoff;

        return p;
    }

}
