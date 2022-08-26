package AdminStudent;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminAdmin.Admin;
import AdminAdmin.AdminCollection;
import AdminAdmin.AdminModify;
import AdminAdmin.AdminSettings;
import AdminCourse.CourseModify;
import Adminfaculty.FacultyModify;
import Login.AdminLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class AddStudent extends JFrame implements Serializable {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField_5;

	private Student student = null;
	private StudentCollection studentCollection = new StudentCollection();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
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
	public AddStudent() {
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
		
		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setFont(new Font("Arial", Font.PLAIN, 10));
		lblFullName.setBounds(200, 96, 83, 20);
		panel.add(lblFullName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(295, 97, 203, 19);
		panel.add(textField);
		
		JLabel lblStudentId = new JLabel("Student ID :");
		lblStudentId.setFont(new Font("Arial", Font.PLAIN, 10));
		lblStudentId.setBounds(200, 126, 83, 20);
		panel.add(lblStudentId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(295, 127, 110, 19);
		panel.add(textField_1);
		
		JLabel Emailfield22 = new JLabel("Email :");
		Emailfield22.setFont(new Font("Arial", Font.PLAIN, 10));
		Emailfield22.setBounds(200, 156, 83, 20);
		panel.add(Emailfield22);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(295, 156, 203, 19);
		panel.add(textField_2);
		
		JLabel PhoneNumberfield22 = new JLabel("Phone Number :");
		PhoneNumberfield22.setFont(new Font("Arial", Font.PLAIN, 10));
		PhoneNumberfield22.setBounds(200, 186, 83, 20);
		panel.add(PhoneNumberfield22);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(295, 188, 203, 19);
		panel.add(textField_3);
		
		JLabel INSname = new JLabel("Institute Name :");
		INSname.setFont(new Font("Arial", Font.PLAIN, 10));
		INSname.setBounds(200, 216, 83, 20);
		panel.add(INSname);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(295, 217, 203, 19);
		panel.add(textField_4);
		
		JLabel Passwordfield00 = new JLabel("Password :");
		Passwordfield00.setFont(new Font("Arial", Font.PLAIN, 10));
		Passwordfield00.setBounds(204, 245, 83, 20);
		panel.add(Passwordfield00);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(295, 246, 203, 19);
		panel.add(passwordField);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Arial", Font.PLAIN, 10));
		lblGender.setBounds(204, 280, 60, 20);
		panel.add(lblGender);
		
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
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("ADD");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String id = textField_1.getText();
				String email = textField_2.getText();
				String phn = textField_3.getText();
				String institute = textField_4.getText();
				String gender = textField_5.getText();
				String pass = passwordField.getText();
				
				student = new Student(name,id,email,phn,institute,gender,pass);
				studentCollection.addstudent(student);
				 
				studentCollection.printinfile(student);	
				
				File file = new File("src/StudentIdPass.txt");
				try {
					FileWriter fw = new FileWriter(file);
					
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
					passwordField.setText(null);
					JOptionPane.showMessageDialog(null, "Student Info Added." ,"Successfull" , JOptionPane.CLOSED_OPTION);
				
				
			}
		});
		btnNewButton_1_2_1_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1_1.setBounds(352, 432, 126, 21);
		panel.add(btnNewButton_1_2_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(295, 281, 76, 19);
		panel.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(null);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setBounds(413, 280, 85, 21);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"male", "female"}));
		
	}
}
