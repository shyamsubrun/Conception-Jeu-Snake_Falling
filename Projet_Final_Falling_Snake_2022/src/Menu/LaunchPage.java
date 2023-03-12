package Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Cloks.GameClock;
import Gui.Gui;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Falling SNAKE !");
	JButton myButtonNew = new JButton("NOUVELLE PARTIE");
	JButton myButtonREJOUER = new JButton("REJOUER");
	JButton myButtonOption = new JButton("OPTION");
	JButton myButtonQUIT = new JButton("QUITTER");
	
	public LaunchPage(){
		//BUTTON NEW
		myButtonNew.setBounds(100,140,200,40); //Margin left - margin top - padding 
		myButtonNew.setFocusable(false);
		myButtonNew.addActionListener(this);
		
		//BUTTON REJOUER
//		myButtonREJOUER.setBounds(100,140,200,40); //Margin left - margin top - padding 
//		myButtonREJOUER.setFocusable(false);
//		myButtonREJOUER.addActionListener(this);

		//BUTTON OPTION
		myButtonOption.setBounds(100,200,200,40); //Margin left - margin top - padding 
		myButtonOption.setFocusable(false);
		myButtonOption.addActionListener(this);
		
		//BUTTON QUIT
		myButtonQUIT.setBounds(100,260,200,40); //Margin left - margin top - padding 
		myButtonQUIT.setFocusable(false);
		myButtonQUIT.addActionListener(this);
		
		//LABEL
		label.setBounds(100,50, 500, 40);
		label.setFont(new Font(null, Font.BOLD, 25)); //FONT.PLAIN
		label.setForeground(Color.WHITE);
	
		
		//FRAME ADD
		frame.add(myButtonNew);
//		frame.add(myButtonREJOUER);
		frame.add(myButtonOption);
		frame.add(myButtonQUIT);
		frame.add(label);
		
		//FRAME new Color(5, 65, 90)
		frame.getContentPane().setBackground(new Color(70,80,70));
		frame.setResizable(false);
		frame.setSize(420, 420);
		frame.setTitle("MENU - FALLING SNAKE");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == myButtonNew) {
			frame.dispose();
			//NewWindows myWindows = new NewWindows();
			//myWindows.startGame();
			Gui g = new Gui();
	        GameClock gc = new GameClock();
	        g.create();
	        gc.start();
		}

		if(e.getSource() == myButtonQUIT) {
			frame.dispose();
		}
	}
}
