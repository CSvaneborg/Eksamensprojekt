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
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;


public class CalendarView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable tableTime;
	



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarView frame = new CalendarView();
			        frame.pack();
					frame.setSize(1000,750);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalendarView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1500);	
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDkCalendar = new JLabel("DØK CALENDAR");
		lblDkCalendar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDkCalendar.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblDkCalendar.setBounds(75, 10, 750, 50);
		contentPane.add(lblDkCalendar);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(0, 76, 100, 20);
		contentPane.add(lblTime);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonday.setBounds(80, 76, 100, 20);
		contentPane.add(lblMonday);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblTuesday.setBounds(180, 76, 100, 20);
		contentPane.add(lblTuesday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		lblWednesday.setBounds(280, 76, 100, 20);
		contentPane.add(lblWednesday);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		lblThursday.setBounds(380, 76, 100, 20);
		contentPane.add(lblThursday);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriday.setBounds(480, 76, 100, 20);
		contentPane.add(lblFriday);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaturday.setBounds(580, 76, 100, 20);
		contentPane.add(lblSaturday);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		lblSunday.setBounds(680, 76, 100, 20);
		contentPane.add(lblSunday);
		
		String[] timeOfDay = {""};
		Object [][] specificTime= 
		{
			{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
			
		};
			
		tableTime = new JTable(specificTime,timeOfDay);
		tableTime.setBounds(10, 100, 75, 600);
		tableTime.setRowHeight(40);
		tableTime.setAlignmentY(CENTER_ALIGNMENT);
		contentPane.add(tableTime);
		
		String[] monday = {"Monday"};
		Object [][] eventsMonday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};		
		table = new JTable(eventsMonday,monday);
		table.setBounds(100, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
		
		String[] tuesday = {"Tuesday"};
		Object [][] eventsTuesday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		table = new JTable(eventsTuesday,tuesday);
		table.setBounds(200, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
		
		String[] wednesday = {"Wednesday"};
		Object [][] eventsWednesday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		table = new JTable(eventsWednesday,wednesday);
		table.setBounds(300, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
	
		String[] thursday = {"Thursday"};
		Object [][] eventsThursday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		table = new JTable(eventsThursday,thursday);
		table.setBounds(400, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
		
		
		String[] friday = {"Friday"};
		Object [][] eventsFriday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};		
		table = new JTable(eventsFriday,friday);
		table.setBounds(500, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
		
	
		String[] saturday = {"Saturday"};
		Object [][] eventsSaturday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};		
		table = new JTable(eventsSaturday,saturday);
		table.setBounds(600, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
		
		
		String[] sunday = {"Sunday"};
		Object [][] eventsSunday= 
		{
				{"8:00"},{"9:00"},{"10:00"},{"11:00"},{"12:00"},{"13:00"},{"14:00"},{"15:00"},{"16:00"},{"17:00"},{"18:00"},{"19:00"},{"20:00"},{"21:00"},{"22:00"},
		};
		table = new JTable(eventsSunday,sunday);
		table.setBounds(700, 100, 100, 600);
		table.setRowHeight(40);
		contentPane.add(table);
		
		
//		JScrollBar scrollBar = new JScrollBar();
//		scrollBar.setBounds(792, 144, 15, 400);
//		contentPane.add(scrollBar);
		
	}
}
