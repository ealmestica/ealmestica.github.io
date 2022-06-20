/*
 * Author: Elijah Almestica
 * CS-499 Computer Science Capstone Project: Zoo Authentication System
 * Enhancement Two: Algorithms and Data Structure
 * Enhanced program by implementing the SHA512 algorithm to improve security and removed the less secure MD5 hash algorithm.
 *
 * PasswordDigest.java - Class definition
 */
package authenticationsystem;

import java.security.MessageDigest;

// PasswordDigest.java - Class definition
public class PasswordDigest {

// Private internal fields
   private String password;
   private String hash;
    
// Default constructor
   public void PasswordDigest() {
      password = "none";
      hash = "none";
   }
// Public mutator to set password
   public void setPassword(String inputPassword) {
      password = inputPassword;
   }

// Public accessors to get password 
   public String getPassword() {
      return password;
   }

//SHA512 Algorithm (new update to the PasswordDigest Class) replaced the less secure MD5 algorithm
   
   public String getHash() throws Exception {
	   String original = password;  //Replace "password" with the actual password input by the user
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(original.getBytes());
		byte[] digest = md.digest(original.getBytes());
		StringBuffer sb = new StringBuffer();
	    for(int i=0; i < digest.length ; i++) {
	    	 sb.append(Integer.toString((digest[i] &0xff) + 0x100, 16).substring(1));
	     }
	    hash = sb.toString();
	    System.out.println(hash); //I did this intentionally to output the SHA512 hash for testing purposes.
	    return hash;
   }
}


