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
import java.awt.TextArea;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchAdmin extends JFrame {
	private Admin admin;
    private ArrayList<Admin> adminal;
    private AdminCollection adminCollection;
	

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchAdmin window = new SearchAdmin();
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
	public SearchAdmin() {
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
		
		JLabel lblFacultyId = new JLabel("Admin ID:");
		lblFacultyId.setFont(new Font("Arial", Font.BOLD, 12));
		lblFacultyId.setBounds(204, 17, 85, 21);
		panel_2.add(lblFacultyId);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(299, 15, 138, 25);
		panel_2.add(textField);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 60, 576, 342);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1_2_1_1 = new JButton("Search o-");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean found =false;
				File file = new File("src/Admdetails.txt");
				
				
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
					        String gender = word[4];
					        String pass = word[5];
					        
					        if (line.contains(textField.getText())) {
					        	//textArea.setText(line);
					        	
					        	admin = new Admin(name,id,email,phn,gender,pass);
					        	found = true;
					        	 textArea.append("Name: " + admin.getName() + "\n" + "ID :" +admin.getId() + "\n" +
											"Gender :" + admin.getGender() + "\n" + "Email :" + admin.getEmail() + "\n" + 
											"Phone Number :" + admin.getPhn() + "\n" + "Password :" + admin.getPass() + "\n ____________________________________________");
			
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
				
				
				
				
				
				/*File file = new File("src/Admdetails.txt");
				
					textArea.setText(null);
				AdminCollection ac= new AdminCollection();
				
				adminal = ac.getAdminCollection();
				
				Iterator<Admin> itr = adminal.iterator();
                boolean found = false;
                
                while(itr.hasNext()) {
                    admin = (Admin)itr.next();

                    String id = textField.getText();
                    if(admin.getId().equalsIgnoreCase(id)){
                        textArea.append("Name: " + admin.getName() + "\n" + "ID :" +admin.getId() + "\n" +
        						"Gender :" + admin.getGender() + "\n" + "Email :" + admin.getEmail() + "\n" + 
        						"Phone Number :" + admin.getPhn() + "\n" + "Password :" + admin.getPass() + "\n \n--------------------------------------------------" + "\n\n");
                        found = true;
                        break;
                    }
                }

                if(!found){
                	JOptionPane.showMessageDialog(null, "Try Again." ,"Not Found!!" , JOptionPane.CLOSED_OPTION);
                }
				
				
				/*File file = new File("src/Admdetails.txt");
				try {
					Scanner sc =  new Scanner(file);
					while(sc.hasNextLine())
					{
						String line = sc.nextLine();
						
						if(line.startsWith(textField.getText()))
						{

							textArea.append(sc.next()+"\n"+sc.next());
						}
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
			}
		});
		btnNewButton_1_2_1_1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		btnNewButton_1_2_1_1.setBorderPainted(false);
		btnNewButton_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1_1.setBounds(447, 17, 94, 21);
		panel_2.add(btnNewButton_1_2_1_1);
		
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
		
		
		
		
	}
	public static void splitString(String str)
	{
		String s[]= str.split("  ");
	}
}
