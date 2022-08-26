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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
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

public class RemoveAdmin extends JFrame {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private Admin admin = null;
	private AdminCollection adminCollection = new AdminCollection();
	
	String[] word;
	String line;
	boolean del = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveAdmin window = new RemoveAdmin();
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
	public RemoveAdmin() {
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
		
		JLabel lblFacultyId_1 = new JLabel("Admin ID:");
		lblFacultyId_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblFacultyId_1.setBounds(200, 21, 85, 21);
		panel_2.add(lblFacultyId_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(295, 19, 138, 25);
		panel_2.add(textField_2);
		
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
					        word = line.split("  ");
					        
					        String name = word[0];
					        String id = word[1];
					        String email = word[2];
					        String phn = word[3];
					        String gender = word[4];
					        String pass = word[5];
					        
					        if (line.contains(textField_2.getText())) {
					        	//textArea.setText(line);
					        	
					        	admin = new Admin(name,id,email,phn,gender,pass);
					        	found = true;
					        	textField.setText(admin.getName());
					        	textField_1.setText(admin.getId());
					        	
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
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1.setBounds(443, 21, 94, 21);
		panel_2.add(btnNewButton_1_2_1_1);
		
		JLabel lblFullName = new JLabel("Full Name :");
		lblFullName.setFont(new Font("Arial", Font.PLAIN, 10));
		lblFullName.setBounds(200, 81, 83, 20);
		panel.add(lblFullName);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(295, 82, 203, 19);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(295, 112, 110, 19);
		panel.add(textField_1);
		
		JLabel lblFacultyId = new JLabel("ID :");
		lblFacultyId.setFont(new Font("Arial", Font.PLAIN, 10));
		lblFacultyId.setBounds(200, 111, 83, 20);
		panel.add(lblFacultyId);
		
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
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("Remove");
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {
					removeLine(line);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 if(del==true)
				 {
					 JOptionPane.showMessageDialog(null, "Admin is Removed." ,"Success!!" , JOptionPane.CLOSED_OPTION);
					 textField.setText(null);
					 textField_1.setText(null);
					 textField_2.setText(null);
				 }
			}
		});
		btnNewButton_1_2_1_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1_1.setBounds(337, 432, 126, 21);
		panel.add(btnNewButton_1_2_1_1_1);
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
}
