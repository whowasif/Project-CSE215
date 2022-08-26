package AdminStudent;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AdminAdmin.AdminModify;
import AdminAdmin.AdminSettings;
import AdminCourse.CourseModify;
import Adminfaculty.FacultyModify;
import Login.AdminLogin;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentModify extends JFrame {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentModify window = new StudentModify();
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
	public StudentModify() {
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
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AdminSettings as= new AdminSettings();
				as.frame.setVisible(true);
			
			}
		});
		btnSettings.setBorderPainted(false);
		btnSettings.setBackground(new Color(176, 224, 230));
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
		btnFacultiesSection_1.setBorderPainted(false);
		btnFacultiesSection_1.setBackground(new Color(176, 224, 230));
		btnFacultiesSection_1.setBounds(10, 253, 170, 71);
		panel_1.add(btnFacultiesSection_1);
		
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
		
		JButton btnNewButton_1 = new JButton("Add Student\r\n\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AddStudent as= new AddStudent();
				as.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(204, 255, 255));
		btnNewButton_1.setBounds(200, 60, 135, 75);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Modify Student\r\n\r\n");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ModifyStudent ms = new ModifyStudent();
				ms.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBackground(new Color(204, 255, 255));
		btnNewButton_1_1.setBounds(345, 60, 137, 75);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Remove Student\r\n\r\n");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				RemoveStudent rs = new RemoveStudent();
				rs.frame.setVisible(true);
			}
		});
		btnNewButton_1_2.setBorderPainted(false);
		btnNewButton_1_2.setBackground(new Color(204, 255, 255));
		btnNewButton_1_2.setBounds(492, 60, 139, 75);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Search Student\r\n\r\n");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				SearchStudent ss = new SearchStudent();
				ss.frame.setVisible(true);
			}
		});
		btnNewButton_1_3.setBorderPainted(false);
		btnNewButton_1_3.setBackground(new Color(204, 255, 255));
		btnNewButton_1_3.setBounds(641, 60, 135, 75);
		panel.add(btnNewButton_1_3);
	}
}
