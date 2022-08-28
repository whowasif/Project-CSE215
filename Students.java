package courseAndOthers;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminAdmin.Admin;
import AdminStudent.Student;
import AdminStudent.StudentCollection;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Students extends JFrame {


	private Student student;
	public JFrame frame;
	private JTextField textField;
	private ArrayList<Admin> studental;
    private StudentCollection studentCollection;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grades window = new Grades();
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
	public Students() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JLabel lblNewLabel = new JLabel("Here is Your Students Info.");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(197, 10, 377, 30);
		panel_2.add(lblNewLabel);
		
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
		btnNewButton_1_2_1.setBounds(10, 16, 94, 21);
		panel_2.add(btnNewButton_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 60, 576, 393);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	
		
		File file = new File("src/studetails.txt");
		
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			 while (sc.hasNext()) {
			        String line = sc.nextLine();
			        String[] word = line.split("  ");
			        
			        String name = word[0];
			        String id = word[1];
			        String email = word[2];
			        String phn = word[3];
			        String institute = word[4];
			        String gender = word[5];
			        String pass = word[6];
			        
			        
			        	
			        	student = new Student(name,id,email,phn,institute,gender,pass);
			        	
			        	 textArea.append( "Name: " + student.getName() + "\n" + "ID :" +student.getId() + "\n" +
									"Gender :" + student.getGender() + "\n" + "Email :" + student.getEmail() + "\n" + 
									"Phone Number :" + student.getPhn() + "\n" + "Institute :" + student.getInstitute() + "\n" + "\n ____________________________________________\n");
	
			        
			        
			    }
			 
			//adminCollection.printAdminCollection();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}