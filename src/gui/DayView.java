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

import logic.Controller;

public class DayView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayView frame = new DayView();			
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
	 * @throws Exception 
	 */
	public DayView() throws Exception {
		
		String whichDayIsIt = "default";
		//Test af hvordan det vil se ud med specifik dag.
		whichDayIsIt= "Monday";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 600);	
		contentPane = new JPanel();
		contentPane.setBackground(Color.lightGray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblDkCalendar = new JLabel("DØK CALENDAR");
		lblDkCalendar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDkCalendar.setFont(new Font("Lucida Grande", Font.BOLD, 30));
		lblDkCalendar.setBounds(75, 10, 550, 50);
		contentPane.add(lblDkCalendar);
		
		JLabel lblTime = new JLabel(whichDayIsIt);
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTime.setBounds(0, 76, 650, 20);
		contentPane.add(lblTime);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setText(Controller.getCBSCalendar());
		textArea.setBounds(35, 108, 509, 289);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea(Controller.getWeather());
		textArea_1.setLineWrap(true);
		textArea_1.setBounds(35, 423, 509, 37);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea(Controller.getQOTD());
		textArea_2.setLineWrap(true);
		textArea_2.setBounds(35, 482, 509, 90);
		contentPane.add(textArea_2);
		
	}
}
