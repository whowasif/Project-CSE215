package Login;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Admin.AdminHomePage;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class FacultyLogin {
	
Random random = new Random();
	
	int r1 = random.nextInt(20);
	int r2= random.nextInt(20);
	int add= r1+r2;
	Scanner x= new Scanner(System.in);
	boolean found =false;
	String username;
	String password;

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacultyLogin window = new FacultyLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FacultyLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("Log In");
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
		
		JButton btnNewButton_1_2_1 = new JButton("←Go Back");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginPage lp = new LoginPage();
				lp.frame.setVisible(true);
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1.setBounds(10, 19, 94, 21);
		panel_2.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel = new JLabel("Faculty ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(200, 157, 107, 20);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(200, 203, 107, 20);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(274, 159, 129, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fill Up :\r\n");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(200, 99, 129, 36);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(274, 205, 129, 19);
		panel.add(passwordField);
		
		JLabel lblCaptcha = new JLabel("Captcha :");
		lblCaptcha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCaptcha.setBounds(200, 245, 83, 20);
		panel.add(lblCaptcha);
		
		textField_1 = new JTextField();
		
		textField_1.setColumns(10);
		textField_1.setBounds(295, 246, 50, 19);
		panel.add(textField_1);
		textField_1.setText(r1+"+"+r2);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(358, 246, 50, 19);
		panel.add(res);
		
		JButton btnNewButton_1_2 = new JButton("Log In");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = textField.getText();
				String password = passwordField.getText();
				int result = Integer.parseInt(res.getText());
				if(add==result)
				{
					cheackID(userName,password);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Try Again", "Login Error", JOptionPane.ERROR_MESSAGE);
				textField.setText(null);
				passwordField.setText(null);
				res.setText(null);
				
				
				}
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(371, 292, 94, 21);
		panel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("=");
		lblNewLabel_1_1.setBounds(348, 249, 45, 13);
		panel.add(lblNewLabel_1_1);
	}
	public void cheackID(String username, String password)
	{
		
		File f =new File("src/FacultyIdPass.txt");
		
		String Tuser;
		String Tpass;
		
		try
		{
		   x =new Scanner(f);
		 
		 
		   
		   while(x.hasNextLine() && !found)
		   {
			   Tuser=x.next();
			   Tpass=x.next();
			   
			   
			   if(Tuser.equals(username) && Tpass.equals(password))
			   {
				   found = true;
				   frame.dispose();
				  /* AdminHomePage ahp = new AdminHomePage();
					ahp.frame.setVisible(true);
					*/
					break;
					
			   }
			    
			   
			   
		 }
		   if(found==false)
		   {
			   JOptionPane.showMessageDialog(null, "Invalid User Name or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
			   
		   }
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
