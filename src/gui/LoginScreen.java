package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JPasswordField;


public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtEnterPasswordHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(61, 166, 143, 29);
		contentPane.add(btnExit);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(236, 166, 143, 29);
		contentPane.add(btnLogIn);
		btnLogIn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				CalendarView frame = new CalendarView();
				frame.setVisible(true);
			}
		});
		
		txtUsername = new JTextField();
		txtUsername.setText("Enter username here...");
		txtUsername.setBounds(190, 85, 189, 28);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(61, 91, 117, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(61, 119, 117, 16);
		contentPane.add(lblPassword);
		
		txtEnterPasswordHere = new JPasswordField();
		txtEnterPasswordHere.setText("12345678");
		txtEnterPasswordHere.setColumns(10);
		txtEnterPasswordHere.setBounds(190, 113, 189, 28);
		contentPane.add(txtEnterPasswordHere);
		
		JLabel lblDkCalendar = new JLabel("DØK CALENDAR");
		lblDkCalendar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDkCalendar.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblDkCalendar.setBounds(61, 16, 318, 47);
		contentPane.add(lblDkCalendar);
	}
}

