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
	 */
	public DayView() {
		
		String whichDayIsIt = "default";
		//Test af hvordan det vil se ud med specifik dag.
		whichDayIsIt= "Monday";
		
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
		lblTime.setBounds(0, 76, 650, 20);
		contentPane.add(lblTime);
		
		JTextArea txtrEventTime1 = new JTextArea();
		txtrEventTime1.setText("Start: 08:00\nEnd: 09:00 ");
		txtrEventTime1.setBounds(30, 100, 90, 35);
		txtrEventTime1.setBackground(Color.lightGray);
		txtrEventTime1.setEditable(false);
		contentPane.add(txtrEventTime1);
		
		JTextArea txtrEventDescription1 = new JTextArea();
		txtrEventDescription1.setText("Hvad fanden skal der ske!?");
		txtrEventDescription1.setBounds(175, 100, 600, 35);
		txtrEventDescription1.setBackground(Color.lightGray);
		txtrEventDescription1.setEditable(false);
		contentPane.add(txtrEventDescription1);
	
		JTextArea txtrEventTime2 = new JTextArea();
		txtrEventTime2.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime2.setBounds(30, 140, 90, 35);
		txtrEventTime2.setBackground(Color.lightGray);
		txtrEventTime2.setEditable(false);
		contentPane.add(txtrEventTime2);
		
		JTextArea txtrEventDescription2 = new JTextArea();
		txtrEventDescription2.setText("Hvad fanden skal der ske!?");
		txtrEventDescription2.setBounds(175, 140, 600, 35);
		txtrEventDescription2.setBackground(Color.lightGray);
		txtrEventDescription2.setEditable(false);
		contentPane.add(txtrEventDescription2);	
		
		JTextArea txtrEventTime3 = new JTextArea();
		txtrEventTime3.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime3.setBounds(30, 180, 90, 35);
		txtrEventTime3.setBackground(Color.lightGray);
		txtrEventTime3.setEditable(false);
		contentPane.add(txtrEventTime3);
		
		JTextArea txtrEventDescription3 = new JTextArea();
		txtrEventDescription3.setText("Hvad fanden skal der ske!?");
		txtrEventDescription3.setBounds(175, 180, 600, 35);
		txtrEventDescription3.setBackground(Color.lightGray);
		txtrEventDescription3.setEditable(false);
		contentPane.add(txtrEventDescription3);	
		
		JTextArea txtrEventTime4 = new JTextArea();
		txtrEventTime4.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime4.setBounds(30, 220, 90, 35);
		txtrEventTime4.setBackground(Color.lightGray);
		txtrEventTime4.setEditable(false);
		contentPane.add(txtrEventTime4);
		
		JTextArea txtrEventDescription4 = new JTextArea();
		txtrEventDescription4.setText("Hvad fanden skal der ske!?");
		txtrEventDescription4.setBounds(175, 220, 600, 35);
		txtrEventDescription4.setBackground(Color.lightGray);
		txtrEventDescription4.setEditable(false);
		contentPane.add(txtrEventDescription4);	
		
		JTextArea txtrEventTime5 = new JTextArea();
		txtrEventTime5.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime5.setBounds(30, 260, 90, 35);
		txtrEventTime5.setBackground(Color.lightGray);
		txtrEventTime5.setEditable(false);
		contentPane.add(txtrEventTime5);
		
		JTextArea txtrEventDescription5 = new JTextArea();
		txtrEventDescription5.setText("Hvad fanden skal der ske!?");
		txtrEventDescription5.setBounds(175, 260, 600, 35);
		txtrEventDescription5.setBackground(Color.lightGray);
		txtrEventDescription5.setEditable(false);
		contentPane.add(txtrEventDescription5);	
		
		JTextArea txtrEventTime6 = new JTextArea();
		txtrEventTime6.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime6.setBounds(30, 300, 90, 35);
		txtrEventTime6.setBackground(Color.lightGray);
		txtrEventTime6.setEditable(false);
		contentPane.add(txtrEventTime6);
		
		JTextArea txtrEventDescription6 = new JTextArea();
		txtrEventDescription6.setText("Hvad fanden skal der ske!?");
		txtrEventDescription6.setBounds(175, 300, 600, 35);
		txtrEventDescription6.setBackground(Color.lightGray);
		txtrEventDescription6.setEditable(false);
		contentPane.add(txtrEventDescription6);	
		
		JTextArea txtrEventTime7 = new JTextArea();
		txtrEventTime7.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime7.setBounds(30, 340, 90, 35);
		txtrEventTime7.setBackground(Color.lightGray);
		txtrEventTime7.setEditable(false);
		contentPane.add(txtrEventTime7);
		
		JTextArea txtrEventDescription7 = new JTextArea();
		txtrEventDescription7.setText("Hvad fanden skal der ske!?");
		txtrEventDescription7.setBounds(175, 340, 600, 35);
		txtrEventDescription7.setBackground(Color.lightGray);
		txtrEventDescription7.setEditable(false);
		contentPane.add(txtrEventDescription7);	
		
		JTextArea txtrEventTime8 = new JTextArea();
		txtrEventTime8.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime8.setBounds(30, 380, 90, 35);
		txtrEventTime8.setBackground(Color.lightGray);
		txtrEventTime8.setEditable(false);
		contentPane.add(txtrEventTime8);
		
		JTextArea txtrEventDescription8 = new JTextArea();
		txtrEventDescription8.setText("Hvad fanden skal der ske!?");
		txtrEventDescription8.setBounds(175, 380, 600, 35);
		txtrEventDescription8.setBackground(Color.lightGray);
		txtrEventDescription8.setEditable(false);
		contentPane.add(txtrEventDescription8);	
		
		JTextArea txtrEventTime9 = new JTextArea();
		txtrEventTime9.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime9.setBounds(30, 420, 90, 35);
		txtrEventTime9.setBackground(Color.lightGray);
		txtrEventTime9.setEditable(false);
		contentPane.add(txtrEventTime9);
		
		JTextArea txtrEventDescription9 = new JTextArea();
		txtrEventDescription9.setText("Hvad fanden skal der ske!?");
		txtrEventDescription9.setBounds(175, 420, 600, 35);
		txtrEventDescription9.setBackground(Color.lightGray);
		txtrEventDescription9.setEditable(false);
		contentPane.add(txtrEventDescription9);	
		
		JTextArea txtrEventTime10 = new JTextArea();
		txtrEventTime10.setText("Start: 018:00\nEnd: 09:00 ");
		txtrEventTime10.setBounds(30, 460, 90, 35);
		txtrEventTime10.setBackground(Color.lightGray);
		txtrEventTime10.setEditable(false);
		contentPane.add(txtrEventTime10);
		
		JTextArea txtrEventDescription10 = new JTextArea();
		txtrEventDescription10.setText("Hvad fanden skal der ske!?");
		txtrEventDescription10.setBounds(175, 460, 600, 35);
		txtrEventDescription10.setBackground(Color.lightGray);
		txtrEventDescription10.setEditable(false);
		contentPane.add(txtrEventDescription10);	
		
	}
}
