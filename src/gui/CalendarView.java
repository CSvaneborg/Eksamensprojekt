package gui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;


public class CalendarView extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarView frame = new CalendarView();
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
	public CalendarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(84, 74, 100, 20);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(196, 76, 100, 20);
		contentPane.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setBounds(308, 76, 100, 20);
		contentPane.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(420, 76, 100, 20);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setBounds(532, 76, 100, 20);
		contentPane.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaturday.setBounds(644, 76, 100, 20);
		contentPane.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setBounds(756, 76, 100, 20);
		contentPane.add(lblSunday);
		
		table = new JTable();
		table.setBounds(84, 133, 772, 99);
		contentPane.add(table);
	}
}
