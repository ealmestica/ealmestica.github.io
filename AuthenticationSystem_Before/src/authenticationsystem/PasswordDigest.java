/*
 * Elijah Almestica - IT145 
 * 7-1 Final Project: Zoo Authentication System
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

// Public accessor to get MD5 hash
   public String getHash() throws Exception {
      String original = password;
      MessageDigest md = MessageDigest.getInstance("MD5");
      md.update(original.getBytes());
      byte[] digest = md.digest();
      StringBuffer sb = new StringBuffer();
      for (byte b : digest) {
         sb.append(String.format("%02x", b & 0xff));
      }
      hash = sb.toString(); // Assigns the hash string to variable hash
      return hash; // Returns hash
   }
}