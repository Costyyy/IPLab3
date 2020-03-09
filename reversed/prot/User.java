package prot;

import com.prot.Application;

public abstract class User {
  public String name;
  
  public String password;
  
  public String email;
  
  public Application myApplication;
  
  public void resetPassword(String newPass) {}
  
  public void changeSettings() {}
}


/* Location:              /home/mike/IPLab3/!/prot/User.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */