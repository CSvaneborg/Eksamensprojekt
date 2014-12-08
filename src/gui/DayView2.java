package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class DayView2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayView2 frame = new DayView2();			
			        frame.pack();
					frame.setSize(1000,750);
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
	public DayView2() {
		
		String whichDayIsIt = "default";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1500);	
		contentPane = new JPanel();
		contentPane.setBackground(Color.lightGray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblDkCalendar = new JLabel("DØK CALENDAR");
		lblDkCalendar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDkCalendar.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblDkCalendar.setBounds(75, 10, 750, 50);
		contentPane.add(lblDkCalendar);
		
		JLabel lblTime = new JLabel(whichDayIsIt);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTime.setBounds(0, 76, 500, 20);
		contentPane.add(lblTime);
		
		JTextArea txtrTimeToStart = new JTextArea();
		txtrTimeToStart.setText("Start: 08:00\nEnd: 09:00 ");
		txtrTimeToStart.setBounds(30, 108, 90, 32);
		contentPane.add(txtrTimeToStart);
		
		JTextArea txtrHvadFandenSkal = new JTextArea();
		txtrHvadFandenSkal.setText("Hvad fanden skal der ske!?");
		txtrHvadFandenSkal.setBounds(175, 108, 600, 32);
		contentPane.add(txtrHvadFandenSkal);
		
	
	
	}
}
