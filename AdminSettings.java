package AdminAdmin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminCourse.CourseModify;
import AdminStudent.StudentModify;
import Adminfaculty.Faculty;
import Adminfaculty.FacultyCollection;
import Adminfaculty.FacultyModify;
import Login.AdminLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
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

public class AdminSettings extends JFrame {

	public JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	private Faculty faculty = null;
	private FacultyCollection facultyCollection = new FacultyCollection();
	
	boolean del = false;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSettings window = new AdminSettings();
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
	public AdminSettings() {
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				StudentModify sm = new StudentModify();
				sm.frame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(10, 10, 170, 71);
		panel_1.add(btnNewButton);
		
		JButton btnFacultiesSection = new JButton("Faculties Section");
		btnFacultiesSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FacultyModify fm = new FacultyModify();
				fm.frame.setVisible(true);
			}
		});
		btnFacultiesSection.setBorderPainted(false);
		btnFacultiesSection.setBackground(new Color(176, 224, 230));
		btnFacultiesSection.setBounds(10, 91, 170, 71);
		panel_1.add(btnFacultiesSection);
		
		JButton btnAdminSection = new JButton("Admin Section");
		btnAdminSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminModify af = new AdminModify();
				af.frame.setVisible(true);
			
			}
		});
		btnAdminSection.setBorderPainted(false);
		btnAdminSection.setBackground(new Color(176, 224, 230));
		btnAdminSection.setBounds(10, 172, 170, 71);
		panel_1.add(btnAdminSection);
		
		JButton btnSettings = new JButton("Change Password");
		btnSettings.setBorderPainted(false);
		btnSettings.setBackground(new Color(135, 206, 235));
		btnSettings.setBounds(10, 334, 170, 69);
		panel_1.add(btnSettings);
		
		JButton btnFacultiesSection_1 = new JButton("Course Section");
		btnFacultiesSection_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				CourseModify cm = new CourseModify();
				cm.frame.setVisible(true);
			}
		});
		btnFacultiesSection_1.setBounds(10, 253, 170, 71);
		panel_1.add(btnFacultiesSection_1);
		btnFacultiesSection_1.setBorderPainted(false);
		btnFacultiesSection_1.setBackground(new Color(176, 224, 230));
		
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
		
		JLabel lblNewLabel = new JLabel("Old Password :");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(200, 183, 111, 26);
		panel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(309, 187, 160, 22);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(309, 235, 160, 22);
		panel.add(passwordField_1);
		
		JLabel lblNewPassword = new JLabel("New Password :");
		lblNewPassword.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewPassword.setBounds(200, 232, 111, 26);
		panel.add(lblNewPassword);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Save");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String oldpass = passwordField.getText();
			String newpass = passwordField_1.getText();
			
			checkpass(oldpass,newpass);
			passwordField.setText(null);
			passwordField_1.setText(null);
			
			}
			
			
		});
		btnNewButton_1_2_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1.setBounds(419, 291, 94, 21);
		panel.add(btnNewButton_1_2_1_1);
		/*
		JScrollPane jsp = new JScrollPane(panel_1,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.add(jsp);*/
	}

	public static void checkpass(String oldpass, String newpass) {
		// TODO Auto-generated method stub
		
		Faculty faculty = null;
		FacultyCollection facultyCollection = new FacultyCollection();
		boolean found =false;
		String line = null,line1 = null;
		File file = new File("src/Admdetails.txt");
		String[] word = null;
		
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
			        
			        if (line.contains(oldpass)) {
			        	//textArea.setText(line);
			        	
			        	
			        	found = true;
			        
			 
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
		        if(line1.contains(oldpass))
		        {
		        	break;
		        }
			}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		writepass(line,line1,word,newpass);
		
	}

	private static void writepass(String line, String line1, String[] word, String newpass) {
		// TODO Auto-generated method stub
		

        String name = word[0];
        String id = word[1];
        String email = word[2];
        String phn = word[3];
        String gender = word[4];
        String pass = newpass;
        
        try {
			removeLine(line);
			removeLine1(line1);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        
       
        File file = new File("src/Admdetails.txt");
		try {
			FileWriter fw = new FileWriter(file,true);
			
			
			fw.write(name);
			fw.write("  ");
			fw.write(id);
			fw.write("  ");
			fw.write(email);
			fw.write("  ");
			fw.write(phn);
			fw.write("  ");
			fw.write(gender);
			fw.write("  ");
			fw.write(pass);
			fw.write("\n");
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        
        
        
        
        File file1 = new File("src/AdminIdPass.txt");
		try {
			FileWriter fw1 = new FileWriter(file1,true);
			
			fw1.write(id);
			fw1.write("  ");
			fw1.write(pass);
			fw1.write("\n");
			fw1.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		 JOptionPane.showMessageDialog(null, "Password Changed." ,"Successfull!!" , JOptionPane.CLOSED_OPTION);
		
		 
		 
		
	}
	public static void removeLine(String lineContent) throws IOException
	{
	    File file = new File("src/Admdetails.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	   
	}
	public static void removeLine1(String lineContent) throws IOException
	{
	    File file = new File("src/AdminIdPass.txt");
	    List<String> out = Files.lines(file.toPath())
	                        .filter(line -> !line.contains(lineContent))
	                        .collect(Collectors.toList());
	    Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
	    
	    
	}
}
