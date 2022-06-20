/*
 * Author: Elijah Almestica
 * CS-499 Computer Science Capstone: Zoo Authentication System
 * Enhancement One: Software Design and Engineering 
 * Enhanced program by implementing a GUI design Login screen using Window Builder Swing Designer 
 * 
 * I polished the program by removing the switch statements from the previous code that allow to switch to different greetings based on the correct credentials. 
 * I realized this design was inefficient and poor coding as it is depended on the first letter of the profile such as a, v, and z.
 * With the revision code it calls an instance of the FileView class in a method such as the following: FileView("C:\\" + credProfile + ".txt");

 * AuthenticationSystemUI.java - Class definition
 */

package authenticationsystem;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Projections;

public class AuthenticationSystemUI {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	
	//Initialized variables
    Scanner scnr = new Scanner(System.in);
    FileInputStream fileByteStream = null; // File input stream
    Scanner inFS = null;                   // Scanner object
    PasswordDigest userPassword = new PasswordDigest();
    String option = "1";
    boolean end = false;
    String username = " ";
    String password = " ";
    boolean credentialMatch = false;
    int userAttempts = 0;
    Scanner credentialInput = null;
  
 //Variables useful for matching credentials
    String credentialRecord = " ";
    String credUsername = " ";
    String credSHA512 = " ";
    String credProfile = " ";

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(String[] args) throws Exception {  
				
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthenticationSystemUI window = new AuthenticationSystemUI();
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
	public AuthenticationSystemUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			    	  
		frame = new JFrame();
		frame.setBounds(200, 200, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelTittle = new JLabel("Zoo Authentication System");
		labelTittle.setBounds(195, 31, 158, 14);
		frame.getContentPane().add(labelTittle);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setBounds(141, 94, 61, 14);
		frame.getContentPane().add(labelUsername);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setBounds(141, 158, 61, 14);
		frame.getContentPane().add(labelPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(245, 91, 200, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(245, 155, 200, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {//Added an action listener to the button to preform an action when it clicks 
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				// Method mutator from PasswordDigest class to set password                     
	               userPassword.setPassword(password);
	                     
	            // Read the Credentials from the database     
	               try {
	            	   //connect mongo client
	            	   MongoClient mongoClient = new MongoClient("localhost");
	            	   //get mongo database
	            	   MongoDatabase db = mongoClient.getDatabase("Credentials");
	            	   //get hash and role attributed from collection where username is equal to the inputted username
	            	   Document item = db.getCollection("Roles").find(Filters.eq("username", username)).projection(Projections.include("hash", "role")).first();
	            	   //get string value of hash attribute
	            	   credSHA512 = item.getString("hash");
	            	   //get string value of Role attribute
	            	   credProfile = item.getString("role");
	            	   //close mongo client
	            	   mongoClient.close();	            	   
	            	   
				} catch (Exception e1) {
					// Auto-generated catch block
					e1.printStackTrace();
				}
	              
	               try {
						if (credSHA512.equals(userPassword.getHash())) {
						     credentialMatch = true;
						     userAttempts = 4;
						  }
						  else {
						     credentialMatch = false;
						  }
					} catch (Exception e1) {
						// Auto-generated catch block
						e1.printStackTrace();
					}
	               
	               		// Displays dialog screen message to let you know appropriate credentials are correct(equals true)
	                  if (credentialMatch == true) {
	                	  JOptionPane.showMessageDialog(null, "Login Credentials correct");
		                  frame.dispose();
		                  new FileView("C:\\" + credProfile + ".txt");//Use string concatenation to create file path
	                	  
	                  }
	                  // Displays dialog screen message to let you know credentials is invalid	
	              
	                  else {
	                	JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
	  					txtPassword.setText(null);
	  					txtPassword.setText(null);   
	                  }
				
			}

			private void println(String nextLine) {
				// Auto-generated method stub
				
			}
		});
		btnLogin.setBounds(195, 227, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		//Exits login screen upon clicking the exit button
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "Confirm if you want to exit", "Zoo Authentication System",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
			}
		});
		btnExit.setBounds(294, 227, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(91, 64, 400, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(91, 200, 400, 2);
		frame.getContentPane().add(separator_1);
	}

}
