package solitaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI extends JPanel{
	
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel(new BorderLayout());
	private static JButton button = new JButton("<html><h1 style=;font-size:xxx-large;color:black;'><br><center>Play</center></h1></html>");

	
	
	
	public GUI() {
		
		
		

		panel.setBackground(new Color(26, 122, 31));
		panel.add(new JLabel("<html><h1 style='font-family:Times New Roman;font-size:70px;color:white;'>Java Solitaire</html>",JLabel.CENTER),BorderLayout.NORTH);
		panel.add(new JLabel("<html><h1 style='font-family:Times New Roman;font-size:30px;color:white;'><br>A game by CST8334 Group Five</h1></html>",JLabel.CENTER));
		button.setFont(new Font("Times New Roman",Font.BOLD,50));
		button.setSize(500,100);
	
		
		frame.add(button,BorderLayout.SOUTH);
		
		
		
		frame.add(panel);
        frame.setLocation(300, 100);
        frame.setPreferredSize(new Dimension(600,480));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        
        


	}
	
	
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				GUI frameSize = new GUI();
				
				 button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							panel.removeAll();
							button.setVisible(false);
							panel.setBackground(new Color(17, 128, 22));
							frame.setPreferredSize(new Dimension(800,640));
							
							BufferedImage img = null;
							try {
							    img = ImageIO.read(new File("images/back_of_card.png"));
							} catch (IOException e1) {
							    e1.printStackTrace();
							}
							
							JLabel label = new JLabel();
							Image dimg = img.getScaledInstance(20,20, Image.SCALE_SMOOTH);
							label.setIcon(new ImageIcon(new ImageIcon("images/back_of_card.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
							panel.add(label,BorderLayout.NORTH);
							
							JLabel cardOne = new JLabel();
							Image dimg1 = img.getScaledInstance(20,20, Image.SCALE_SMOOTH);
							cardOne.setIcon(new ImageIcon(new ImageIcon("images/back_of_card.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
							panel.add(cardOne,BorderLayout.CENTER);
							


							frame.add(panel);
					        frame.setLocation(300, 100);
					        frame.setPreferredSize(new Dimension(600,480));
					        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT
					        frame.setResizable(false);
					        frame.pack();
					        frame.setVisible(true);
					        
					        
						}
						
			        });
				
			}


		});
		
	}





}
