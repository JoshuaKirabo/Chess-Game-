package main;

import javax.swing.JFrame;

public class Main 
	{
		public static void main(String[]args)
			{
				JFrame gameWindow = new JFrame("Chess Game");
				gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gameWindow.setResizable(false);
				
				// Adding GamePanel to the window
				GamePanel gp = new GamePanel();
				gameWindow.add(gp);
				gameWindow.pack();
				
				gameWindow.setLocationRelativeTo(null);
				gameWindow.setVisible(true);
				
				gp.launchGame();
			}
	}
