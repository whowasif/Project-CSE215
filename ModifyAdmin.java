package AdminAdmin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminCourse.CourseModify;
import AdminStudent.StudentModify;
import Adminfaculty.FacultyModify;
import Login.AdminLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class ModifyAdmin extends JFrame {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private Admin admin = null;
	private AdminCollection adminCollection = new AdminCollection();

	String line,line1;
	boolean del = false;
	boolean del1 = false;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyAdmin window = new ModifyAdmin();
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
	public ModifyAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("Admin");
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
		
		JButton btnAdminSection = new JButton("Admin Section");
		btnAdminSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdminSection.setBorderPainted(false);
		btnAdminSection.setBackground(new Color(135, 206, 235));
		btnAdminSection.setBounds(10, 172, 170, 71);
		panel_1.add(btnAdminSection);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(175, 220, 235), 2, true));		//UPPER PANEL
		panel_2.setBackground(new Color(175, 220, 235));
		panel_2.setBounds(0, 0, 785, 50);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1_2_1 = new JButton("←Log Out");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminLogin al = new AdminLogin();
				al.frame.setVisible(true);
				
				
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1.setBorderPainted(false);
		btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1.setBounds(681, 19, 94, 21);
		panel_2.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Options↓");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(65, 27, 68, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblFacultyId_1 = new JLabel("Faculty ID:");
		lblFacultyId_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblFacultyId_1.setBounds(201, 21, 85, 21);
		panel_2.add(lblFacultyId_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(296, 19, 138, 25);
		panel_2.add(textField_4);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Search o-");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean found =false;
				File file = new File("src/Admdetails.txt");
				
				
				Scanner sc;
				try {
					sc = new Scanner(file);
					 while (sc.hasNext()) {
					        line = sc.nextLine();
					        String[] word = line.split("  ");
					        
					        String name = word[0];
					        String id = word[1];
					        String email = word[2];
					        String phn = word[3];
					        String gender = word[4];
					        String pass = word[5];
					        
					        if (line.contains(textField_4.getText())) {
					        	//textArea.setText(line);
					        	
					        	admin = new Admin(name,id,email,phn,gender,pass);
					        	found = true;
					        	textField.setText(admin.getName());
					        	textField_1.setText(admin.getId());
					        	textField_2.setText(admin.getEmail());
					        	textField_3.setText(admin.getPhn());
					        	textField_5.setText(admin.getGender());
					        	textField_6.setText(admin.getPass());
					        	
					        	
					        	
					        	 
					        	break;
					        }
					        
					    }
					 if(!found)
					 {
						 JOptionPane.showMessageDialog(null, "Try Again." ,"Not Found!!" , JOptionPane.CLOSED_OPTION);
					 }
				
					//adminCollection.printAdminCollection();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					File file1 = new File("src/AdminIdPass.txt");
					Scanner sc1 = new Scanner(file1);
					
					while(sc1.hasNext()) {
				        line1 = sc1.nextLine();	
				        if(line1.contains(textField_4.getText()))
				        {
				        	break;
				        }
				        
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1.setBounds(444, 21, 94, 21);
		panel_2.add(btnNewButton_1_2_1_1);
		
		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setFont(new Font("Arial", Font.PLAIN, 10));
		lblFullName.setBounds(200, 81, 83, 20);
		panel.add(lblFullName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(295, 82, 203, 19);
		panel.add(textField);
		
		JLabel lblFacultyId = new JLabel("Faculty ID :");
		lblFacultyId.setFont(new Font("Arial", Font.PLAIN, 10));
		lblFacultyId.setBounds(200, 111, 83, 20);
		panel.add(lblFacultyId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(295, 112, 110, 19);
		panel.add(textField_1);
		
		JLabel Emailfield22 = new JLabel("Email :");
		Emailfield22.setFont(new Font("Arial", Font.PLAIN, 10));
		Emailfield22.setBounds(200, 141, 83, 20);
		panel.add(Emailfield22);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(295, 141, 203, 19);
		panel.add(textField_2);
		
		JLabel PhoneNumberfield22 = new JLabel("Phone Number :");
		PhoneNumberfield22.setFont(new Font("Arial", Font.PLAIN, 10));
		PhoneNumberfield22.setBounds(200, 171, 83, 20);
		panel.add(PhoneNumberfield22);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(295, 173, 203, 19);
		panel.add(textField_3);
		
		JLabel Passwordfield00 = new JLabel("Password :");
		Passwordfield00.setFont(new Font("Arial", Font.PLAIN, 10));
		Passwordfield00.setBounds(200, 201, 83, 20);
		panel.add(Passwordfield00);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 10));
		lblGender.setBounds(200, 231, 60, 20);
		panel.add(lblGender);
		
		JButton btnNewButton_1_2_1_2 = new JButton("←GO BACK");
		btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminModify am = new AdminModify();
				am.frame.setVisible(true);
			}
		});
		btnNewButton_1_2_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_2.setBorderPainted(false);
		btnNewButton_1_2_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_2.setBounds(652, 432, 124, 21);
		panel.add(btnNewButton_1_2_1_2);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Modify & Save");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
		        String id = textField_1.getText();
		        String email =textField_2.getText();
		        String phn = textField_3.getText();
		        String gender = textField_5.getText();
		        String pass = textField_6.getText();
		        
		        admin = new Admin(name,id,email,phn,gender,pass);
		        
		        try {
					removeLine(line);
					removeLine1(line1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
				adminCollection.printinfile(admin);	
				File file = new File("src/AdminIdPass.txt");
				try {
					FileWriter fw = new FileWriter(file,true);
					
					fw.write(id);
					fw.write("  ");
					fw.write(pass);
					fw.write("\n");
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				JOptionPane.showMessageDialog(null, "Admin Info Modified." ,"Successfull" , JOptionPane.CLOSED_OPTION);
				
			}
		});
		btnNewButton_1_2_1_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1_1.setBounds(337, 432, 126, 21);
		panel.add(btnNewButton_1_2_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(295, 231, 76, 19);
		panel.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.setBounds(409, 232, 85, 21);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"male", "female"}));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(295, 202, 203, 19);
		panel.add(textField_6);
		/*
		JScrollPane jsp = new JScrollPane(panel_1,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.add(jsp);*/
	}
	public void removeLine(String lineContent) throws IOException
	{
	    File file = new File("src/Admdetails.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	    del = true;
	    
	    
	}
	public void removeLine1(String lineContent) throws IOException
	{
	    File file = new File("src/AdminIdPass.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	    
	    
	    
	}
}
