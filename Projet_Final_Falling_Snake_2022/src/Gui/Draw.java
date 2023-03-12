package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.Random;

import javax.swing.JLabel;

import Cloks.GameClock;
import Game.PersonnageTir;
import Game.Snake;

public class Draw extends JLabel{

	/**
	 * Point p : PERMET D'INSTANCIER L'OBJET p
	 * PersonnageTir personnageTir : PERTMET D'INSTANCIER LE PERSONNAGE TIR
	 */
	Point p;
	PersonnageTir personnageTir= new PersonnageTir();
	
	
	/**
	 * PERMET DE DESSINER SUR LA FENETRE
	 * TOUTES LES AFFICHAGES SE FONT À PARTIR D'ICI !
	 * @param Graphics g
	 */
	 protected void paintComponent(Graphics g) {
		    super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

	        /*------------Draw FOND D'ECRAN------------------*/
	        g.setColor(Color.LIGHT_GRAY);
	        g.fillRect(0, 0, Gui.width, Gui.height);
	 
	        
	        repaint();
	 
	        /*--------------Draw LA GRILLE---------------*/
	        g.setColor(Color.GRAY);
	      
	        for (int i = 0; i < 16  ; i++) { //LARGEUR
	            for (int j = 0; j < 16; j++) {// LONGUEUR
	            	g.drawRect(i * 32 + Gui.xoff, j * 32 + Gui.yoff, 32, 32);
	            }
	        }    
 	       	
 	       	/*---------------- Draw FRAISE-------------*/
 	       	g.setColor(new Color(204,51,0));
		    p = Snake.ptc(Snake.pickup.getX(), Snake.pickup.getY());
		    g.fillRect(p.x,p.y, 32,32);
			
	 	    
		    /*------------- Draw BOIS ------------------*/
		    g.setColor(Color.blue);
	        p = Snake.ptc(Snake.bois.getX(), Snake.bois.getY());
        	g.fillRect(p.x,p.y, 32,32);

        	
        	/*--------------Draw MYRYILLE----------------*/
        	g.setColor(Color.magenta);
	        p = Snake.ptc(Snake.myrtille.getX(), Snake.myrtille.getY());
        	g.fillRect(p.x,p.y, 32,32);

        	/*--------------Draw PIECE-------------------*/
        	g.setColor(Color.yellow);
	        p = Snake.ptc(Snake.piece.getX(), Snake.piece.getY());
        	g.fillRect(p.x,p.y, 32,32);

        	/*---------------Draw CORPS SERPENT------------*/
	        g.setColor(new Color(51, 204, 51));
        	for (int i = 0; i < Snake.tails.size(); i++) {
        		p = Snake.ptc(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
        		g.fillRect(p.x, p.y, 32, 32);
        	}

	        /*---------------Draw TETE SERPENT--------------*/
	        g.setColor(new Color(0,153,0));
	        p = Snake.ptc(Snake.head.getX(),Snake.head.getY());
	        g.fillRect(p.x,p.y,32,32);

	        /*---------------Draw PERSONNAGE--------------*/
	        g.setColor(Color.black);
	        p = Snake.ptc(Snake.head1.getX(),Snake.head1.getY());
            g.fillRect(p.x, p.y, 32, 32);
            
            personnageTir.deplacementTirPersonnage();
        	        	
        	for (int i = 0; i < PersonnageTir.Tir.size(); i++) {
        		g.setColor(Color.black);
    	        p = PersonnageTir.ptc(PersonnageTir.Tir.get(i).getX(),PersonnageTir.Tir.get(i).getY());
    		 	g.fillRect(p.x, p.y, 32, 32);
    		 }
        	
        	/********************************PARTIE ESTHETIQUE*****************************************/
        	g.setColor(Color.black);
		 	g.fillRect(10, 20, 32, 32);
		 	g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("Personnage", 10, 70);
		 	
		 	g.setColor(Color.green);
		 	g.fillRect(10, 100, 32, 32);
		 	g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("Snake", 10, 150);
		 	
		 	g.setColor(Color.red);
		 	g.fillRect(10, 200, 32, 32);
		 	g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("Fraise", 10, 250);
		 	g.setFont(new Font("Ariel",Font.BOLD,15));
		 	g.drawString("Ajout d'une case", 10, 190);
		 	
		 	g.setColor(Color.BLUE);
		 	g.fillRect(10, 300, 32, 32);
		 	g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("Bois", 10, 350);
			g.setFont(new Font("Ariel",Font.BOLD,15));
		 	g.drawString("Bloc", 10, 290);
		 	
		 	g.setColor(Color.yellow);
		 	g.fillRect(10, 400, 32, 32);
		 	g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("Piece", 10, 450);
			g.setFont(new Font("Ariel",Font.BOLD,15));
		 	g.drawString("Random", 10, 390);
		 	
		 	g.setColor(Color.magenta);
		 	g.fillRect(10, 500, 32, 32);
		 	g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("Myrtille", 10, 550);
			g.setFont(new Font("Ariel",Font.BOLD,15));
		 	g.drawString("Mode invincible", 10, 490);
		 	
			g.setColor(Color.black);
		 	g.setFont(new Font("Ariel",Font.BOLD,20));
		 	g.drawString("fait le 11-11-22", 510, 550);

	 }
	
}
