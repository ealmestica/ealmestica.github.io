/*
 * Author: Elijah Almestica
 * CS-499 Computer Science Capstone Zoo Authentication System
 * Enhancement One: Software Design and Engineering 
 * Enhanced program by implementing a GUI design to display the greeting message for each profile respectively.
 * 
 * I polished the program by creating a FileName constructer to view all three greeting messages from each profile by only using one Class which I named FileName.
 * This helped me eliminate unnecessary Classes and shortened the code.
 * 
 * 
 * FileView.java - Class definition
 */

package authenticationsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.io.*;
import java.util.*;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileView {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Zoo Authorized View");
	private final JScrollPane scrollPane = new JScrollPane();
	
	FileView(String filename){
		
		label.setBounds(10,0,390,50);
		label.setFont(new Font(null,Font.PLAIN,14));
		
		frame.getContentPane().add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.getContentPane().setLayout(null);
		
		//Variables
		FileInputStream fileByteStream = null; // File input stream
		Scanner inFS = null;                   // Scanner object
		FileReader readTextFile = null;
		
		try {
			readTextFile = new FileReader(filename); //Opens text file to read
		} catch (FileNotFoundException e) {
			// Generated catch block
			e.printStackTrace();
		}
		Scanner fileReaderScan = new Scanner(readTextFile); //Scans file line by line
		String storeAllString="";
		while(fileReaderScan.hasNextLine())
		  {
		   String temp=fileReaderScan.nextLine()+"\n"; //Saves line as temp variable
		  
		   storeAllString=storeAllString+temp; //Append the temp variable to the over all string
		  }
		scrollPane.setBounds(20, 47, 360, 228);
		
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea(storeAllString); //Create text area of the file contents 
		scrollPane.setViewportView(textArea);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		frame.setVisible(true);
        
	}
}
