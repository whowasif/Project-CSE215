package StudentPortal;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Login.StudentLogin;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StudentPortal {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentPortal window = new StudentPortal();
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
	public StudentPortal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 786, 463);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 220, 235));
		panel_1.setBounds(0, 0, 786, 67);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Student Portal");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(87, 27, 161, 17);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(342, 30, 49, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
		lblNewLabel_3.setText(dformat.format(date));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(388, 31, 75, 14);
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent arg0) 
            {
            	int a = JOptionPane.showConfirmDialog(null,"Do you really want to Log Out!!","Select",JOptionPane.YES_NO_CANCEL_OPTION);
       		 
       	     if(a==0)
       	      {
       	    	frame.dispose();
				StudentLogin sl = new StudentLogin();
				sl.frame.setVisible(true);
       	      }  
            } 
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(687, 22, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome To SAW Exam App");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_4.setBounds(326, 95, 279, 24);
		panel.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(202, 233, 245));
		panel_2.setBounds(0, 67, 163, 396);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Announcement");
		btnNewButton_1.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent arg0) 
            
            {
            	frame.dispose();
            	Announcement ex = new Announcement();
            	ex.frame.setVisible(true);
            	
            }
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(192,192,192));
		btnNewButton_1.setBounds(367, 196, 151, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show Grade");
		btnNewButton_2.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent arg0) 
            {
                
            	frame.dispose();
            	Grades gr = new Grades();
            	gr.frame.setVisible(true); 
            }
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBackground(new Color(192,192,192));
		btnNewButton_2.setBounds(367, 290, 151, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exam");
		btnNewButton_3.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent arg0) 
            {
                
            	frame.dispose();
            	Exam ex = new Exam();
            	ex.frame.setVisible(true);
            }
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(192,192,192));
		btnNewButton_3.setBounds(367, 243, 151, 23);
		panel.add(btnNewButton_3);
	}
}
