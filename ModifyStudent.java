package AdminStudent;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminAdmin.Admin;
import AdminAdmin.AdminModify;
import AdminAdmin.AdminSettings;
import AdminCourse.CourseModify;
import Adminfaculty.Faculty;
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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class ModifyStudent extends JFrame {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	private Student student = null;
	private StudentCollection studentCollection = new StudentCollection();
	
	String line,line1;
	boolean del = false;
	boolean del1 = false;
	private JTextField textField_6;
	private JTextField textField_7;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyStudent window = new ModifyStudent();
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
	public ModifyStudent() {
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
		
		JButton btnNewButton = new JButton("Students Section");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.setBounds(10, 10, 170, 71);
		panel_1.add(btnNewButton);
		
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
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(201, 17, 85, 21);
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(296, 15, 138, 25);
		panel_2.add(textField);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Search o-");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean found =false;
				File file = new File("src/Studetails.txt");
				
				
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
					        String institute = word[4];
					        String gender = word[5];
					        String pass = word[6];
					        
					        if (line.contains(textField.getText())) {
					        	//textArea.setText(line);
					        	
					        	student = new Student(name,id,email,phn,institute,gender,pass);
					        	found = true;
					        	textField_1.setText(student.getName());
					        	textField_2.setText(student.getId());
					        	textField_3.setText(student.getEmail());
					        	textField_4.setText(student.getPhn());
					        	textField_7.setText(student.getGender());
					        	textField_6.setText(student.getPass());
					        	
					        	
					        	
					        	 
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
					File file1 = new File("src/StudentIdPass.txt");
					Scanner sc1 = new Scanner(file1);
					
					while(sc1.hasNext()) {
				        line1 = sc1.nextLine();	
				        if(line1.contains(textField.getText()))
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
		btnNewButton_1_2_1_1.setBounds(444, 17, 94, 21);
		panel_2.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_2 = new JButton("←GO BACK");
		btnNewButton_1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentModify sm = new StudentModify();
				sm.frame.setVisible(true);
			}
		});
		btnNewButton_1_2_1_2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_2.setBorderPainted(false);
		btnNewButton_1_2_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_2.setBounds(652, 432, 124, 21);
		panel.add(btnNewButton_1_2_1_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(291, 97, 203, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(291, 127, 110, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(291, 156, 203, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(291, 188, 203, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(291, 217, 203, 19);
		panel.add(textField_5);
		
		JLabel Passwordfield00 = new JLabel("Password :");
		Passwordfield00.setFont(new Font("Arial", Font.PLAIN, 10));
		Passwordfield00.setBounds(200, 245, 83, 20);
		panel.add(Passwordfield00);
		
		JLabel INSname = new JLabel("Institute Name :");
		INSname.setFont(new Font("Arial", Font.PLAIN, 10));
		INSname.setBounds(196, 216, 83, 20);
		panel.add(INSname);
		
		JLabel PhoneNumberfield22 = new JLabel("Phone Number :");
		PhoneNumberfield22.setFont(new Font("Arial", Font.PLAIN, 10));
		PhoneNumberfield22.setBounds(196, 186, 83, 20);
		panel.add(PhoneNumberfield22);
		
		JLabel Emailfield22 = new JLabel("Email :");
		Emailfield22.setFont(new Font("Arial", Font.PLAIN, 10));
		Emailfield22.setBounds(196, 156, 83, 20);
		panel.add(Emailfield22);
		
		JLabel lblStudentId = new JLabel("Student ID :");
		lblStudentId.setFont(new Font("Arial", Font.PLAIN, 10));
		lblStudentId.setBounds(196, 126, 83, 20);
		panel.add(lblStudentId);
		
		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setFont(new Font("Arial", Font.PLAIN, 10));
		lblFullName.setBounds(196, 96, 83, 20);
		panel.add(lblFullName);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Modify & Save");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField_1.getText();
		        String id = textField_2.getText();
		        String email =textField_3.getText();
		        String phn = textField_4.getText();
		        String institute = textField_5.getText();
		        String gender = textField_7.getText();
		        String pass = textField_6.getText();
		        
		        student = new Student(name,id,email,phn,institute,gender,pass);
		        
		        try {
					removeLine(line);
					removeLine1(line1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
				studentCollection.printinfile(student);	
				
				File file = new File("src/StudentIdPass.txt");
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
				JOptionPane.showMessageDialog(null, "Student Info Modified." ,"Successfull" , JOptionPane.CLOSED_OPTION);
			}
		});
		btnNewButton_1_2_1_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1_1.setBounds(363, 432, 126, 21);
		panel.add(btnNewButton_1_2_1_1_1);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 10));
		lblGender.setBounds(200, 280, 60, 20);
		panel.add(lblGender);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(504, 97, 272, 308);
		panel.add(scrollPane);
		
		JLabel lblNewLabel_2 = new JLabel("Grades And Marks");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setBounds(587, 60, 138, 27);
		panel.add(lblNewLabel_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(291, 246, 203, 19);
		panel.add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.setBounds(405, 281, 85, 21);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"male", "female"}));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(291, 280, 76, 19);
		panel.add(textField_7);
	}
	public void removeLine(String lineContent) throws IOException
	{
	    File file = new File("src/Studetails.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	    del = true;
	}
	
	public void removeLine1(String lineContent) throws IOException
	{
	    File file = new File("src/StudentIdPass.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	    del = true;
	    
	    
	}
}
