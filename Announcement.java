package StudentPortal;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Login.StudentLogin;
import courseAndOthers.CourseAndOthers;
import javax.swing.JTextArea;

public class Announcement implements ActionListener{
	JFrame frame = new JFrame();
	JButton logoutbtn = new JButton("Log Out");
	JButton btnNewButton_1_2_1 = new JButton("←Go Back");
	public Announcement()
	{
		
		
		
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
	 	
		
		
	 	btnNewButton_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1.setBounds(10, 19, 94, 21);
		btnNewButton_1_2_1.addActionListener(this);
		panel_2.add(btnNewButton_1_2_1);
		
		
		
		panel_2.setBorder(new LineBorder(new Color(175, 220, 235), 2, true));		//UPPER PANEL
		panel_2.setBackground(new Color(175, 220, 235));
		panel_2.setBounds(0, 0, 785, 50);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		

		panel_1.setBackground(new Color(202, 233, 245));
		panel_1.setBorder(new LineBorder(new Color(202, 233, 245), 2, true));		//LEFT PANEL
		panel_1.setBounds(0,50,190,413);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		panel.setBackground(new Color(240, 248, 255));
		panel.setBorder(new LineBorder(new Color(240, 248, 255), 2, true));			//WHOLE PANEL
		panel.setBounds(0, 0, 485, 282);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(200, 144, 576, 309);
		panel.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Announcements : ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(220, 104, 325, 50);
		panel.add(lblNewLabel);
		
		File file =  new File("src/Announcement.txt");
		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				textArea.setText(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		logoutbtn.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		logoutbtn.setBackground(Color.LIGHT_GRAY);
		logoutbtn.setBounds(686, 11, 89, 23);
		logoutbtn.addActionListener(this);
		panel_2.add(logoutbtn);
		
		
		
		
		
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("Log In");
		frame.setBackground(Color.CYAN);
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnNewButton_1_2_1)
		{
			
			
		  
		}
		
		
		if(e.getSource()==logoutbtn)
		{
			 
			frame.dispose();
			StudentLogin sl = new StudentLogin();
			sl.frame.setVisible(true);
			
		}
		
		if(e.getSource()==btnNewButton_1_2_1)
		{
			
			StudentPortal co=new StudentPortal();
			frame.dispose();
			co.frame.setVisible(true);
		}
		
		
		
		
	}
}
