package StudentPortal;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminStudent.Student;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;

public class Quiz  implements ActionListener  {

	public JFrame frame;
	private JTextField textField;
	JButton btnNewButton = new JButton("Next");
	JButton btnNewButton_1 = new JButton("Result");

	
	/**
	 * Launch the application.
	 */
	
	String[] word;
	String ans,o1,o2,o3,o4,o5;
	int count=0,res=0;
	int rep = 0,x=0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the application.
	 */
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void Quiz() {	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("HomePage");
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBorder(new LineBorder(new Color(240, 248, 255), 2, true));			//WHOLE PANEL
		panel.setBounds(0, 0, 485, 282);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(202, 233, 245));
		panel_1.setBorder(new LineBorder(new Color(202, 233, 245), 2, true));		//LEFT PANEL
		panel_1.setBounds(0,50,190,413);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(175, 220, 235), 2, true));		//UPPER PANEL
		panel_2.setBackground(new Color(175, 220, 235));
		panel_2.setBounds(0, 0, 785, 50);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Option 1:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(200, 175, 52, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Option 2:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(200, 218, 52, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Option 3:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(200, 262, 52, 20);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Option 4:");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(200, 311, 52, 20);
		panel.add(lblNewLabel_1_3);
		
		textField = new JTextField();
		textField.setBounds(330, 362, 277, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Your Answer:");
		lblNewLabel_2.setBounds(200, 362, 120, 30);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.CYAN));
		textField_1.setBounds(200, 106, 576, 50);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(135, 206, 250)));
		textField_2.setBounds(262, 166, 179, 36);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(135, 206, 250)));
		textField_3.setBounds(262, 212, 179, 36);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(135, 206, 250)));
		textField_4.setBounds(262, 258, 179, 36);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(135, 206, 250)));
		textField_5.setBounds(262, 304, 179, 36);
		panel.add(textField_5);
		
		JLabel lblNewLabel = new JLabel("Question:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(200, 71, 102, 25);
		panel.add(lblNewLabel);
		
	
		btnNewButton_1.setBounds(569, 432, 85, 21);
		panel.add(btnNewButton_1);
		btnNewButton_1.setVisible(false);
		
		
	
		btnNewButton.setBounds(691, 432, 85, 21);
		panel.add(btnNewButton);
		
		
		
        File file = new File("src/Que.txt");
		
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			 while (sc.hasNext()) {
			        count++;
			        
			    }
			
		
			//adminCollection.printAdminCollection();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
	
	}
	}
	
	void setdata()
	{
		File file = new File("src/Que.txt");
		
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			 while (sc.hasNext()) {
				 String line = sc.nextLine();
				 String word[] = line.split("  ");
			        if(x==rep)
			        {
			        	for(int i = x;i<count;i++)
			        	{
			        		String que = word[0];
			        		String o1 = word[1];
			        		String o2 = word[2];
			        		String o3 = word[3];
			        		String o4 = word[4];
			        		String ans = word[5];
			        	
			        	textField_1.setText(que);
			        	textField_2.setText(o1);
			        	textField_3.setText(o2);
			        	textField_4.setText(o3);
			        	textField_5.setText(o4);
			        	
			        	break;
			        	
			        	}
			        	
			        }
			        
			    }
			sc.close();
		
			//adminCollection.printAdminCollection();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	boolean checkans()
	{
		if(textField.getText()==ans)
		{
			boolean var = true;
		}
		return true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnNewButton) {
           

			if (checkans()) {
                res++;
            }
            x=0;
            
            if (rep==count) {
            	btnNewButton.setEnabled(false);
            	btnNewButton_1.setVisible(true);
            	btnNewButton_1.setEnabled(true);
            	btnNewButton_1.setText("Result");

            }
            setdata();
            }

        
        if (e.getActionCommand().equalsIgnoreCase("Result")) {
            

        	JOptionPane.showMessageDialog(null, "You got :"+res+"marks." ,"Finished!!" , JOptionPane.INFORMATION_MESSAGE);
        	
        }
        frame.dispose();
    	StudentPortal sp = new StudentPortal();
    	sp.frame.setVisible(true);
		
	}

	


	
		
	}
