package Make_announcement;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import courseAndOthers.CourseAndOthers;

public class Announcement implements ActionListener{
	
	
	JButton btnclr = new JButton("CLEAR");
	private JTextField textField;
	public JFrame frame = new JFrame();
	
	JButton btnUpdate = new JButton("UPDATE");
	public Announcement()
	{
		
		
		
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
	 	JButton btnNewButton_1_2_1 = new JButton("←Go Back");
	 	btnNewButton_1_2_1.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			frame.dispose();
				   CourseAndOthers coo=new CourseAndOthers();
					coo.frame.setVisible(true);
	 			
	 			
	 		}
	 	});
	 	
		
		
	 	btnNewButton_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1.setBounds(10, 19, 94, 21);
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
		
		JLabel lblNewLabel = new JLabel("Write Your Announcement Or Massage :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(220, 104, 325, 50);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.text);
		textField.setBounds(220, 165, 513, 94);
		panel.add(textField);
		textField.setColumns(10);
		
		
		btnUpdate.setBounds(621, 395, 112, 33);
		panel.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		
		btnclr.setBounds(644, 276, 89, 23);
		panel.add(btnclr);
		btnclr.addActionListener(this);
		
		
		
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("Log In");
		frame.setBackground(Color.CYAN);
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
	}
	/*@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource()==btnUpdate)
		{
			String announce = textField.getText();
			
			
			if(textField.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame, "Please Write Something !!");
			}
			
			else
			{
				
				String filePath= "C:/Users/user/Desktop/summer 22/215_LAB_PROJECT/Make_announcement/src/Make_announcement/announc.txt";
				
				File file = new File(filePath);
				
				try {
					FileWriter fw = new FileWriter(file);
					fw.write(announce);
					fw.close();
				   frame.dispose();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				
				
			}
			
			
			
			
			
		}
		
	}*/
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnclr)
		{
			textField.setText(null);
		  
		}
		// TODO Auto-generated method stub
		if(e.getSource()==btnUpdate)
		{
			String announce = textField.getText();
			
			
			if(textField.getText().equals(""))
			{
				JOptionPane.showMessageDialog(frame, "Please Write Something !!");
			}
			
			else
			{
				
				String filePath= "src/Announcement.txt";
				
				File file = new File(filePath);
				
				try {
					FileWriter fw = new FileWriter(file);
					fw.write(announce);
					fw.close();
				   frame.dispose();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
		
	}

}
	}
}
