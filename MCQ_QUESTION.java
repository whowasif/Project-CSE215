package MCQ_QUESTION;

import java.awt.Color;
import java.awt.Font;
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

public class MCQ_QUESTION implements ActionListener{
	
	
	
	
	 JTextField opField_1 = new JTextField();
	 JTextField op2Field_2 = new JTextField();
	 
	 JTextField op3Field_3= new JTextField();
	 JTextField op4Field_4=new JTextField();
	 JTextField ca5Field_5=new JTextField();
	 
	 
	 public JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		JButton btnNewButton_1_2_1 = new JButton("←Go Back");
		JButton Add_Q_Btn = new JButton("ADD QUESTION");
		JButton submitButton = new JButton("SUBMIT");
		
		
	
	
	
	
	
	JButton clr_ALL_btn = new JButton("CLEAR ALL");
   JTextField mainQField = new JTextField();
	
	
	public MCQ_QUESTION()
	{
		
		
		

		
			
			
			
			

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
			
			
			
			btnNewButton_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));   //GO BACK BUTTON
			btnNewButton_1_2_1.setBorderPainted(false);
			btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
			btnNewButton_1_2_1.setBounds(10, 19, 94, 21);
			btnNewButton_1_2_1.setFocusable(false);
			btnNewButton_1_2_1.addActionListener(this);
			panel_2.add(btnNewButton_1_2_1);
			
			
			mainQField.setBounds(289, 77, 485, 50);
			panel.add(mainQField);
			mainQField.setColumns(10);
			
			JLabel mainQlabel = new JLabel("QUESTION :");
			mainQlabel.setFont(new Font("Arial", Font.BOLD, 14));
			mainQlabel.setBounds(200, 80, 104, 42);
			panel.add(mainQlabel);
			
			
			opField_1.setBounds(343, 157, 199, 33);
			panel.add(opField_1);
			opField_1.setColumns(10);
			
			
			op2Field_2.setBounds(343, 201, 199, 37);
			panel.add(op2Field_2);
			op2Field_2.setColumns(10);
			
			//op3Field_3 = new JTextField();
			op3Field_3.setBounds(343, 249, 199, 33);
			panel.add(op3Field_3);
			op3Field_3.setColumns(10);
			
			//op4Field_4 = new JTextField();
			op4Field_4.setBounds(343, 293, 199, 33);
			panel.add(op4Field_4);
			op4Field_4.setColumns(10);
			
			JLabel op1Label_1 = new JLabel("OPTION 1 :");
			op1Label_1.setFont(new Font("Arial", Font.BOLD, 11));
			op1Label_1.setBounds(273, 160, 60, 27);
			panel.add(op1Label_1);
			
			JLabel op2Label_2 = new JLabel("OPTION 2 :");
			op2Label_2.setFont(new Font("Arial", Font.BOLD, 11));
			op2Label_2.setBounds(273, 212, 60, 14);
			panel.add(op2Label_2);
			
			JLabel op3Label_3 = new JLabel("OPTION 3 :");
			op3Label_3.setFont(new Font("Arial", Font.BOLD, 11));
			op3Label_3.setBounds(273, 258, 60, 14);
			panel.add(op3Label_3);
			
			JLabel op4Label_4 = new JLabel("OPTION 4 :");
			op4Label_4.setFont(new Font("Arial", Font.BOLD, 11));
			op4Label_4.setBounds(273, 297, 60, 24);
			panel.add(op4Label_4);
			
			JLabel caLabel_5 = new JLabel("CORRECT ANSWER :");
			caLabel_5.setFont(new Font("Arial", Font.BOLD, 11));
			caLabel_5.setBounds(273, 374, 116, 27);
			panel.add(caLabel_5);
			
			//ca5Field_5 = new JTextField();
			ca5Field_5.setBounds(399, 371, 190, 33);
			panel.add(ca5Field_5);
			ca5Field_5.setColumns(10);
			
			
			Add_Q_Btn.setBounds(617, 269, 146, 27);
			panel.add(Add_Q_Btn);
			Add_Q_Btn.addActionListener(this);
			
			
			clr_ALL_btn.setBounds(617, 160, 146, 27);
			clr_ALL_btn.addActionListener(this);
			
			panel.add(clr_ALL_btn);
			
			
			
			
			submitButton.addActionListener(this) ;
			submitButton.setBounds(617, 374, 146, 27);
			panel.add(submitButton);
			
			
			
			
			
		
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("Log In");
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		{
		if(e.getSource()==clr_ALL_btn)
		{
		
			mainQField.setText(null);
			opField_1.setText(null);
			op2Field_2.setText(null);
			op3Field_3.setText(null);
			op4Field_4.setText(null);
			ca5Field_5.setText(null);
			
		}
		
		if(e.getSource()==btnNewButton_1_2_1)
		{
			frame.dispose();
			   CourseAndOthers coo=new CourseAndOthers();
				coo.frame.setVisible(true);
			
		}
		
		if(e.getSource()==Add_Q_Btn)
		{  
		
		
			
			if(mainQField.getText().equals("")||opField_1.getText().equals("")||op2Field_2.getText().equals("")||op3Field_3.getText().equals("")||op4Field_4.getText().equals("")||ca5Field_5.getText().equals("") )
					{       
				                                                                             // EMPTY WARNING 
				JOptionPane.showMessageDialog(frame, "You have Have to Fill all the box");
				
				
		    }
			else {
				
				String question = mainQField.getText();
				String option1=opField_1.getText();
				String option2=	op2Field_2.getText();
				String option3=op3Field_3.getText();
				String option4 =op4Field_4.getText();
				String correctAns =ca5Field_5.getText();
				
				String filePath="src/Que.txt";
				
				File file =new File(filePath);
				
				try {
					FileWriter fw = new FileWriter(file);
					fw.write(question);
					fw.write("  ");
					fw.write(option1);
					fw.write("  ");
					fw.write(option2);
					fw.write("  ");
					fw.write(option3);
					fw.write("  ");
					fw.write(option4);
					fw.write("  ");
					fw.write(correctAns);
					fw.write("\n");
					fw.close();
					
					
					
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				
				

				mainQField.setText(null);
				opField_1.setText(null);
				op2Field_2.setText(null);
				op3Field_3.setText(null);
				op4Field_4.setText(null);
				ca5Field_5.setText(null);
				
				
		        
		    }
			
			
			
			
			
		}
		
		if(e.getSource()==submitButton)
		{
			
			
			if(mainQField.getText().equals("")||opField_1.getText().equals("")||op2Field_2.getText().equals("")||op3Field_3.getText().equals("")||op4Field_4.getText().equals("")||ca5Field_5.getText().equals("") )
			{       
		                                                                             // EMPTY WARNING 
		JOptionPane.showMessageDialog(frame, "You have Have to Fill all the box");
		
		
        }
			
			else
			{
			JOptionPane.showMessageDialog(frame, "Your Question Is Set");
			frame.dispose();
			}
			
		}
		
		
	
		
		
		                  
		
		
		
		
		
		
		
		}
		
		
	}

}
