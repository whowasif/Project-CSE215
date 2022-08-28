package StudentPortal;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam extends JFrame{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exam window = new Exam();
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
	public Exam() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Instruction");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 25, 122, 17);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				StudentPortal sp = new StudentPortal();
				sp.frame.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBounds(650, 25, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JTextArea txtrDuringTheExam = new JTextArea();
		txtrDuringTheExam.setFont(new Font("Arial", Font.BOLD, 13));
		txtrDuringTheExam.setText("\r\nDuring The Exam:\r\n\r\n1. You must use a functioning webcam and microphone.\r\n2. No cell phones or other secondary devices in the room or test area.\r\n3. Your desk/table must be clear or any materials except your test-taking device.\r\n4. No one else can be in the room with you.\r\n5. No talking. \r\n6. The testing room must be well-lit and you must be clearly visible.\r\n7. No dual screens/monitors.\r\n8. Do not leave the camera. \r\n9. No use of additional applications or internet.\r\n\r\nNumber Of Questions: 10\r\nExam Duration: 10 min.\r\nAll The Best!!!");
		txtrDuringTheExam.setBounds(64, 126, 660, 260);
		panel.add(txtrDuringTheExam);
		
		JButton btnNewButton = new JButton("Start Exam");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				Quiz qe = new Quiz();
				qe.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(324, 412, 119, 23);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnNewButton);
		
	
	}
}
