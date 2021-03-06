package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.JTextComponent;

import logic.Controller;
import logic.Events;


public class WeekView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tableTime;
	private JTable tableMonday;
	private JTable tableTuesday;
	private JTable tableWednesday;
	private JTable tableThursday;
	private JTable tableFriday;
	private JTable tableSaturday;
	private JTable tableSunday;
	private JTextField txtHej;

	



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeekView frame = new WeekView();
			        frame.pack();
					frame.setSize(1000,750);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public WeekView() {
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
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(0, 76, 100, 20);
		contentPane.add(lblTime);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(75, 76, 100, 20);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(175, 76, 100, 20);
		contentPane.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setBounds(275, 76, 100, 20);
		contentPane.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(375, 76, 100, 20);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setBounds(475, 76, 100, 20);
		contentPane.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaturday.setBounds(575, 76, 100, 20);
		contentPane.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setBounds(675, 76, 100, 20);
		contentPane.add(lblSunday);
		
		// Oprettet tidsskemaet i kalenderen
		String[] timeOfDay = {""};
		Object [][] specificTime= 
		{
			{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"}	
		};	
		tableTime = new JTable(specificTime,timeOfDay);
		tableTime.setBounds(30, 100, 55, 600);
		tableTime.setAlignmentY(CENTER_ALIGNMENT);
		tableTime.setRowHeight(40);
		tableTime.setBackground(Color.lightGray);
		tableTime.setShowGrid(false);
		tableTime.setEnabled(false);
		contentPane.add(tableTime);
      

		
//		int minutes = 100;
//		Events.setEventName("Vøs3");
//		Events.setEventDuration(minutes);
//		String event1 = Events.getEventName();
//		for(int i=0;i<10;i++)
//		{
//			int minutes = 100;
//			
//		}
		
		//String col[]={"hej"};
//		DefaultTableModel tableModel = new DefaultTableModel (0,7);
//		 hej = new DefaultTableModel (1,1);
//		tableMonday = new JTable(tableModel);
//		Object[] objs1 = {"Mandag","Tirsdag","Onsdag", "Torsdag","Fredag","Lørdag", "Søndag"};
//		Object[] objs2 = {"test4","test 2"};
//		tableMonday.setRowHeight(1,20);
//		tableMonday.setRowHeight(2,60);
//		tableMonday.setRowHeight(3,200);
//		tableMonday.setRowHeight(40);
//		tableMonday.setRowHeight(0,300);
//		tableMonday.setBackground(Color.yellow);
//		tableModel.set
//		int number = tableMonday.getHeight();
//		tableMonday.setRowHeight(10);
		

//		tableMonday.add(objs1);
//		tableModel.addRow(objs1);
//		tableModel.addRow(objs1);
//		tableModel.addRow(objs2);
//		tableModel.addRow(objs2);
//		tableModel.addRow(objs1);
//		int number = tableModel.getRowCount();
//		System.out.println(number);

//		tableMonday = new JTable(eventsMonday,monday);
//		tableMonday.setBounds(100, 100, 700, 600);
////		tableMonday.setRowHeight(40);
//		tableMonday.setBackground(Color.lightGray);
//		tableMonday.setShowGrid(false);
//		tableMonday.setEnabled(false);
//		contentPane.add(tableMonday);
		
		
		
		

//		tableModel.addRow(objs);
		
//		tableMonday = new JTable(monday);
		
//		 Oprettet mandag i kalenderen
		String[] monday = {"Monday"};
		Object [][] eventsMonday= 
		{
				{"4"},{null},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};		
		
		tableMonday = new JTable(eventsMonday,monday);
				tableMonday.setBounds(100, 100, 100, 600);
				tableMonday.setRowHeight(40);
				tableMonday.setBackground(Color.lightGray);
				tableMonday.setShowGrid(false);
				tableMonday.setEnabled(false);
				contentPane.add(tableMonday);

//		 Oprettet tirsdag i kalenderen
		String[] tuesday = {""};
		Object [][] eventsTuesday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		tableTuesday = new JTable(eventsTuesday,tuesday);
		tableTuesday.setBounds(200, 100, 100, 600);
		tableTuesday.setRowHeight(40);
		tableTuesday.setBackground(Color.lightGray);
		tableTuesday.setShowGrid(false);
		tableTuesday.setEnabled(false);
		contentPane.add(tableTuesday);
		
//		 Oprettet onsdag i kalenderen	
		String[] wednesday = {""};
		Object [][] eventsWednesday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		tableWednesday = new JTable(eventsWednesday,wednesday);
		tableWednesday.setBounds(300, 100, 100, 600);
		tableWednesday.setRowHeight(40);
		tableWednesday.setBackground(Color.lightGray);
		tableWednesday.setShowGrid(false);
		tableWednesday.setEnabled(false);
		contentPane.add(tableWednesday);
		
//		 Oprettet torsdag i kalenderen
		String[] thursday = {""};
		Object [][] eventsThursday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		tableThursday = new JTable(eventsThursday,thursday);
		tableThursday.setBounds(400, 100, 100, 600);
		tableThursday.setRowHeight(40);
		tableThursday.setBackground(Color.lightGray);
		tableThursday.setShowGrid(false);
		tableThursday.setEnabled(false);
		contentPane.add(tableThursday);
		
//		 Oprettet fredag i kalenderen
		String[] friday = {""};
		Object [][] eventsFriday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};		
		tableFriday = new JTable(eventsFriday,friday);
		tableFriday.setBounds(500, 100, 100, 600);
		tableFriday.setRowHeight(40);
		tableFriday.setBackground(Color.lightGray);
		tableFriday.setShowGrid(false);
		tableFriday.setEnabled(false);
		contentPane.add(tableFriday);
		
//		 Oprettet lørdag i kalenderen
		String[] saturday = {""};
		Object [][] eventsSaturday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};		
		tableSaturday = new JTable(eventsSaturday,saturday);
		tableSaturday.setBounds(600, 100, 100, 600);
		tableSaturday.setRowHeight(40);
		tableSaturday.setBackground(Color.lightGray);
		tableSaturday.setShowGrid(false);
		tableSaturday.setEnabled(false);
		contentPane.add(tableSaturday);
		
//		 Oprettet søndag i kalenderen
		String[] sunday = {""};
		Object [][] eventsSunday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		tableSunday = new JTable(eventsSunday,sunday);
		tableSunday.setBounds(700, 100, 100, 600);
		tableSunday.setRowHeight(40);
		tableSunday.setBackground(Color.lightGray);
		tableSunday.setShowGrid(false);
		tableSunday.setEnabled(false);
		contentPane.add(tableSunday);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(700, 600, 100, 50);
		contentPane.add(btnExit);
		
		txtHej = new JTextField();
		txtHej.setText("Hej");
		txtHej.setBounds(1010, 76, 134, 28);
		contentPane.add(txtHej);
		txtHej.setColumns(10);
		
		JLabel lblOpretNyKalender = new JLabel("Opret ny kalender");
		lblOpretNyKalender.setBounds(912, 48, 147, 16);
		contentPane.add(lblOpretNyKalender);
		
		JLabel lblIndtastNavnP = new JLabel("Indtast navn på kalender:");
		lblIndtastNavnP.setBounds(833, 80, 165, 16);
		contentPane.add(lblIndtastNavnP);
		
		JButton btnOpretKalender = new JButton("Opret kalender");
		btnOpretKalender.setBounds(857, 106, 237, 29);
		contentPane.add(btnOpretKalender);
		btnOpretKalender.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) 
			{
				String calendarName =txtHej.getText();
				boolean createdCalendar;
				createdCalendar = Controller.createCalendar(calendarName,"1", "casv13ad", "1");
				if (createdCalendar)
				{
					System.out.println("succes");
				}
				else
				{
					System.out.println("Chaos");
				}
		
				
			}
		});
	
	
	}
}
