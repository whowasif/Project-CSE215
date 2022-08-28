package courseAndOthers;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import MCQ_QUESTION.MCQ_QUESTION;

import Login.FacultyLogin;
import Make_announcement.Announcement;

public class CourseAndOthers extends JFrame implements ActionListener{
	
	JButton sendMsg = new JButton("Send Massage Or Make Announcement");
	JButton takeExam = new JButton("Set Question");
	JButton logoutbtn = new JButton("Log Out");
	
	

	public JFrame frame = new JFrame();
	
	public CourseAndOthers()
	{
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		
		
		
		panel_2.setBorder(new LineBorder(new Color(175, 220, 235), 2, true));		//UPPER PANEL
		panel_2.setBackground(new Color(175, 220, 235));
		panel_2.setBounds(0, 0, 785, 50);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		

		panel_1.setBackground(new Color(202, 233, 245));
		panel_1.setBorder(new LineBorder(new Color(202, 233, 245), 2, true));		//LEFT PANEL
		panel_1.setBounds(0,50,190,413);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		panel.setBackground(new Color(240, 248, 255));
		panel.setBorder(new LineBorder(new Color(240, 248, 255), 2, true));			//WHOLE PANEL
		panel.setBounds(0, 0, 485, 282);
		frame.getContentPane().add(panel);
		panel.setLayout(null);		
		JButton Students =new JButton("Students");
		Students.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Students st = new Students();
				st.frame.setVisible(true);
				
				
				
				
			}
		});
		panel.add(Students);
		
		
		
		Students.setBounds(200,168,400,60);
		Students.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		Students.setBorderPainted(false);
		Students.setBackground(new Color(202, 233, 245));
		Students.setFocusable(false);
		
		takeExam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MCQ_QUESTION mq = new MCQ_QUESTION();
				mq.frame.setVisible(true);
				
			}
		});
		panel.add(takeExam);
		

		
		logoutbtn.setBackground(Color.LIGHT_GRAY);
		logoutbtn.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		logoutbtn.setBounds(686, 11, 89, 23);
		logoutbtn.addActionListener(this);
		panel_2.add(logoutbtn);
		
		
		
		takeExam.setBounds(200,271,400,60);
		takeExam.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		takeExam.setBorderPainted(false);
		takeExam.setBackground(new Color(202, 233, 245));
		takeExam.setFocusable(false);
		takeExam.addActionListener(this);
		JButton grades = new JButton("Grades");
		grades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Grades g = new Grades();
				g.frame.setVisible(true);
			}
		});
		panel.add(grades);
		
		

		grades.setBounds(200,372,400,60);
		grades.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		grades.setBorderPainted(false);
		grades.setBackground(new Color(202, 233, 245));
		grades.setFocusable(false);
		
		 	
		 	panel.add(sendMsg);
		 	
		 	
		 	sendMsg.setBounds(200,61,400,60);
		 	sendMsg.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		 	sendMsg.setBorderPainted(false);
		 	sendMsg.setBackground(new Color(202, 233, 245));
		 	sendMsg.setFocusable(false);
		 	sendMsg.addActionListener(this);
		
		
		
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setTitle("Faculty Portal");
		frame.setBackground(Color.CYAN);
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		

		
		
	}

	

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sendMsg)
		{
		frame.dispose();
		Announcement ann =  new Announcement();
		ann.frame.setVisible(true);
			
		}
		
		if(e.getSource()==logoutbtn)
		{
		
			frame.dispose();
			FacultyLogin fl = new FacultyLogin();
			fl.frame.setVisible(true);
		}
		
	}
}



