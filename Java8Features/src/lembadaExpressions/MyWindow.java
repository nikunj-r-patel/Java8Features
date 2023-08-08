package lembadaExpressions;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {
		
		//creating window using Jframe object
		
		JFrame frame=new JFrame("My Window..");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		//creating button and add it in Jframe
		JButton button= new JButton("Click Me!!");
		frame.add(button);
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println("Button is clicked");
//				JOptionPane.showMessageDialog(null, "Hey! you clicked button");
//				
//			}
//	});
		button.addActionListener(e->{
			System.out.println("Button is clicked");
			JOptionPane.showMessageDialog(null, "Hey! you clicked button again");});
		

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame.setVisible(true);

}}
